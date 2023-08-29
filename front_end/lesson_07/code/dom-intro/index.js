// команда вывода в консоль (смотреть в браузере в инструментах разработчика)
console.log("Hello, JS!");

// как создавать переменные в js?
// String name = "Marina"; -- это как мы бы сделали это в Java
// let - для объявления переменной
// const - для объявления константы
const name = "Marina";
console.log(name);

// мы можем сохранять в переменные узелки-элементы нашего документа
// и дальше работать с ними как с объектами
// метод getElementById - возвращает элемент с указанным id 
const boxElement = document.getElementById("box-1");
console.log(boxElement);

// все что касается стиля находится под атрибутом style
// обратите внимание что свойства css внутри js пишутся в 
// lower camel case то есть background-color => backgroundColor

// изменение цвета (можно менять любые свойства css)
boxElement.style.backgroundColor = "green";
// изменили ширину квадрата
boxElement.style.width = "200px";
// изменили текст внутри квадрата
boxElement.textContent = "Green box";