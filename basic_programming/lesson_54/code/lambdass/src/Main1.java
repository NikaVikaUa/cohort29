import java.util.function.*;

public class Main1 {
    public static void main(String[] args) {
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
        BiFunction<Integer, Integer, String> biFunction = (a, b) -> Integer.toString(a) + b;
        String res = biFunction.apply(10, 15);
        System.out.println(biFunction.apply(10, 15));

        // 2. если длина строки четная  вернуть true  иначе false
        Predicate<String> stringPredicate = str -> str.length() % 2 == 0;
        System.out.println(stringPredicate.test("abc"));
        System.out.println(stringPredicate.test("abcd"));

        //  3. вернуть строку в нижнем регистре
        Function<String, String> unaryOperator = String::toLowerCase;
        System.out.println(unaryOperator.apply("TREZU"));

        // 4. если длина строки пять символов вернуть 5 звездочек. Иначе вернуть без изменений
        //    строку

        UnaryOperator<String> unaryOperator1 = str -> str.length() == 5 ? "*****" : str;
        System.out.println(unaryOperator1.apply("abcde"));
        System.out.println(unaryOperator1.apply("abc"));

        //5. вывести строку на печать в виде *строка*

        Consumer<String> consumer = str -> System.out.println("*"+str+"*");
        consumer.accept("hello");

        //6. напечатать " Hello Java "

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

    }
}

