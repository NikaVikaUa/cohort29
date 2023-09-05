const brothers = [
    {race:"hobbit", height:110, age:45, name:"Frodo Baggins"},
    {race:"human", height:185, age:46, name:"Aragorn"},
    {race:"elf", height:189, age:110, name:"Legolas"},
    {race:"dworf", height:140, age:150, name:"Gimli"},
    {race:"human", height:195, age:200, name:"Gandalf"},
];
// const frodo = brothers[0];
// const aragorn = brothers[1];

const [ frodo, aragorn, legolas, gimly ] = brothers;
console.log(brothers);

// const ageOfFrodo = frodo.age; // достали по ключу возраст
// console.log(ageOfFrodo);

const {race, age, name, noSuchKey} = frodo;
console.log(race);  // hobbit
console.log(age); // 45
console.log(name); // Frodo Baggins
console.log(noSuchKey); // undefined




const user ={id:1, email:"user@ya.ru", login:"simpleUser"};
const{email, id, login} = user;
console.log(email); // user@ya.ru