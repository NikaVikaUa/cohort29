// Spread syntax - синтаксис "распыление"

// Повторим примитивные и ссылочные типы
const fruits = ["apple", "orange", "mango"];
const fruits2 = fruits;

fruits2[0] = "banana";
console.log(fruits);
console.log(fruits2);
// То есть один объект и две переменные которые содаржат ссылки на этот объект
// Если сам объект изменить/мутировать - то обе переменные будут содержать ссылку на изменный объект

// При работае с примитивными типами - мы храним в переменной значение
let str1 = "Hello";
let str2 = str1;
str1 = "Goodbay";
console.log(str1);
console.log(str2);

// КАК СКОПИРОВАТЬ ЭЛЕМЕНТЫ МАССИВА В НОВЫЙ МАССИВ?
const cars = ["bmw", "mercedes", "citroen"];
// как мне скопировать сами значения, но сделать новый независимый массив
// Для этого есть spread syntax
// spread operator это ...
// Этот массив не зависит от прдудыщего
const carsCopy = [...cars];
// Если мутируем второй массив - первый не изменится
carsCopy[0] = "porsche";
console.log(cars); // [ 'bmw', 'mercedes', 'citroen' ] - не изменился
console.log(carsCopy); // [ 'porsche', 'mercedes', 'citroen' ] - изменился только второй


// КАК ОБЪЕДИНИТЬ ДВА МАССИВА В ТРЕТИЙ С ПОМОЩЬЮ SPREAD
const cities1 = ["Berlin", "Paris"];
const cities2 = ["Viene", "Budapest"];

const joinedCities = [...cities2, ...cities1];
console.log(joinedCities); //[ 'Berlin', 'Paris', 'Viene', 'Budapest' ]

// МЫ МОЖЕМ СОЗДАТЬ МАССИВ И ДОБАВИТЬ В НЕГО ЭЛЕМЕНТ
const vegitables = ["cucumber", "tomato"];
const newVegitables = [...vegitables, "potato"];
console.log(newVegitables); // [ 'cucumber', 'tomato', 'potato' ]