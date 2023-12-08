Запуск Spring Boot в Amazon Linux VPS
=====================================

## Введение

VPS (англ. virtual private server) или VDS (англ. virtual dedicated server), виртуальный выделенный сервер — вид сервера, root-доступ к которому его клиент получает посредством удалённого интернет соединения. В плане управления операционной системой по большей части соответствует физическому выделенному серверу. В частности: root-доступ, собственные IP-адреса, порты, правила фильтрования и таблицы маршрутизации.

Статья: [Обзор популярных VPS серверов](https://habr.com/ru/articles/686238/)

Как получить?

Статья: [Как получить бесплатный VPS (VDS) сервер навсегда](https://seopulses.ru/kak-poluchit-besplatniy-vps-vds-server-navsegda/)

Результат: регистрация учётной записи в Google Cloud (или Oracle, или Amazon)

## Создание VM Amazon

Создаём новый виртуальный сервер в [Amazon Cloud](https://aws.amazon.com):
Services -> Compute -> EC2 -> Launch instance

Параметры:
- Name: (пишем что хотим)
- Application and OS Images: Amazon Linux (по умолчанию)
- Instance type: (по умолчанию)
- Key pair (login): Create new key pair
  - Key pair name: amazon-linux-vps-key (рекомендуется)
  - Key pair type: RSA
  - Private key file format: .pem
  Созданный и загруженный файл ключа поместить в папку ~/.ssh
- Network settings: Create security group
  - x Allow SSH traffic from (Anywhere)
  - x Allow HTTPS traffic from the internet
  - x Allow HTTPS traffic from the internet
- Configure storage: (8Gb по умолчанию, не больше 30)

Статья: [Руководство по AWS: настройка экземпляра EC2 для развертывания приложений Java](https://medium.com/nuances-of-programming/%D1%80%D1%83%D0%BA%D0%BE%D0%B2%D0%BE%D0%B4%D1%81%D1%82%D0%B2%D0%BE-%D0%BF%D0%BE-aws-%D0%BD%D0%B0%D1%81%D1%82%D1%80%D0%BE%D0%B9%D0%BA%D0%B0-%D1%8D%D0%BA%D0%B7%D0%B5%D0%BC%D0%BF%D0%BB%D1%8F%D1%80%D0%B0-ec2-%D0%B4%D0%BB%D1%8F-%D1%80%D0%B0%D0%B7%D0%B2%D0%B5%D1%80%D1%82%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9-java-3a0b3f91a93e)

## Создание VM Google

Создаём новый виртуальный сервер в [Google Cloud](https://cloud.google.com):
Navigation menu -> Compute Engine -> VM instances  -> CREATE INSTANCE

Параметры:
- Series: E2
- Machine type: e2-micro
- Boot disk:
  - operating system: CentOS
  - version: CentOS 7
- Firewall:
  - x Allow HTTP traffic
  - x Allow HTTPS traffic

## Запуск HelloCRUD

Установка файлового менеджера mc

```
sudo yum install mc
```

Установка JDK-11 (Google Cloud):

```
sudo yum install java-11-openjdk-devel
```

Устанавливаем JDK-11 (Amazon Cloud):

```
sudo yum install java-11-amazon-corretto-devel.x86_64
```

Копируем приложение, собранное в виде jar: hello-crud-0.0.1-SNAPSHOT.jar и запускаем его командой:

```
java -jar hello-crud-0.0.1-SNAPSHOT
```

Открываем tcp порт 8080 добавляя правило в Set up firewall rules (Google Cloud). В Amazon Cloud добавляем правило в соответствующую Security Group (Services -> Security Groups -> Выбрать группу -> Actions -> Edit inbound rules) Затем обращаемся к нашему запущенному приложению:

```
http://<ip адрес нашей VM>:8080/api/event/all
```

## Запуск HelloCRUD как службы

Запускаем mc c правами администратора:

```
sudo mc
```

Копируем файл hello-crud-0.0.1-SNAPSHOT.jar в папку /opt/hello-crud/ и создаём Symbolic link на этот файл с именем hello-crud.jar

Создаём текстовый файл hello-crud.service (см ниже) и помещаем его в папку /etc/systemd/system/

```
[Unit]
Description=Hello-REST
After=syslog.target

[Service]
User=ec2-user
ExecStart=/opt/hello-rest/hello-rest.jar
SuccessExitStatus=143

[Install]
WantedBy=multi-user.target
```

Запускаем наше приложение как службу командой (ниже) и проверяем статус.

```
sudo systemctl start hello-crud.service
```

- start: запуск службы
- stop: остановка службы
- restart: перезапуск службы
- status: просмотр статуса службы

## Установка postgresql-server

Для установки и настройки PostgreSQL для Google Cloud используем статью [How to Install PostgreSQL on CentOS 7](https://www.hostinger.com/tutorials/how-to-install-postgresql-on-centos-7/), вторую часть (How to Install PostgreSQL on CentOS 7 Using the CentOS Repositories)

Для установки PostgreSQL в Amazon Linux используем статью [How to Install PostgreSQL 15 on Amazon Linux 2023: A Step-by-Step Guide](https://hbayraktar.medium.com/how-to-install-postgresql-15-on-amazon-linux-2023-a-step-by-step-guide-57eebb7ad9fc)

Установка в Google Cloud (CentOS 7):

```
sudo yum install postgresql-server
```

Установка в Amazon Linux:

```
sudo yum install postgresql15.x86_64 postgresql15-server
```

Инициализация:

```
sudo postgresql-setup initdb
```

Запуск и включение сервиса:

```
sudo systemctl start postgresql.service
sudo systemctl enable postgresql.service
```

Подключаемся к серверу:

```
sudo -u postgres psql
```

Меняем пароль пользователя postgres и создаём базу данных:

```
ALTER USER postgres PASSWORD 'root';
CREATE DATABASE cohort29;
```

Редактируем файл pg_hba.conf согласно совету [PostgreSQL - FATAL: Ident authentication failed for user](https://stackoverflow.com/questions/50085286/postgresql-fatal-ident-authentication-failed-for-user) и после этого перезапускаем postgresql:

```
sudo systemctl restart postgresql.service
```

## Развёртыванием HelloLiquibase

Копируем приложение, собранное в виде jar: hello-liquibase-0.0.1-SNAPSHOT.jar, при этом файл application.yaml не должен быть в составе jar, он размещается отдельно в папке /config. Подробнее об этом в статье [Spring Properties File Outside jar](https://www.baeldung.com/spring-properties-file-outside-jar). Запускаем приложение:

```
java -jar hello-liquibase-0.0.1-SNAPSHOT.jar
```

## Развертывание HelloLiquibase как службы

Читаем статью [Spring Boot Application as a Service](https://www.baeldung.com/spring-boot-app-as-a-service), учитывая то, что в CentOS используется Systemd. Создаём файл /etc/systemd/system/hello-liquibase.service со следующим содержимым:

```
[Unit]
Description=Hello-Liquibase
After=syslog.target

[Service]
User=opc
ExecStart=/opt/hello-liquibase/hello-liquibase.jar
SuccessExitStatus=143

[Install]
WantedBy=multi-user.target
```

Обращаем внимание на изменения в pom.xml файле проекта (create jar executable, exclude application.yaml from jar), пересобираем jar проекта с этими изменениями и загружаем его на наш сервер. По умолчанию файл попадает в папку /home/<linux-user-name>. Устанавливаем признаки execute для нашего jar файла (744):

```
chmod u+x hello-liquibase-0.0.1-SNAPSHOT.jar
```

Перемещаем наш jar файл в папку /opt/hello-liquibase/ (не забываем про папку config с содержимым) и создаём символическую ссылку:

```
sudo ln -s /opt/hello-liquibase/hello-liquibase-0.0.1-SNAPSHOT.jar /opt/hello-liquibase/hello-liquibase.jar
```

Запускаем наше приложение как службу:

```
sudo systemctl start hello-liquibase.service
```

Сервис также можно останавливать (команда stop), перезапускать (restart) и проверять его статус (status)

## Использование ssh ключей для доступа

Согласно google документации https://cloud.google.com/compute/docs/connect/create-ssh-keys генерируем пару ключей, например для Windows 10 команда такая (в командной строке):

```
ssh-keygen -t rsa -f C:\Users\<windows-user>\.ssh\<ssh-key-name> -C <google-user> -b 2048
```

Затем заходим в консоль, находим нашу VM, переходим в режим редактирования и добавляем публичный ключ из сгенерированной нами пары. Теперь мы можем использовать сторонний ssh-клиент (PuTTY, Tabby, MobaXterm и другие) для ssh доступа к нашему серверу