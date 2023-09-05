// spread массива
const fruits = ["lime", "orange", "lemongrass"];
const newFruits =[... fruits, "apple"];
console.log(newFruits);

// spread объекта
const  fruit ={ title: "orange", color:"yellow", weight:"200"};
console.log(fruit);
// { title: 'orange', color: 'yellow', weight: '200' }
const specialOrange ={...fruit, country:"Maroco"};
console.log(specialOrange);
