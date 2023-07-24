import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Stack -  работает по принципу последний пришел - первый ушел
        /*
        LIFO ( Last in First Out)
        метод push() - добавляет элемент в конец стека
        метод pop() -  удаляеи элемент, который был добавлен последним
         */

        Stack<String> names = new Stack<>();
        names.push("John"); // [John]
        names.push("Jack"); // [John, Jack]
        names.push("Steeve"); // [John, Jack,Steeve]
        System.out.println(names);
        System.out.println("result of peek method is "+names.peek());
        System.out.println("names after peek method "+names);
        names.pop(); // удаляет последний элемент
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);

        System.out.println("--------QUEUE----------");
        // Queue

        /*
        Очередь реализована таким образом, что элементы добавляются в конец,
        а удаляются из начала очереди.
        FIFO - First In First Out

        Методы очереди :

        E element() - возвращает первый элемент
        boolean offer() -  аналогично add
        E remove() -  удаляет первый элемент и возвращает его значение
        E poll() - как и remove, но возвращает null  если очередь пустая
        E peek() - как и element, но возвращает null  если очередь пустая
         */

        // Priority Queue

        PriorityQueue<String> queue = new PriorityQueue<>(15,(a,b)->a.length() - b.length());
                //new PriorityQueue<>(15,new MyComparator());

        queue.add("John");
        queue.add("John Deer");
        queue.add("Ann");
        queue.add("Benjamin");

        while ( queue.size() != 0){
            System.out.println(queue.poll());
        }
        System.out.println("--Deque--");
        // Deque -  это двусторонняя очередь, т.е. добавлять и удалять элементы  можно с обеих сторон.

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Maggie");
        System.out.println(deque);
        deque.add("Bill");
        System.out.println(deque);
        deque.addLast("Rick");
        System.out.println(deque);
        deque.addFirst("John");
        System.out.println(deque);
        deque.add("Ann");
        System.out.println(deque);



    }
}
