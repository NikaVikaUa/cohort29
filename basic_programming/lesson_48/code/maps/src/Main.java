import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

    //TreeMap -   в основе TreeMap - красно-черные  деревья
    //  В отличие от HashMap  элементы упорядочены в соответствии с естественным порядком ключей мапы.

    public static void main(String[] args) {


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(45,"Orange");
        treeMap.put(25,"Apple");
        treeMap.put(450,"Banana");
        treeMap.put(32,"Plum");
        treeMap.put(67,"Kiwi");

        System.out.println(treeMap);


        //LinkedHasMap - сохраняет порядок который был при добавлении элементов

        System.out.println("LinkedHashMap");

        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>();
        lhMap.put(45,"Orange");
        lhMap.put(25,"Apple");
        lhMap.put(450,"Banana");
        lhMap.put(32,"Plum");
        lhMap.put(67,"Kiwi");

        System.out.println(lhMap);

        Order o1 = new Order (1,"order1");
        Order o2 = new Order(1,"order1");
        Order o3 = new Order(1456,"order2");

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
    }
}
