import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

   /*
    Двоичное дерево
        Правила построения:
        1. Каждый узел имеет не более двух детей
        2. Каждое значение, которое меньше значения узла, станет левым ребенком
        3. Каждое значение, большее или равное значению узла, станет правым ребенком




        // TreeSet -  сортирует элементы по возрастанию
    */

    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();

        countries.add("Germany");
        countries.add("Germany");
        countries.add("England");
        countries.add("Bangladesh");
        countries.add("Bangladesh");
        countries.add("Austria");
        countries.add("Australia");

        System.out.println(countries);


        // LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
      //  TreeSet<Integer> linkedHashSet = new TreeSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(2);
        linkedHashSet.add(23);

        System.out.println(linkedHashSet);
    }
}
