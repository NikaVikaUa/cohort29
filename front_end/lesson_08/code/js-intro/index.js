// вывод в консоль
console.log("Check 1 2");

// СОЗДАНИЕ ПЕРЕМЕННЫХ
// const, let   (var)
let dog = "Sharik";
dog = "Sharik Igorevich"; // присвоили другое значение
dog = 12; // сохранили знаение в переменную - тип данных другой

const cat = "Lilya"; 
// cat = "Tuzik"; // здесь будет ошибка - потому что нельзя присваивать новые значения константе
// Повторим что такое декларация и инициализация:
// Декларация - объявление
let panda;
// Инициализация - про первоначальное значение
panda = "Po";

// ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
// 1. string - является примитивом
let str1 = "Можно в двойных";
let str2 = 'Можно в одинарных кавычках';
// отдельного типа для char - не предусмотренно
let str3 = "13"; // это стринг
let str4 = str1 + " " + str2;
console.log(str4);
console.log(str1.toUpperCase()); // перевод в верхний регистр
// 2. number 
let num1 = 9;
let num2 = 9.6;
// Диапазон
console.log(Number.MAX_SAFE_INTEGER);
// console.log(Number.MAX_VALUE);

// 3. bigInt
// Если вам нужно работать с очень большими числами - используйте bigInt 
// биг инт пишется с постфиксом n
let num3 = 1239n; // больший диапазон, чем у number до 2^53 -1

// 4. boolean 
let isDrunk = true;
// условная конструкция 
if (isDrunk){
  console.log("Давай-давай-давай оп-па-па");
}
// тернарный оператор
const result = isDrunk ? "пьяный" : "трезвый";
console.log(result);

// 5. undefined
let str5;
console.log(str5); // undefined - создали переменную и не инициализировали ее
// по большей части - это когда не установленно значение переменной
let str6 = "text";
str6 = undefined; // убрали значение из переменной 

// 6. null
// null - отсутсвие значения
// часто можно получить null, если метод не нашел значений 
// document.getElementById("несуществующий-id")  ---> метод вернет null
// Можно присовить null вручную 
let empty = null;

// 7. symbol
// Новый тип, раньше его не было, и сейчас остается малопопулярным
// Символ используется для создания уникальных значений внутри программы 

let s1 = Symbol("something");
console.log(s1);

// ПРЕОБРАЗОВАНИЕ ТИПОВ
// 1. преобразование в строку
// неявное преобразование
let str7 = "" + 9; // "9"
// явное преобразование из любого другого типа 
const num4 = 10;
let str8 = String(num4); // "10"
console.log(str8);
// небольшой пример на "подумать"
const res = 9 + 12 + "5";
console.log(res); // 215
const res2 = "5" + 9 + 12; // 5912
// 2. численное преобразование 
// неявное 
const num5 = +"6";
console.log(num5); // число 6
const sum = +"9" + +"10";
console.log(sum); // 19
// явное преобразование в число
const num6 = Number("117"); // число 117
const num7 = Number("129&8*#")
// попробовали преобразовать в число - что-то непригодное
console.log(num7); // NaN - not a number - особое значение -
// которое появляется либо при неудачном преобразовании, либо при неудачной матем операции
console.log(NaN + 10); // NaN

// Можно посмотреть тип значения переменной с помощью оператора 
// typeof - он вернет строку "number", "string", ...
console.log(typeof num6); // "number"
console.log(typeof num7); // у "NaN" тип - "number", хотя это забавно
console.log(typeof "text"); // string
const res3 = typeof num6; // можно сохранить в переменную результат проверки типа
console.log(res3); "number"

// 3. преобразование в логический тип 
//  число в булеан
const res4 = Boolean(9);  
console.log(res4); // true
const res5 = Boolean(-12);
console.log(res5); // true
const res6 = Boolean(0);
console.log(res6); // false
const res7 = Boolean(NaN);
console.log(res7); // false
// преобразование строки в булеан
const res8 = Boolean("hey");
console.log(res8); // true
const res9 = Boolean("");
console.log(res9); // false
const res10 = Boolean(null); // false
const res11 = Boolean(undefined); // false

// Falsy values: те которые преобразуются false
// 0, "", null, NaN, undefined
const name = undefined;
// пример неявного преобразования
if(name){ // преобразуется в false
  console.log("Первое");
} else {
  console.log("Второе");
}
// вывелось второе

// ОПЕРАТОРЫ
// 1. тернарный работатает как в java
// 2. математические операторы
const sum1 = 1 + 2;     // -, /, *
// возведение в степень
const pow = 2 ** 3;     // два в третьей степени - этого не было в java
// целочисленное деление 
const reminder = 9 % 4; // 1
console.log(reminder);
// 3. операторы сравнения
// >, <, >=, <= - с этими все так же как в Java

// РАВЕНСТВО СТРОГОЕ vs НЕСТРОГОЕ
// === - строгое равенство - без преобразование типов (coercion)
// ==  - нестрогое равенство - с преобразованием 
console.log(9 === "9"); // false
console.log(9 == "9");  // true - 9-ка преобразуется в "9" и тогда он проверяет "9" === "9"
// стринг намбер булеа
console.log(true == ""); // true --> "true"
console.log(String(Number(true))); // true --> 1 --> "1"
console.log(true == "1");

// НЕРАВЕНСТВО
// !== 
console.log("apple" !== "orange"); // true
// ПРИСВАИВАНИЯ
// = - такой же как в java

