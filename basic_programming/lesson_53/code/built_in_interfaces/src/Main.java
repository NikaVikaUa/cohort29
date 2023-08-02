import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Встроенные йункциональные интерфейсы.
        //Основные из них:
        //Predicate - проверяет соблюдение определенного условия. Если оно соблюдается, возвращает true.
        //  метод в этом интерфейсе называется test
        //  boolean test(T t)
        Predicate<Integer>predicate = x -> x > 0;
        System.out.println(predicate.test(56));
        System.out.println(predicate.test(-56));

        // BinaryOperator<T>  принимает два обьекта типа Т , что-то с ними делает и возвращает тоже обьект Т
        // метод  T apply( T o1, T o2)
        BinaryOperator<Integer> plus = (a,b)->a + b;

        // UnaryOperator<T> - принимает обьект типа Т , что-то с ним делает т возвращает результат в виде
        // обьекта типа Т   метод  T apply( T o1)
        UnaryOperator<Integer> power = num -> num*num*num;
        System.out.println(power.apply(2));

        // Function<T,R> меняет тип обьекта  с T на R
        // R apply ( T t)
        Function<Integer,String> transform = num -> String.valueOf(num);
        System.out.println(transform.apply(345));

        // Consumer<T> -  выролняет какое-то действие над обьектом  ничего не возвращая
        // метод void accept(T t)
        Consumer<Integer> print = num -> System.out.println(num);
        print.accept(1234);

        // Supplier<T> - не принимает параметров, но возвращает обьект типа Т
        // метод  T get()
    }
}
