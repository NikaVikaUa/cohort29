// Массив - динамический массив
// длина не фиксирована - может увеличиваться

// ДВА СПОСОБА СОЗДАНИЯ ПУСТОГО МАССИВА
const arr1 = []; // первый способ
const arr2 = new Array(); // второй 
// Как добавить значение по индексу? 
const fruits = [];
fruits[0] = "orange";
console.log(fruits); // [ 'orange' ]
fruits[1] = "banana";
console.log(fruits); // [ 'orange', 'banana' ]
// Как достать значение по индексу?
console.log(fruits[1]);
// Если попробую достать по индексу по которому ничего не записано
console.log(fruits[5]); // undefined
// длина массива
console.log(fruits.length); // свойство длина - без круглых скобок

// КАК СОЗДАТЬ СРАЗУ СО ЗНАЧЕНИЯМИ?
const cars = ["bmw", "porsche", "bently"];
console.log(cars);
// Пройтись циклом for по массиву 
for(let i = 0; i < cars.length; i++){
  console.log(cars[i]);
}

// Методы для работы с массивом
const students = [];
// push - добавляет указанный элемент в конец массива 
students.push("Ruslan");     // добавили справа
console.log(students); // ["Ruslan"]
students.push("Viktoriia");  // добавили справа
console.log(students); // ["Ruslan", "Viiktoria"]
// unshift - добавляет в начало массива
students.unshift("Leon"); // добавили леона слева 
console.log(students); // [ 'Leon', 'Ruslan', 'Viktoriia']
// pop - забирает элемент с конца и убирает его из массива
const vika = students.pop(); // убрали Вику из массива и сохранили в отдельную переменную
console.log(students);
console.log(vika);
// shift - забирает и удаляет с начала массива
const leon = students.shift();
console.log(students);
console.log(leon);

// push + shift = FIFO
// push + pop = LIFO
// ushift + shift = LIFO - поселдним зашел - первым вышел
// pop + unshift = FIFO - первый вошел первый вышел