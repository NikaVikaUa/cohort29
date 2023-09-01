// ФУНКЦИИ В JS
// Function declaration 
// Декаларация функции (объявление функции)
function sum(a, b){
  return a + b;
}

// Вызов функции
let result = sum(10, 20);
console.log(result);

// Если нет ретерна, что возвращает функция
function print(){
  console.log("Text");
}

let res2 = print();
console.log(res2); // undefined
// если забыли написать ретерн функция возвращает undefined

// Но есть еще один способ создания функции
// Function expression - функциональное выражение
const devide = function(a, b){
  return a / b;
};
// вызов функции
console.log(devide(10, 2));

// Какая разница между function declaration и function expression?
// в function declaration вызов может находиться до объявления
print2();

function print2(){
  console.log("Print - 2");
}
