## Ссылки

- [пример схемы БД “кинотеатр”](https://dbdiagram.io/d/cinema-653bb667ffbf5169f0975560)
- [пример схемы БД “видео-хостинг”](https://dbdiagram.io/d/Copy-of-video-hosting-653bfa2fffbf5169f09b3f6b)
- [супер-песочница](https://sqliteonline.com/)
- [бесплатное облако MongoDB](https://www.mongodb.com/products/platform/cloud)
- [как установить MySQL на Windows](https://selectel.ru/blog/tutorials/how-to-install-mysql-on-windows/)
- [справочник по SQL](https://www.sqltutorial.org/)
- [справочник по MongoDB](https://www.mongodb.com/docs/manual/tutorial/getting-started/)

**Примеры запросов**

```jsx
// Количественное распределение юзеров по странам
db.users.aggregate([
    {
        $group: {
            _id: '$country', // поле группировки
            total_users: { $count: {} }
        }
    }
])

// Вывести общее ко-во юзеров
db.users.aggregate([
    {
        $group: {
            _id: null, // поле группировки
            total_users: { $count: {} }
        }
    }
])
```

![Screenshot from 2023-10-27 19-50-46.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/55c2360f-7982-4865-8946-6d1c230fdb8c/Screenshot_from_2023-10-27_19-50-46.png)

**Задача. Вывести страны поставщиков**

```sql
SELECT DISTINCT
	Country
FROM Suppliers
```

**Задача. Вывести название и стоимость в `USD` товаров от поставщиков `1` и `4`**

```sql
SELECT 
	ProductName,
	Price * 1.05 AS Price_usd
FROM Products

WHERE
	SupplierID IN (1, 4)
```

**Задача. Вывести названия товаров с ценой от `10` до `150` EUR из категории `4`**

```sql
SELECT
		ProductName,
    Price
FROM Products

WHERE
		CategoryID = 4
    AND
    Price BETWEEN 10 AND 150;
```

**Задача. Вывести клиентов, кроме тех, что из `UK` и `USA` (без использования оператора `IN`)**

```sql
SELECT *
FROM Customers

WHERE
	NOT Country='UK'
	AND
	NOT Country='USA'
```

**Задача. Вывести номера телефонов поставщиков из `UK` и `Brazil` (без использования оператора `IN`)**

```sql
SELECT
		Phone
FROM Suppliers

WHERE
		Country = 'UK'
    OR
    Country = 'Brazil'
```

**Задача. Вывести заказы клиентов `90` и `81`**

(проекция: `номер_заказа`, `имя_клиента`)

```sql
SELECT
	Orders.OrderID,
	Customers.CustomerName
FROM Orders

JOIN Customers ON Orders.CustomerID = Customers.CustomerID

WHERE
	Orders.CustomerID IN (90, 81)
```

## Ключевое слово `USING()`

**Пример**

```sql
JOIN Customers USING(CustomerID)
```

```sql
SELECT
	Orders.OrderID,
	Customers.CustomerName
FROM Orders

JOIN Customers USING(CustomerID)
-- JOIN Customers ON Orders.CustomerID = Customers.CustomerID

WHERE
	Orders.CustomerID IN (90, 81)
```

**Задача. Вывести `названия` и `ID` товаров, которые не были заказаны ни разу**

```sql
SELECT
		Products.ProductID,
    Products.ProductName
FROM Products

LEFT JOIN OrderDetails USING(ProductID)

WHERE
	OrderDetails.ProductID IS NULL
```

**Задача. Вывести ТОП-3 самых дорогих товаров с ценой до `200` EUR**

```sql
SELECT *
FROM Products

WHERE
	Price <= 200
    
ORDER BY Price DESC
LIMIT 3
```

**Задача. Вывести ко-во товаров и их среднюю стоимость от поставщика `1`**

```sql
SELECT
		COUNT(*) AS total_products,
    AVG(Price) AS avg_price
FROM Products

WHERE
	SupplierID = 1;
```

**Задача. Вывести, сколько раз был заказан товар `72`**

```sql
SELECT
	COUNT(*) AS sold_count
	-- SUM(Quantity)
FROM OrderDetails

WHERE
	ProductID = 72
```

**Пример. Вывести статистику по каждому поставщику**

```sql
SELECT
		SupplierID,
		COUNT(*) AS total_products,
    AVG(Price) AS avg_price
FROM Products

GROUP BY SupplierID
-- HAVING total_products >= 5
```

**Задача. Вывести страны, где ко-во клиентов `10` и более**

(проекция: `название_страны`, `ко-во_клиентов`)

```sql
SELECT
		Country,
    COUNT(*) AS total_customers
FROM Customers

GROUP BY Country

HAVING
	total_customers >= 10
```

**Задача. Вывести менеджеров, у которых ко-во заказов `10` и более**

(проекция: `фамилия_менеджера`, `ко-во_заказов`)

```sql
SELECT
		Employees.LastName,
    COUNT(*) AS total_orders
FROM Employees

JOIN Orders USING(EmployeeID)

GROUP BY Employees.EmployeeID

HAVING
	total_orders >= 10
```

## Схема БД `видео-хостинг`

**Основные сущности**

- `users`
- `videos`
- `reactions` (реакции на видео)
- `donations` (пожертвования)

![Screenshot from 2023-10-27 22-20-50.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/2ab5232f-c3d3-49ff-bee8-c24e22abc91e/Screenshot_from_2023-10-27_22-20-50.png)

![Screenshot from 2023-10-27 22-23-12.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/8ef876d5-41c1-4528-98b6-5a0de1f9dbab/Screenshot_from_2023-10-27_22-23-12.png)

## Структура SQL

- `**DQL` (Data Query Language)**
    - `SELECT`
    - `SELECT DISTINCT`
- `**DDL` (Data Definition Language)**
    - `CREATE` - создать объект (напр., БД, таблица и т.д.)
    - `DROP` - удалить
    - `ALTER` - изменить
    - `RENAME` - переименовать
- `**DML` (Data Manipulation Language)**
    - `INSERT INTO` - добавить записи
    - `UPDATE` - изменить записи
    - `DELETE` - удалить записи
- **`DCL` (Data Control Language)**
- **`TCL` (Transaction Control Language)**

## Основные типы данных в MySQL

- каждый столбец (поле) таблицы должен иметь указание на тип данных

# SQL: DDL

## Создание БД

```sql
CREATE DATABASE db_name;
CREATE DATABASE IF NOT EXISTS db_name; -- с проверкой, что указанная БД не существует
```

## Создание таблиц

```sql
CREATE TABLE <название_таблицы> (<структура>);
CREATE TABLE IF NOT EXISTS <название_таблицы> (<структура>);

CREATE TABLE users (
	-- название_поля тип_данных доп_хар-ки
	user_id int
);
```

## Удалить таблицу

```sql
DROP TABLE <название_таблицы>;
```

## Создание таблиц. БД `видео-хостинг`

```sql
CREATE TABLE IF NOT EXISTS users (
	user_id int,
	created_at timestamp,
	username varchar(64),
	country varchar(64),
	is_blocked bool
);
```

**Задача. Создать таблицу `videos`**

```sql
CREATE TABLE IF NOT EXISTS videos (
  video_id int,
  created_at timestamp,
  title varchar(128),
  author_id int,
  duration_secs int
);
```

## Валидация данных в SQL / SQL Constraints

**Основные ограничения:**

- `primary key` (`unique + not null`)
- `unique` уникальное
- `not null` не пустое
- `foreign key` внешний ключ
- `check` проверка условий
- `default` установка значения по умолчанию

**Пример. Создать таблицу `products`**

```sql
CREATE TABLE IF NOT EXISTS products (
	product_id int primary key auto_increment,
	title varchar(128) not null,
	price float check (price > 0),
	created_at timestamp default current_timestamp,
	supplier_id int,
	FOREIGN KEY (supplier_id) REFERENCES suppliers(supplier_id) -- добавить привязку (проверку) к suppliers
);
```

**Задача. Создать таблицу `users` с использованием механизма валидации данных**

```sql
CREATE TABLE users (
	user_id int primary key auto_increment,
	created_at timestamp default current_timestamp,
	username varchar(64) not null,
	country varchar(64) not null,
	is_blocked bool default false
);
```

**Пример. Добавить двух юзеров**

```sql
INSERT INTO users (username, country)
VALUES
		('hacker', 'USA'),
    ('Ivan000', 'Germany')
```