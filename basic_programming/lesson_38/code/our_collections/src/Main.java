import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    // Java Collections Framework
    /*
    Коллекции  - это ряд интерфейсов и классов, с посощью которых
    осуществляется эффективное хранение и обработка данных

    List. -  упорядоченная коллекция ,  которая  также позволяет хранить повторяющиеся значения.
    При доступе или записи элементов используется доступ по интдексу также как и в массиве
    Классы, реализующие интерфейс Лист это ArrayList и LinkedList

    ArrayList -  реализует интерфейс List  и в основе его массив, размеры которого меняются по мере заполнения.

     */
    public static void main(String[] args) {

        // Конструкторы ArrayList:
        // ArrayList() - для создания пустого листа
        ArrayList<Integer> list = new ArrayList<>();

        // ArrayList( int capacity)- создает лист с определенной начальной емкостью
        ArrayList<Integer>listCapacity = new ArrayList<>(1000);

        //ArrayList( Collection c)- создает лист, в который можно сразу добавить элементы например другого листа
        ArrayList<Integer>newList = new ArrayList<>(list);

        /*
        методы ArrayList:

        add() - добавить элемент
         */
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        // add(int index, object)- добавить элемент по индексу
        names.add(1,"Peter");

        System.out.println(names);


        // set(int index, newObject) -  изменить значение элемента
        names.set(2,"Barbara");

        System.out.println(names);

        // remove(Оbject) - удалить элемент из листа  по имени элемента. Если в листе несколько элементов с таким
                            // названием, то будет удален тот, который встретится раньше
        names.add("John");
        System.out.println("with two Johns:");
        System.out.println(names);
        names.remove("John");
        System.out.println("Array without John:");
        System.out.println(names);

        // remove(int index) ´- удаляет элемент , находящийся по данному индексу. После удаления элементы сдвигаются
                                // влево

        names.remove(1);
        System.out.println(names);

        //get(int index)-  получить элемент по индексу
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        //печать листа через for each
        System.out.println("Print list with for Each cycle");
        names.add("Tyrion Lannister");
        names.add("Sandor Clegane");
        names.add("White Wanderer");
        for(String name: names){
            System.out.println(name);
        }

       boolean res = names.add("Cersei Lannister");
        System.out.println(res);

        //size() -  возвращает размер листа

        System.out.println("Number of names in our arraylist: "+names.size());
        System.out.println(names);

        //sort ArrayList  Collections.sort() - сортировка листа осуществляется с помощью метода sort()
        // из вспомогательного класса Сollections
        System.out.println("names before sort:");
        System.out.println(names);
        System.out.println("names after sort:");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("Sorted in reverse order:");
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);

        // boolean contains(Object o) - проверяет содержится ли искомый обьект в листе. Если да, вернет true

        System.out.println("names contains John ?"+names.contains("John"));

        // clear() -  удаляет все элементы из листа.
        // isEmpty() - проверяет пустой ли лист

        System.out.println("is list empty? "+names.isEmpty());
        names.clear();
        System.out.println("is list empty? "+names.isEmpty());
        System.out.println(names);

        // indexOf(Object o) - возвращает индекс элемента в листе. Если элемент не найден, то вернет -1
        names.add("Tyrion Lannister");
        names.add("Sandor Clegane");
        names.add("White Wanderer");
        names.add("White Wanderer");
        System.out.println(names);

        int position = names.indexOf("Black Wanderer");
        System.out.println(position);

        for(String name: names){
            System.out.println(name);

        }




    }
}
