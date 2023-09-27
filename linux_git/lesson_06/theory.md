## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

## Решение проблем (ОС Windows)

- открыть `cmd` (командный интерфейс)
- `wsl --update`

## Базовые компоненты любого проекта

- `FE` интерфейс
- `BE` бизнес-логика
- `DB` хранилище
- `Deployment` развертывание (напр., с помощью **Docker**)

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/c57b05f6-1e90-4a13-946e-18a9f931dd62/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/e913f9f3-2737-4204-b4ef-252ec3e43b87/Untitled.png)

## Основные термины

- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, ключая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**
    - определяет код и зависимости (состав), которые должны быть включены в образ
- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker

## Основные команды

для пользователей Windows: команды необходимо запускать в **PowerShell**

- `docker version` просмотр версии
- `docker login` авторизация на **Docker Hub** (и проверка)
- `docker run -it ubuntu bash` запуск оболочки `bash` в режиме песочницы
- `docker build -t web-app .` создать образ на основе `Dockerfile` из текущего каталога
    - `docker build -t web-app:1.0.0 .`
    - `docker build --platform linux/amd64 -t web-app` для генерации на `MacOS`
- `docker images` просмотр имеющихся образов
- `docker run image_name` запуск образа
    - `docker run -p host_port:container_port web-app`
    - `**docker run -p 5000:5000 web-app**`
    - `docker run -p 5000:5000 leonzuev/webtest` запуск стороннего образа
- `docker tag image_name docker_hub_username/image_name` привязка к репо на Docker Hub
    - `**docker tag web-test andreibakhtinov/web-test**`
    - `docker tag image_name:version dockerhub_username/image_name:version`
- `docker push docker_hub_username/image_name` выгрузить образ на **Docker Hub**
    - `**docker push andreibakhtinov/web-test**`

## Дополнительные команды (для выполнения в песочнице)

- `apt update` получить обновления
- `apt install nano` установить nano
- `apt install vim wget` установить `vim` и `wget`
- `wget URL` скачать файл
- `vim filename` открыть текстовый файл на редактирование
- `nano filename` открыть текстовый файл на редактирование

## Базовый порядок с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать образ (на основе `Dockerfile`)
4. Запуск контейнера на основе образа

## Тестовый проект #1 (на Python)

```python
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, ANDREI!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```docker
## Dockerfile

# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Открытие проекта #1 в браузере

```docker
http://127.0.0.1:5000
```

## Семантическое версионирование (`SemVer`)

- Методология (де-факто пром/стандарт) нумерации версий проекта (версионирование)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/d04ccb23-6952-4021-adf0-dca94aa1632f/Untitled.png)

### v`MAJOR`.`MINOR`.`PATCH`

`PATCH` - исправление багов, прочие мелкие правки

`MINOR` - улучшения (без нарушения обратной совместимости)

`MAJOR` - координальные изменения (с нарушением обратной совместимости)

**Контрольные вопросы по `SemVer`**

1. Какой будет след/версия, если был добавлен новый функционал?
    
    **`v3.9.44`  → `v3.10.0`**
    
2. Какой будет след/версия, если было исправлено три бага?
**`v8.2.0` → `v8.2.1`**
3. Какой будет след/версия, если приложение было полностью переработано?
**`v5.2.2` → `v6.0.0`**

**Задача. Создать новый проект на основе файла `[app.py](http://app.py)` и выгрузить его на Docker Hub**

## Тестовый проект #2 (на Java)

`git clone https://github.com/spring-projects/spring-petclinic.git`

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

**Запуск проекта `petclinic` (проект #2)**

```bash
docker run -p 8080:8080 petclinic
```

**Открытие в браузере проект #2**

```bash
http://127.0.0.1:8080/
```

## Ссылки

- [основы VIM](https://beget.com/ru/kb/how-to/other/osnovy-raboty-s-redaktorom-vim)
- [Что такое **Docker**](https://ru.wikipedia.org/wiki/Docker)
- [базовые команды **Docker**](https://www.edureka.co/blog/docker-commands/)
- [SemVer](https://semver.org/lang/ru/)