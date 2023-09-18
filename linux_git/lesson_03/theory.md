## Подход к именованию веток (тематические)

```
payments
feature/login
bugfix1
issue5
ticket555
andreibakhtinov/payments
andreibakhtinov/task8
```

## Создание новой ветки

```bash
# вариант 1
git checkout main
git checkout -b andreibakhtinov/task88

# вариант 2
git checkout -b payments main
```

## Вариант коммита

```bash
# вариант 1
git add .
git commit -m 'update'

# вариант 2 (с индексацией изменений во всех отслеж. файлах)
git commit -am 'update'
```

## Модели совместной разработки

1. **С доступом на запись (shared repo model)**
    1. лучше подходит для небольших организованных команд с приватными проектами (репо)
2. **Без доступа на запись (Fork and pull model)**
    1. лучше подходит для проектов с открытым исходным кодом и неопределенным кругом разработчиков

## Общий порядок (схема) работы в режиме с доступом на запись к репо

1. Открыть имеющийся репо (или создать новый)
2. Добавить членов команды
3. Клонировать репо (скачать на компьютер)
4. Открыть репо (как проект в любимом редакторе)
5. Создать отдельную ветку **под задачу** и переключиться на нее
    1. `git checkout -b my_branch`
6. Вносим изменения в код
7. Фиксируем изменения
    1. `git add .`
    2. `git commit -m 'task 1'`
8. Выгружаем свою ветку на **GitHub**
    1. `git push -u origin branch_name`
9. Оформляем “заявку на улучшение” (pull request, **PR**, запрос слияния)
10. Выполнить слияние на **GitHub**
11. Выгрузить изменения с **GitHub**
    1. `git checkout main`
    2. `git pull`

## Fork

- копия репо, созданная на GitHub

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/b0371ef0-af44-49aa-9833-96993d920646/Untitled.png)

## Просмотр текущей привязки

```bash
git remote -v
```

**Пример. Продолжение работы коллеги**

1. Найти ветку с работой коллеги на GitHub
2. Выгрузить все ветки себе на компьютер
    1. `git pull --all`
3. Создать свою ветку на основе ветки коллеги
    1. `git checkout -b ivanivanov/payments origin/andreibakhtinov/payments`
4. Внести правки
5. Фиксация и выгрузка
6. Оформление **Pull Request**