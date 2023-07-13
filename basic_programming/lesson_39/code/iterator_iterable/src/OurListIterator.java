import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OurListIterator {

    // ListIterator - интерфейс для листов. Он предоставляет больше возможностей,
    /*
    т.е. несколько доп методов.
    void add(E object) - вставляет элемент перед обьектом, который должен
                        быть возвращен методом next(). Остальные элементы сдвигаются

    boolean hasNext()  - тоже что и в обычном итераторе

    boolean hasPrevious() - возвращает true  если есть предыдущий элемент. Иначе false

    next()

    previous() - возвращает текущий элемент и переходит к предыдущему. Если его нет, то выбрасывает исключение

    int nextIndex() - возвращает индекс след. элемента. Если нет элемента, он возвращает размер листа
    int previousIndex() - возвращает индекс предыдущего элемента, а если его нет, то он возвращает -1

    void set (object) -  присваивает новое значение текущему элементу

    void remove()

     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jack");
        names.add("Bill");
        names.add("Ann");

        ListIterator<String> ourIterator = names.listIterator();

        System.out.println("moving forward");
        while(ourIterator.hasNext()){
            System.out.println(ourIterator.next());
        }
        ourIterator.set("Kate");


        System.out.println("\nmoving backwards");
        while (ourIterator.hasPrevious()){
            System.out.println(ourIterator.previous());
        }

    }
}
