import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    // Set  - коллекция, в которой не может содержаться дубликатов.
    /*
     Есть три основные реализации Сета. Это HashSet, TreeSet, LinkedHashSet

     HashSet

     1. Внутри HashSet   использует HashTable, а фактически  обьект HashMap.
     2. Элементы из Hashset возвращаются в произвольном порядке.
     */

    public static void main(String[] args) {

        // добавление элементов с помощью метода add()
        Set<String> countries = new HashSet<>();
        countries.add("France");
        countries.add("France");
        countries.add("Germany");
        countries.add("Germany");
        countries.add("Great Britain");

        for( String country: countries)
            System.out.println(country);

        System.out.println(countries);


        System.out.println("List in Set");
        List<String> countries1 = new ArrayList<>();
        countries1.add("France");
        countries1.add("France");
        countries1.add("Germany");
        countries1.add("Germany");
        countries1.add("Great Britain");
        System.out.println(countries1);

        Set<String> setCountries = new HashSet<>(countries1);
        System.out.println("Countries in set: "+setCountries);

        // удаление элементов метод remove()
        setCountries.remove("France");
        System.out.println("Without France: "+setCountries);

        setCountries.addAll(countries1);
        System.out.println("Add all countries"+ setCountries);

    }

    /*
    некоторые конструкторы его:
    HashSet () -создает пустой хэшсет
    HashSet (Collection) - создается хешсет с элементами, скопированными из коллекции
     */




}
