public class Main {
    public static void main(String[] args) {



    // Написать лямбды, используя наши интерфейсы:



    /*
    1. сложить  два числа и получить строку. num1+num2 = num1num2
    2. если длина строки четная  вернуть true  иначе false
    3. вернуть строку в нижнем регистре
    4. если длина строки пять символов вернуть 5 звездочек. Иначе вернуть без изменений
    строку
    5. вывести строку на печать в виде *строка*
    6. напечатать " Hello Java "
     */
        // 1. сложить  два числа и получить строку. num1+num2 = num1num2
        System.out.println("-------1-----------");
        Concatable concatable = (num1,num2)->Integer.toString(num1)+num2;
        System.out.println(concatable.concat(1,2));

        //2. если длина строки четная  вернуть true  иначе false
        System.out.println("--------------2--------------");
        Checkable checkable = str -> str.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));
        checkable = str -> str.length() == 5;

        //3. вернуть строку в нижнем регистре
        System.out.println("--------3------------");
        Transformable transformable = str -> str.toLowerCase();
        System.out.println(transformable.transform("ABcFd"));
        transformable = str -> str.toUpperCase();
        System.out.println(transformable.transform("ABcFd"));


        System.out.println("--------4------------");
        //4. если длина строки пять символов вернуть 5 звездочек.
        // Иначе вернуть без изменений   строку
        Transformable transformable1 = str -> str.length() == 5 ? "*****" : str;
        System.out.println(transformable1.transform("ab"));
        System.out.println(transformable1.transform("abcde"));

        //5. вывести строку на печать в виде *строка*
        System.out.println("-----------5---------------");
        Printable printable = str -> System.out.println("*" + str + "*");
        printable.print("hello");

        //6. возвращает " Hello Java "
        System.out.println("----------6------------");
        Producable producable = () -> "Hello Java";
        System.out.println(producable.produce());








    }

}
