// Сколько примитивных типов в js
// 7: number, string, boolean, undefined, null, symbol, bigInt

// преобразование в стринг
const str = String(1999);
// преобразование в number
const num = Number("123123");
const num2 = Number("1231/23ka"); // NaN 
// Not a Number - тип у него number 
// преобразование в boolean
const b1 = Boolean(1);    // true
const b2 = Boolean(0);    // false
const b3 = Boolean(-1);   // true
const b4 = Boolean(NaN);  // false

const b5 = Boolean("");   // false
const b6 = Boolean("ad"); // true

const b7 = Boolean(undefined); // false
const b8 = Boolean(null); // false
// falsy values: NaN, 0, '', undefined, null

// Логические союзы
console.log(!0 || !0); // true
console.log(!"");      // true

const y = 8;
const x =  y || 9; // так можно задавать значение по умолчанию
console.log(x); // если y === 8, то 8
// если y === undefined, то 9

// наоброт
const k = undefined;
const l = k && 10;
console.log(l); // undefined

const z = 9;
const n = z && 10;
console.log(n); // 10

// Пример использования 
const firstName = "John";

// если имя есть - верни мне какой-нибудь текст
const element = firstName && `<h1>Заголовок ${firstName}</h1>`;
console.log(element);

// Как написать switch case 
const condition = 1;

switch(condition){
  case 1: console.log("January");
  break;
  case 2: console.log("February");
  break;
  default: console.log("No such month");
}

// while 
let i = 0;
while(i < 11){
  console.log(i);
  i++;
}

// do while
let j = 11;
do {
  console.log(j);
} while (j < 11);

// 11 // один раз срабатывает даже если условие не выполняется 

// recursion
// как досчитать от 10 до 0 рекурсивно
// базовый случай - условия выхода
// шаг рекурсии
console.log("**** Рекурсия ****");
function count(number){
  // базовый случай
  if(number === 0){
    console.log(0);
    return;
  }
  // шаг рекурсии
  console.log(number);
  count(number - 1);
}

count(10);

console.log("*** Рекурсивно посчитать сумму ***");
// от указанного числа до 0 - сумма чисел
function sum(number){
  if (number === 1){
    return 1;
  }
  return number + sum(number -1);
}

console.log(sum(10));