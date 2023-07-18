import java.util.LinkedList;
import java.util.List;

public class Main {

    /*
    LinkedList является еще одной разновидностью листа. Но в отличие от
    ArrayList   он иначе организован внутри. Его элементы не обязательно расположены
    рядом а соединяются указателями ( pointers). Каждый элемент такого листа это так называемая Нода (Node).
    Она состоит из двух частей - самих данных и адреса следующего элемента. Такой лист называется Singly linked list
    Кроме нод, линкедлист имеет указатель на адрес первого элемента, называемый Head .  В последней ноде в качестве
    адреса указан null.  Адрес каждого следующего элемента можно получить только дойдя до предыдущего элемента.

    В случае  же doubly linked list  нода состоит из трех частей: значение, адрес следующего элемента и адрес
    элемента
     */

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        // метод addLast  добавляет элемент в конец листа. Метод addFirst()  добавляет элемент в начало.
        stringLinkedList.addLast("John"); //
        System.out.println(stringLinkedList);
        stringLinkedList.addLast("Jack");
        System.out.println(stringLinkedList);
        stringLinkedList.addFirst("Ann");
        System.out.println(stringLinkedList);

     //   System.out.println(stringLinkedList);


        // getFirst() - получение первого элемента списка, getLast() - последнего элемента
       String nameFirst = stringLinkedList.getFirst();
       String nameLast = stringLinkedList.getLast();
        System.out.println("nameFirst = "+nameFirst);
        System.out.println("nameLast  = "+nameLast);

        // удаление первого элемента - метод removeFirst() , последнего removeLast()
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println(stringLinkedList);
    }
}
