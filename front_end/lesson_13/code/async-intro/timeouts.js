// Асинхронный код vs синхронный 
console.log("hello");

// код сработал с задержкой
setTimeout(() => {
    console.log("world");
}, 5000)

function print(){
    console.log("Print is done")
}
setTimeout(print, 3000);

setTimeout(() => {
    console.log("mango")
}, 0);
console.log("lime");

// Создать функцию clapHands()
// которая выводит в консоль фразу "Clap-clap " через 2 секунды
// и фразу "Bravo" через 7 секунд
// вызовите эту функцию

function printClap(){
   console.log("Clap-clap");   
}

function printBravo(){
    console.log("Bravo");
}

function clapHands(){
    setTimeout(printClap, 2000);
    setTimeout(printBravo, 7000);
}

clapHands();