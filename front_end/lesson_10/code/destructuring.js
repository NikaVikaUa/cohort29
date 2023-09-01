// Destructuring assignment
const person = {name: "Frank", age: 37};
console.log(person.age);
const age = person.age;
const name = person.name;
console.log(age);
console.log(name);

// Другой способ сделать тоже самое 
// Деструктурующее присваивание
const dog = {nick: "Bobby", breed: "corgi"};
// const nick = dog.nick;
// const breed = dog.breed;
const {breed, nick, height, weight = 2} = dog; // создал две переменные 
// // nick равный "Bobby", breed равный corgi
console.log(nick);   // "Bobby"
console.log(breed);  // 
console.log(height); // undefined
console.log(weight); // 2 // задали значением по умолчанию

