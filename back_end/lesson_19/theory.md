Проект: новостной агрегатор
===========================

## План работы, день #1

1. Обсуждение проекта, выбор проекта
2. Обсуждение структуры таблиц БД
3. Создание java проекта

Поисковая система   https://www.unisender.com/ru/glossary/chto-takoe-poiskovaya-sistema/
Новостной агрегатор https://ru.wikipedia.org/wiki/Новостной_агрегатор/
Три этапа работы поисковой системы (новостного агрегатора):
1. Сканирование интернет
2. Обработка и сохранение полученной информации
3. Представление сохраненной информации пользователю

Таблицы БД:
1. Список сканируемых сайтов:	SourceConfig (source_config)
2. Список полученных новостей:	Event (events)
3. Индекс текстов новостей:		Index (indexes)
4. Список администраторов:		User (users)

## План работы, день #2

1. Дополняем pom (swagger, jsoup)
2. Создаём и подключаем базу данных (news_crawler)
3. Пишем базовый код (WebController, WebService), определяемся с полями
4. Обсуждаем список сканируемых сайтов
   - Медуза		meduza.io
   - Холод		holod.media
   - Вёрстка	verstka.media
   - СВТВ		svtv.org
   - Дождь		tvrain.tv
   - BBC		www.bbc.com/russian
   - ItWorld	https://www.it-world.ru/news
   - NovynyLive	https://it.novyny.live/ru/news/
   - DevBy		https://devby.io/news
4. Исследуем парсер jsoup https://www.baeldung.com/java-with-jsoup

## План работы, день #3

1. Доработка сканирования сайта ItWorld (www.it-world.ru/news)
2. Сканирование сайта DevBy https://devby.io/news

## План работы, день #4

1. Изучение интерфейса SmartLifecycle (CrawlerExecutor)
2. Создание таблиц source_config и events
3. Создание объекта по имени класса, reflection

## План работы, день #5

1. Добавление поля disabled в класс SourceConfig
2. Пакет common c классом DateTimeUtils
3. Выделение классов чтения и парсинга в пакет executor
4. Модификация интерфейса Execute
5. Написание метода execute() класса ExecItWorld
6. Создание EventRepository и EventService

## План работы, день #6

1. Небольшие исправления в ExecItWorld
2. Пишем SourceConfigController и SourceConfigService
3. Пишем EventController и дополняем EventService
4. Добавляем парсер https://it.novyny.live ExecItNovyny
