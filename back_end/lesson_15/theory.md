Проект: обсуждение структуры БД
===============================

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
1. Список сканируемых сайтов:  SourceConfig (source_config)
2. Список полученных новостей: Event (events)
3. Индекс текстов новостей:    Index (indexes)
4. Список администраторов:     User (users)

## План работа, день #2

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
   - NovynyLive	https://www.it.novyny.live/ru/news
4. Исследуем парсер jsoup https://www.baeldung.com/java-with-jsoup
