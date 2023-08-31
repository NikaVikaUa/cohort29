// ## Homework
// ### Задание 1
// Создайте массив из следующих элементов: "Семен", "Иван", "Петр", "Татьяна". 
// Создайте еще один массив с возрастами: 18, 27, 74, 34; Создайте и заполните 
// при помощи цикла этот новый массив новыми элементами по образу: "Семен 18 лет/годов"

// ### Задание 2
// Используя пройденные на занятии методы массива получите из этого массива новый массив, 
// в котором элементы идут в обратной последовательности.

// Ответ присылайте в личку в слак.

const names = ["Семен", "Иван", "Петр", "Татьяна"];
const ages = [18, 27, 74, 34];

const namesAges = [];
for(let i = 0; i < names.length; i++){
  // "Семен 18 лет/годов"
  // namesAges[i] = names[i] + " " + ages[i] + " лет/годов";
  // шаблонная строка
  namesAges[i] = `${names[i]} ${ages[i]} лет/годов`;
}
console.log(namesAges);

const name = "Alisher";
const age = 29;

const text = `Меня зовут ${name}. Мне ${age} лет. Я учу вас шаблонным строкам`;
console.log(text);

// Задание 2

const reversed = [];
for(let i = 0; i < namesAges.length; i++){
  reversed.unshift(namesAges[i]);
}
console.log(reversed);  // массив в обратном порядке
console.log(namesAges); // исходный массив остался неизмененным 

const arr = [1,2,3];
const arr2 = arr.reverse();

console.log(arr2);

const arr3 = [2, 5, 6];
const arr4 = arr3;
