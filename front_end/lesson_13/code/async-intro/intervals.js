// Интервалы
 const tick = setInterval(() => {
    console.log("tick");
 }, 4000);

 setTimeout(() => {
    clearInterval(tick);
 },5000)