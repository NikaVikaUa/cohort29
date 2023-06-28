import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        // интерфейс Predicate - один из стандартных функциональных интерфейсов Java. Этот интерфейс уже написан и
        // нам самим писать его не нужно, можно сразу пользоваться и реализовывать его метод test
        // Он имеет абстрактный метод test, возвращающий boolean.

        Predicate<String> predicate = s -> s.length() == 3;// реализация метода test для  строки
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("abcd"));

        Predicate<Integer> age = i -> i >=17; // реализация для целого числа
        System.out.println(age.test(10));
        System.out.println(age.test(25));

        //  дефолтные методы интерфейса Predicate

        // and()
        Predicate<Integer>old = i -> i<80;

        System.out.println(age.and(old).test(20));  // чтобы результат был true обе предикаты должны вернуть true
        System.out.println(age.and(old).test(5));
        System.out.println(age.and(old).test(105));

        // or() -  возвращает true  если одна из предикат true

        Predicate<String> containsHello = s -> s.contains("hello");
        Predicate<String> containsJava = s -> s.contains("java");
        System.out.println("Hello Java predicates");
        System.out.println(containsHello.or(containsJava).test("hello world"));
        System.out.println(containsHello.or(containsJava).test("java world"));
        System.out.println(containsHello.or(containsJava).test("hello java"));
        System.out.println(containsHello.or(containsJava).test("my name"));


        // negate() -  возвращает true  если условие не выполняется
        Predicate<Integer> adult = i -> i>17;
        System.out.println(adult.negate().test(2)); //  меняет результат на противоположный

        // & | !

    }
}
