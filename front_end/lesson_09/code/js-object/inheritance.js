// Class, inheritance 
class Animal {
  constructor (age, name, color){
    this.age = age;
    this.name = name;
    this.color = color;
  }
  info(){
    console.log(`Меня зовут ${this.name} Возраст: ${this.age} Цвет: ${this.color}`);
  }
}

const panda = new Animal(14, "Po", "black and white");
console.log(panda);

const salmon = new Animal(2, "Gektor", "silver");
console.log(salmon);

salmon.info();

// наследование
// создадим производный класс птица - 
// добавим поле высота полета heightOfFlight, ration - рацион питания
class Bird extends Animal {
  constructor(age, name, color, heightOfFlight, ration){
    super(age, name, color);
    this.heightOfFlight = heightOfFlight;
    this.ration = ration;
  }
}

const colibri = new Bird(1, "Sveta", "green", 2, "flowers");
console.log(colibri);
colibri.info();

// Создайте класс Алкоголь Alcohol с полями:
// - title - название
// - strength - крепость
// - volume - в литрах
// Метод drink - выводит в консоль фразу "Приятно выпить <имя напитка>"

// Создать производный класс 
// Cognac с полями:
// - age - возраст
// - country - страна производства

// Martini
// - sugarAmount - процент содержания сахара 

// Создайте объекты конъяка и мартини

// 
// ["martini", "cognac", "bellis"]
Math.random(); // 0-1 случайное число
console.log(Math.ceil(8.1)); // округление до верхней границы
console.log(Math.floor(8.1)); // округление до нижнего

class Alcohol {
  constructor(title, strength, volume){
    this.title = title;
    this.strength = strength;
    this.volume = volume;
  }
  drink(){
    console.log(`Приятно выпить ${this.title}`);
  }
}

class Cognac extends Alcohol {
  constructor(title, strength, volume, age, country){
    super(title, strength, volume);
    this.age = age;
    this.country = country;
  }
}

class Martini extends Alcohol {
  constructor(title, strength, volume, sugarAmount){
    super(title, strength, volume);
    this.sugarAmount = sugarAmount;
  }
}

const ararat = new Cognac("Ararat", 30, 1, 10, "Armenia");
ararat.drink();

const blackLabel = new Martini("Bianco", 12, 1, 3);
blackLabel.drink();
