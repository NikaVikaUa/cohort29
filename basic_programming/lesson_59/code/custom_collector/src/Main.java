import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    /*
     Пусть есть класс Person  с переменными  String name  и int salary. Написать
     коллектор , считпющий суммарную зарплату всех сотрудников.
     */
    public static void main(String[] args) {
        Person p1 = new Person("John", 1500);
        Person p2 = new Person("Peter", 1800);
        Person p3 = new Person("Mary", 2600);
        Person p4 = new Person("Helen", 1000);


        Supplier<Box> supp = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box,Person> accumulator = (result,person)-> {
            result.setValue(result.getValue() + person.getSalary());
            System.out.println(result.getValue() +" "+person.getName());
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            System.out.println("Combining results");
            res1.setValue(res1.getValue() + res2.getValue());
            return res1;
        };

        Collector<Person, Box, Box> collector = Collector.of(
                supp,
                accumulator,
                combiner
        );
                /*
                T - тип обьектов коллекции
                A - тип обьекта аккумулятора
                R -  тип результата
                 */

        Box box = Stream.of(p1,p2,p3,p4)
                .parallel()
                .collect(collector);

        System.out.println("Total salary "+box);
    }
}
