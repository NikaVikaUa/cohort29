
  const button = document.getElementById("refreshButton");
  const links = [
    {
      url: "https://wttr.in/Moscow",
      params: {
        2: "",
        m: "",
        lang: "fr",
        T: "",
      },
    },
    {
      url: "https://wttr.in/Amsterdam",
      params: {
        2: "",
        m: "",
        lang: "fr",
        T: "",
      },
    },
    
    {
      url: "https://wttr.in/London",
      params: {
        2: "",
        m: "",
        lang: "fr",
        T: "",
      },
    },
    {
      url: "https://wttr.in/Berlin",
      params: {
        2: "",
        m: "",
        lang: "fr",
        T: "",
      },
    },
  ];
  
  function fetchData() {
    for (const link of links) { // const link - это объявление переменной, которая будет хранить текущий элемент массива links на каждой итерации цикла.
      const { url, params } = link; // Извлекается url и params из объекта link.
      const queryString = new URLSearchParams(params).toString(); // params преобразуется в строку запроса с помощью URLSearchParams.
      fetch(`${url}?${queryString}`)
        .then((response) => response.text())
        .then((pageText) => {
          const result = document.getElementById("content");
          result.innerHTML = pageText;
        })
        .catch((error) => {
          console.error("Ошибка при выполнении запроса:", error);
        });
    }
  }
  button.addEventListener("click", fetchData);