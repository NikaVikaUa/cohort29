const brothers = [
    {race:"hobbit", height:110, age:45, name:"Frodo Baggins"},
    {race:"human", height:185, age:46, name:"Aragorn"},
    {race:"elf", height:189, age:110, name:"Legolas"},
    {race:"dworf", height:140, age:150, name:"Gimli"},
    {race:"human", height:195, age:200, name:"Gandalf"},
];
// пример 1
const names = brothers.map((element)=>element.name);
console.log(names);
// 1 метод Map - возвращает новый массив, не изменяя исходный


// пример 2
const ages = brothers.map((element)=>element.age);
console.log(ages);

// пример 3
const raceNames = brothers.map((brother)=> brother.race + " " + brother.name);
console.log(raceNames);

// пример 4
const sizes = brothers.map((brother)=>{
    if (brother.height >=170){
        return "Высокий!";
    }
    return "Низкий";
});
console.log(sizes);

const sizesVer2 = brothers.map((brother)=> brother.height >=170 ? "Высокий!" : "Низкий");
console.log(sizesVer2);

// метод ForEach  - нужен для измененния исходного массива

brothers.forEach((brother)=> brother.age +=1);
console.log(brothers);

// метод Reduce 

let sum = 0;
for (let i =0 ;i < ages.length; i++){
    sum += ages[i];
}
console.log(sum);

const sum2 = ages.reduce((acc, current)=> acc + current,0);
console.log(sum2);
// // iteration -- acc -- current
  // 1         -- 0   -- 45
  // 2         -- 45  -- 46
  // 3         -- 91  -- 110
  // 4         -- 201 -- 150
  // 5         -- 351 -- 200
  // сумммируем и возвращаем значение аккумулятора 551


  const totalHeight = brothers.reduce((acc, brother)=> acc + brother.height,0)
  console.log(totalHeight);

  // Комбинация map+ reduce

  const totalHeight2 = brothers
  .map((brother)=> brother.height) // получили массив ростов
  .reduce((acc, height)=> acc + height,0);
  console.log(totalHeight2);

// Метод split
let str = "Gandalf, Sauron, Saruman, Tom Bombandill";
const namesArr = str.split(", ");
console.log(namesArr);

// Метод join
const newString = namesArr.join(" ");
console.log(newString);

// Метод filter
const oldBrothers = brothers.filter((brother)=> brother.age >100);
console.log(oldBrothers);



// Метод Find

const person = brothers.find((brother)=> brother.race === "human");
console.log(person);// { race: 'human', height: 185, age: 47, name: 'Aragorn' }

const person2 = brothers.find((brother)=>brother.height <= 120);
console.log(person2);  // { race: 'hobbit', height: 110, age: 46, name: 'Frodo Baggins' }

const person3 = brothers.find((brother)=> brother.age <= 10);
console.log(person3); // undefined
