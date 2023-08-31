// Object-literal
// Пример 1
// Мы можем создать объект без класса, используя нотация объект-литерал
const student = {
  age: 22,
  name: "Fred"
};

console.log(student.age);  // 22
console.log(student.name); // Fred
console.log(student.profession); // undefined

// Пример 2
// например ключ может состоять из двух слов
// Если ключ имеет пробелы - его нужно взять в кавычки
const product = {
  title: "Iphone",
  price: 1000,
  "model of phone": "XR"
};
// получить значение по ключу
console.log(product.price);
console.log(product["model of phone"]);
// положить значение по ключу
product.diagonal = 19;
product["type of adapter"] = "lightning";
console.log(product);

// Пример 3
// если у нас есть переменная и мы хотим доставать значения из объекта по этой перменной
let key = "age";
console.log(student[key]); // 22
key = "name";
console.log(student[key]); // Fred

// 
const client = {
  firstName: "John",
  wife: "Maria"
};

const key1 = "wife";
// как достать по переменной из объекта
console.log(client.key1);  // undefined
console.log(client[key1]); // Maria

// Методы Object
// получить массив всех ключей объекта
console.log(Object.keys(student)); //     [ 'age', 'name' ]
// получить массив всех значений объекта
console.log(Object.values(student)); //   [ 22, 'Fred' ]
// получить массив всех парк ключ-значение
console.log(Object.entries(student)); //  [ [ 'age', 22 ], [ 'name', 'Fred' ] ]

// Можно проверить есть ли определенный ключ внутри объекта.
// Хочу посмотреть есть ключ age внтури student?
// оператор in
console.log('age' in student); // true
console.log("isDrunk" in student); // false

// Пример 4 
// Допустим у нас были переменные - и мы бы хотели создать из них объект
const title = "Titanic";
const capacity = 1500;

const titanic = {title, capacity};
console.log(titanic); // { title: 'Titanic', capacity: 1500 }

// Пример 5 
const name1 = "Avrora";
const cap = 300;
// хотел бы создать объект из этих переменных, но с другими названиями ключей
const avrora = {title: name1, capacity: cap};
console.log(avrora); // { title: 'Avrora', capacity: 300 }

// Пример 6 
// Метод внутри объекта 
const dog = {
  nick: "Bobby",
  bark(){
    console.log("woof-woof");
  }
};
// вызов метода
dog.bark(); // woof-woof

// ПРОТОТИПНОЕ НАСЛЕДОВАНИЕ (устарело, но используется под капотом)
// это нативное наследование в JS
// - это наследование между двумя объектами
const bicycle = {
  brand: "stels",
  price: 300,
  bell(){
    console.log("Bz-bz-ring-ring");
  }
}

// на основании велосипеда сделаем горный велосипед
// указываем прототип с помощью свойства прото (по два подчеркивания с каждой стороный)
const mountainBike = {
  __proto__: bicycle,
  price: 450,
  gears: 7
}

console.log(mountainBike.price); // 450
console.log(mountainBike.gears); // 7
console.log(mountainBike.brand); // 
mountainBike.bell();

// Создайте объект транспортное средство vehicle с полями:
// - speed со значением 40
// - capacity 4 
// - методом drive(){} -  метод выводит в консоль фразу 'br-br-br'

// Создавть на основе vehicle объект jeep с capacity (вместимостью) 5
// скоростью 60
// numberOfDoors количество дверей - 2

// вызовите метод drive от jeep

const vehicle = {
  speed: 40,
  capacity: 4,
  drive(){
    console.log("br-br-br");
  }
};

const jeep = {
  __proto__: vehicle,
  capacity: 5,
  speed: 60,
  numberOfDoors: 2
};

jeep.drive();


function getRandomAlcohol() {
  const randomIndex = Math.floor(Math.random() * 5);
  return randomIndex;
}
console.log(getRandomAlcohol());