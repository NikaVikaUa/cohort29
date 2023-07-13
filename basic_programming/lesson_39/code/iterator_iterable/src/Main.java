import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    // Интерфейс Итератор

    /*
    interface Iterator<E>{

    E next() - позволяет получить следующий элемент при переборе листа
    boolean  hasNext() - позволяет узнать есть ли следующий элемент  и не достигли ли мы конца листа.
                        Если элемент еще есть, то вернется true
    void remove() -  удаляет текущий элемент
    }

     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jack");
        names.add("Bill");
        names.add("Ann");


       Iterator<String> ourIterator = names.iterator(); // получаем обьект итератор с помощью iterator()

        System.out.println(ourIterator.next());
        System.out.println(ourIterator.next());
        System.out.println(ourIterator.next());
        System.out.println(ourIterator.next());
        if(ourIterator.hasNext())
            System.out.println(ourIterator.next());

        while (ourIterator.hasNext()){
            String name =ourIterator.next();
            if(name.length() == 3)
                ourIterator.remove();
        }
        System.out.println(names);
    }



}
