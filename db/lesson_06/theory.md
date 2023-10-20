## Ссылки

- [пример БД “онлайн-музыка”](https://dbdiagram.io/d/online_music-6532a9e2ffbf5169f01f9f38)

![Screenshot from 2023-10-20 19-55-14.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/8f5f14d7-3168-4b76-846b-5cf0428989e5/Screenshot_from_2023-10-20_19-55-14.png)

**Примеры запросов**

```jsx
// Вывести треки с продолжительностью от 5 мин
db.tracks.find(
    { duration_secs: { $gte: 5 * 60 } }
)

// Вывести юзеров из USA
db.users.find(
    { country: 'USA' } // filter
)

// Вывести страну юзера 1
db.users.findOne(
    { _id: 1 },
    { country: 1, _id: 0 }
)

// вывести имена юзеров из Germany
db.users.find(
    { country: 'Germany' }, // filter
    { fullname: 1, _id: 0 } // projection
)

// Заблокировать юзеров из France
db.users.updateMany(
    { country: 'France' }, // filter
    {
        $set: {
            is_blocked: true
        }
    } // action
)

// Вывести незаблокированных юзеров
db.users.find(
    { is_blocked: { $ne: true } } // filter
)

// Разблокировать всех юзеров
db.users.updateMany(
    {}, // filter
    { // action
        $unset: {
            is_blocked: null
        }
    }
)

// Разблокировать юзера 2 и установить ему произвольный email-адрес
db.users.updateOne(
    { _id: 2 },
    {
        $unset: { is_blocked: null },
        $set: { email: 'user@example.org' }
    }
)
```

## Подсчет ко-ва документов / метод `countDocuments()`

- один аргумент
    - `фильтр`
- возвращает `целое число` - ко-во совпадений

**Пример**

```jsx
db.users.countDocuments(
    { country: 'Germany' }
)
```

**Пример. Запрос на авторизацию (аутентификацию) юзера**

```jsx
db.users.countDocuments(
    {
        email: email,
        password: password,
        is_blocked: { $ne: true }
    }
)
```

**Задача. Вывести ко-во заблокированных юзеров не из `China`**

```jsx
db.users.countDocuments(
    {
        country: { $ne: 'China' },
        is_blocked: true
    }
)
```

**Задача. Вывести ко-во треков с продолжительностью до `30` мин (вкл.)**

```jsx
db.tracks.countDocuments(
    { duration_secs: { $lte: 30 * 60 } }
)
```

**Пример. Использование `$in`**

```jsx
// Вывести юзеров из `Germany` и `France`
db.users.find(
    {
        country: { $in: ['Germany', 'France'] }
    }
)
```

**Пример. Использование `$nin` (not in)**

```jsx
db.users.find(
    {
        country: { $nin: ['USA', 'China'] }
    }
)
```

**Задача. Вывести названия треков `1` и `3`**

```jsx
db.tracks.find(
    { _id: { $in: [1, 3] } },
    { title: 1, _id: 0 }
)
```

**Пример. Увеличить баланс всех юзеров на `20` EUR**

```jsx
db.users.updateMany(
    {},
    {
        $inc: { balance: 20 }
    }
)
```

**Задача. Уменьшить баланс юзеров из `France` на `5` EUR**

```jsx
db.users.updateMany(
    { country: 'France' }, // filter
    { $inc: { balance: -5 } } action
)
```

**Задача. Вывести ко-во незаблокированных юзеров с положительным балансом**

```jsx
db.users.countDocuments(
    {
        is_blocked: { $ne: true },
        balance: { $gt: 0 }
    }
)
```

**Задача. Заблокировать юзеров из `USA` с бансом от `5` EUR**

```jsx
db.users.updateMany(
    {
        country: 'USA',
        balance: { $gte: 5 }
    },
    {
        $set: { is_blocked: true }
    }
)
```

**Задача. Для всех заблокированных юзеров из `USA` с балансом до `1000` EUR необходимо:**

- их разблокировать
- увеличить баланс на `100` EUR

```jsx
db.users.updateMany(
    {
        country: 'USA',
        is_blocked: true,
        balance: { $lte: 1000 }
    },
    {
        $unset: { is_blocked: null },
        $inc: { balance: 100 }
    }
)
```

**Пример. Увеличить баланс всех юзеров на `15%`**

```jsx
db.users.updateMany(
    {},
    {
        $mul: { balance: 1.15 }
    }
)
```

**Задача. Уменьшить баланс всех незаблокированных юзеров с положительным балансом на `1%`**

```jsx
db.users.updateMany(
    {
        is_blocked: { $ne: true },
        balance: { $gt: 0 }
    },
    {
        $mul: { balance: .99 }
    }
)
```

**Задача. Разблокировать юзера `4` и уменьшить его баланс на `0.5%`**

```jsx
db.users.updateOne(
    {
        _id: 4
    },
    {
        $unset: { is_blocked: null },
        $mul: { balance: .995 }
    }
)
```

## Работа с массивами в MongoDB

**Базовые операторы работы с массивами**

- `$push` добавить значение в **массив**
- `$pull` удалить значение из массива
- `$pullAll` удалить несколько значений из массива
- `$addToSet` добавить значение в **множество**
- `$each` добавить список значений в массив или множество

**Пример. Добавить тег всем трекам**

```jsx
db.tracks.updateMany(
    {},
    {
        $push: {
            tags: 'super'
        }
    }
)
```

**Пример. Удалить тег из треков**

```jsx
db.tracks.updateMany(
    {},
    {
        $pull: {
            tags: 'super'
        }
    }
)
```

**Пример. Добавить элемент в множество**

```jsx
db.tracks.updateMany(
    {},
    {
        $addToSet: {
            tags: 'super'
        }
    }
)
```

**Пример. Добавить несколько элементов в множество**

```jsx
db.tracks.updateMany(
    {},
    {
        $addToSet: {
            tags: { $each: ['super', 'mega', 'new'] }
        }
    }
)
```

**Пример. Удалить несколько тегов (элементов массива)**

```jsx
db.tracks.updateMany(
    {},
    {
        $pullAll: {
            tags: ['super', 'mega']
        }
    }
)
```

**Задача. Добавить ко всем трекам, кроме треков `1` и `3`, тег `test`**

```jsx
db.tracks.updateMany(
    {
        _id: { $nin: [1, 3] }
    },
    {
        $addToSet: { tags: 'test' }
    }
)
```

**Пример. Поиск документов по тегу (тегам)**

```jsx
db.tracks.find(
    {
        tags: 'new'
    }
)

db.tracks.find(
    {
        tags: { $in: ['new', 'test'] }
    }
)

db.tracks.find(
    {
        tags: { $all: ['new', 'test'] }
    }
)
```

**Задача. Вывести все треки с тегом `test` и продолжительностью до одного часа**

```jsx
db.tracks.find(
    {
        tags: 'test',
        duration_secs: { $lte: 60 * 60 }
    }
)
```

## Схема БД “чат-поддержки”

**Базовые сущности**

- `юзеры` (клиенты и сотрудники)
- `чаты`
- `сообщения`
- `реакции_на_сообщения` (шкала от `1` до `5`)