import java.util.ArrayList;

public class Main {

    // Generics
   // <> -  тип параметра задается в таких скобках

    //1. Параметризованный классы
    // Обьект параметризованного класса создается с указанием типа в <>  скобках
    // BaseClass<Type> object = new BaseClass <Type>()
    //  В качестве параметров не могут использоваться примитивные типы

    public static void main(String[] args) {
        // создаем обьект целого типа нашего класса Example
        Example<Integer> intObject = new Example<>(5);
        System.out.println(intObject.getObject());
       // Example<int> - дженерики не работают с примитивными типами

        //  создаем обьект типа String
        Example<String> strObject = new Example<>("hello");
        System.out.println(strObject.getObject());

        // таких параметров может быть несколько

        Example1<String,Integer>example1 = new Example1<>("Hello",25);
        example1.print();

        //2. дженерики в методах
        //  вызов метода с аргументом целого типа
        ExampleMethod.display(25);

        //  вызов метода с аргументом  типа String
        ExampleMethod.display("hello");

        // принятые обозначения :
        /*
        T - тип
        E - Элемент
        К - ключ
        V - value ( значение )
         */

        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add("Java");
      //  al.add(10);

        String s1 =(String) al.get(0);
        String s2 =(String) al.get(1);
        System.out.println(s1);
        System.out.println(s2);



    }



}
