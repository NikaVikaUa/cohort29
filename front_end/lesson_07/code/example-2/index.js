const paragraphElement = document.getElementById("text");
const changeButtonElement = document.getElementById("btn-change");
const flowerElement = document.getElementById("flowers");
const changeFlowerButtonElement = document.getElementById("btn-change-flower");
const pandaImageElement = document.getElementById("panda");
const pandaButtonElement = document.getElementById("add-panda");
// всегда проверяйте получилось ли отловить(получить) элемент, для этого выведем в консоль
// console.log(paragraphElement);
// console.log(changeButtonElement);
// console.log(flowerElement);
// console.log(changeFlowerButtonElement);

// мы можем повесить на кнопку слушатель событий
// когда произойдет событие клика - то есть нажатие на кнопку
// слушатель событи вызовет тот код, который ме ему предоставили
// addEventListener принимает в себя название события: 'click'
// и колбек-функция(callback) - это функция которую можно будет вызвать при определенных условиях
// очень похоже на лябду: ()=>{}
changeButtonElement.addEventListener('click', ()=>{
  // код внутри этого блока выполняется только при клике на кнопочку
  paragraphElement.style.backgroundColor = "lightcoral";
});

// Создайте в html еще параграф - чтобы в параграфе был текст: Цветочки
// Под параграфом создайте кнопку с текстом: То ли еще будет
// Пусть при нажатии на кнопку текст параграфа 
// меняется со слова цветочки на слово Ягодки

// html c идишниками, js - сохранить элементы в переменные, 
// повесить слушатель событий(addEventListener) на кнопку
changeFlowerButtonElement.addEventListener('click', ()=>{
  flowerElement.textContent = "Ягодки";
});

// добавление картинки 
pandaButtonElement.addEventListener('click', ()=>{
  pandaImageElement.src = "https://media.istockphoto.com/id/523761634/photo/cute-panda-bear-climbing-in-tree.jpg?s=612x612&w=0&k=20&c=TxsmORsbuY1LpxQsc6T8fpWJo7lBwncciYhroAr8rXI=";
});

