import homework.Address;
import homework.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jack","Ann","Ali","Peter");
        System.out.println(sortByStringLength(names));
        System.out.println(partitioningList(names));

        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",13);
        Address address3 = new Address("Street3",16);
        Address address4 = new Address("Street4",10);

        Person p1 = new Person("John",16,address1);
        Person p2 = new Person("Jack",16,address2);
        Person p3 = new Person("Peter",45,address3);
        Person p4 = new Person("John Smith",45,address3);
        Person p5 = new Person("Kate",67,address4);

        List<Person>list = Arrays.asList(p1,p2,p3,p4,p5);

        System.out.println("-----grouping by age method--------------------");
        System.out.println(getPersonsByAge(list));

        //16 -> John, Jack
        //67 -> Kate
        // 45 -> Peter, John Smith
        getPersonsByAge(list).forEach((k,v)-> System.out.println(k + "->"
                        +v.stream().map(Person::getName).collect(Collectors.toList())));


        //сосчитать количество элементов
        list.stream().collect(Collectors.counting());


     Optional<Integer> res =  Stream.of(1,2,3,4,5,6).parallel().reduce((n1,n2)->n1 + n2);
        System.out.println(res.get());

        List<String> people = Arrays.asList("Jack","Tom","Kate","Bill","Ben","John");

        System.out.println("stream");
        people.stream().filter(name -> name.length()==4).forEach(System.out::println);

        System.out.println("\n parallelStream");
        people.parallelStream().filter(name -> name.length()==4).forEach(System.out::println);

        System.out.println("Collectors joining method");
        System.out.println(convertToString(people));
        System.out.println(convertToStringComma(people));
        System.out.println(convertToStringPrefix(people));


    }

    // GroupingBy method
    /*
    Написать метод, принимающий лист строк и группирующий их по длине строки. Т.е. метод будет
    возвращать мапу в которой ключами будут длины строк, а занчениями сеты соответствующих
    строк этой длины.

     */
    public static Map<Integer, Set<String>> sortByStringLength(List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.toSet()));
    }

    // метод partitioningBy() -  это особый случай метода groupingBy. Он принимает предикату и затем собирает
    // элементы стрима в мапу у которой в качестве ключей служат булеановские true  или false  а в качестве значений
    // набор элементов удовлетворяющих этому условию ( для ключа true)  или нет (клжч false)

    // написать метод , который группирует элементы  листа строк по длине строки >= 4

    public static Map<Boolean,List<String>> partitioningList( List<String>list){
        return list.stream()
                .collect(Collectors.partitioningBy(s->s.length() >= 4));
    }

    // написать метод, принмающий лист персонов, и возвращающий мапу, где возраст является ключом а
    // лист персонов этого возраста значением

    public static Map<Integer,List<Person>> getPersonsByAge( List<Person> input){
        return input
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    /*
    {16=[Person{name='John', age=16, address=Address{street='Street1', houseNumber=1}}, Person{name='Jack', age=16, address=Address{street='Street2', houseNumber=13}}], 67=[Person{name='Kate', age=67, address=Address{street='Street4', houseNumber=10}}], 45=[Person{name='Peter', age=45, address=Address{street='Street3', houseNumber=16}}, Person{name='John Smith', age=45, address=Address{street='Street3', houseNumber=16}}]}
     */

    //Написать метод, обьединяющий имена из листа стрингов в следующую строку:
    // name1name2name3
    public static String convertToString( List<String> list){
        return list
                .stream()
                .collect(Collectors.joining());
    }

    //Написать метод, обьединяющий имена из листа стрингов в следующую строку:
    // name1, name2, name3
    public static String convertToStringComma( List<String> list){
        return list
                .stream()
                .collect(Collectors.joining(" ,"));
    }


    //Написать метод, обьединяющий имена из листа стрингов в следующую строку:
    //Students:  name1, name2, name3 study Java
    public static String convertToStringPrefix( List<String> list){
        return list
                .stream()
                .collect(Collectors.joining(" ,","Students "," study Java"));
    }


}
