public class Person {

 public String name;
  int age;

   String address;


    //  конструктор - это блок кода, который присваивает значения созданному обьекту.
    // конструктор напоминает метод в джаве, но это не метод и он ничего не возвращает.
    // Можно рассматривать конструктор как особый вид метода. Название конструктора совпадает с именем класса
    // и пишется с большой буквы

    //Виды конструкторов:
    /*
    - default  - пустой констуктор, который по умолчанию вставляется компилятором в случае отсутствия в классе в явном
          виде обьявленного конструктора

     - конструктор без аргументов, пример Person(){}

    */
    Person(){};

    /*

     - конструктор с параметрами
     */
    Person(String name, int age ){ // передаваемые в скобках параметры присваивают значения переменным
                                                // обьекта
        this.name = name; //
        this.age = age;

    }

    Person(String name, int age, String address ){ // передаваемые в скобках параметры присваивают значения переменным
        // обьекта
        this.name = name; //
        this.age = age;
        this.address = address;
    }


  //  String name;
    void canEat (){
        System.out.println(name + " can eat");
        String name = "Peter";
        System.out.println(name + " can eat");

    }

    void sayAge(){
        System.out.println("my age is "+age);
    }

    void saySmth(){
        String x = "Ok";  // переменная x  является локальной и видна только внутри метода, в котором она обьявлена
        System.out.println(x);
    }


    void saySmth1(){
        String x = "Yes";  // переменная x  является локальной и видна только внутри метода, в котором она обьявлена
        System.out.println(x);
    }

  //  Person(){}
}
