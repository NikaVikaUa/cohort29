public class Person {

    Person(){} //  конструктор класса Person.  С  помощью него создаются обьекты
    // имя  констуктора пишется с большой буквы и совпадает с именем класса.

    String name;  // поле или переменная класса имя

    int  age; // поле или переменная класса возраст


    void canWalk(){
        System.out.println(name+" can walk");
    }

    void canEat(){
        System.out.println( name+" can eat");
    }

    void myName(){
        System.out.println("my name is "+name);
    }

    void myAge(){
        System.out.println("my age is "+age);
    }




}
