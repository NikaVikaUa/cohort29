import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Homework {
    public static void main(String[] args) {
        List<String> names = List.of("John","John","Bill","Mary","Bill","Mary");
        System.out.println(removeDuplicates(names));
        System.out.println(removeDuplicates1(names));


        System.out.println("-----task2-------");
        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",13);
        Address address3 = new Address("Street3",16);
        Address address4 = new Address("Street4",10);

        Person p1 = new Person("John",16,address1);
        Person p2 = new Person("Jack",34,address2);
        Person p3 = new Person("Peter",45,address3);
        Person p4 = new Person("John Smith",13,address3);
        Person p5 = new Person("Kate",67,address4);

        List<Person>list = Arrays.asList(p1,p2,p3,p4,p5);

        System.out.println(findAddresses(list));
    }

    /*
    Задача1
Написать метод, принимающий список имен,
где некоторые имена повторяются, и возвращающий список без повторений.
     */

    public static List<String> removeDuplicates( List<String> names){
        return names
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> removeDuplicates1( List<String>names){
        return names
                .stream()
                .collect(Collectors.collectingAndThen(toSet(), ArrayList::new ));
    }

    /*
    Задача2
Есть класс Address с полями String street и int houseNumber и класс Person с полями String name,
int age, Address address.
Написать метод, возвращающий адреса тех, кто старше 17 лет.
List < Address > findAddresses( List< Person > input )

В обоих задачах для решения использовать стримы
     */
   static List < Address > findAddresses( List< Person > input ){

        return input
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(Person :: getAddress)
                .collect(Collectors.toList());
    }


}
