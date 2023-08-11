import java.util.List;
import java.util.stream.Collectors;

public class Homework {

    /*
    Пусть есть класс Person  с полями имя и возраст.
    // 1. Написать метод, возвращающий общий возраст всех людей старще 17 лет.
    // public static int countGeneralAge( List<Person> input)
    //
    // 2. Написать метод, возвращающий имена тех людей, которые являются в Германии совершеннолетними.
    // Должна быть возвращена примерно такая строка : in Germany Jack and Bill are of legal age
    // String isLegalAge(List<Person> input)

     */

    public static void main(String[] args) {
        Person person1 = new Person("Bill",12);
        Person person2 = new Person("Ann",20);
        Person person3 = new Person("Ben",30);
        Person person4 = new Person("Jack",50);
        List<Person>persons = List.of(person1,person2,person3,person4);
        System.out.println(countGeneralAge(persons));
        System.out.println(countGeneralAge2(persons));
        System.out.println(isLegalAge(persons));
    }

    public static int countGeneralAge( List<Person> input){
        return input
                .stream()
                .filter(s -> s.getAge() > 17)
                .map(Person::getAge)
                .reduce(0,Integer::sum);

    }

    public static int countGeneralAge2( List<Person> input){
        return input
                .stream()
                .filter(s -> s.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum();
    }

   public static String isLegalAge(List<Person> input){
       return input
               .stream()
               .filter(s -> s.getAge() > 17)
               .map(Person::getName)
               .collect(Collectors.joining(" and ","in Germany "," are of legal age."));
   }


}
