public class Main {

    public static void main(String[] args) {
        /*
        Задача 1
Используя интерфейс Printable (см. код урока) , написать лямбда выражение,реализующее метод print()
таким образом, что принимаемая в качестве параметра строка
выводится на экран

void print(String s);
         */
   //     (arg list) -> body
        Printable p1 = str -> System.out.println(str);
    //    p1.print("Hello");


        /*
        Задача 2*
Используя один из интерфейсов Checkable,Printable, StringConcat (см. код урока)
написать лямбда выражение, реализующее соответствующий метод таким образом,
что если длина строки на входе равна 3, то метод возвращает true, иначе false

boolean check(String str);
         */
        Checkable checkable =str -> str.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        checkable = str -> str.length()%2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));


        // соединить  a и b = ab
        // String concat( int a,int b)
        StringConcat stringConcat = (a,b) -> Integer.toString(a)+b; // с помощью Integer.toString значение а
                                                                     // превращается в строку ( 2 в "2"
        System.out.println(stringConcat.concat(1,2));


        // напечатаь Hello World
        // String produce()
        Producable producable = () -> "Hello World";

        System.out.println(producable.produce());

        // реализовать метод , принимающий строку и возвращающий ее в верхнем регистре
        // String  modify(String input)

        Transformable transformable = s -> s.toUpperCase();
        System.out.println(transformable.modify("abcd"));
    }
 //   boolean check(String str){
 //       return str.length()==3;
 //   }
}
