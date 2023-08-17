import java.util.concurrent.atomic.AtomicInteger;

public class OurAtomicInteger {

    public static void main(String[] args) {
        //создание
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger);

        AtomicInteger atomicInteger1 = new AtomicInteger(345);
        System.out.println(atomicInteger1);

        // получить значение

      int value =  atomicInteger1.get();
        System.out.println(value);

        //  установить значение
        atomicInteger1.set(765);
        System.out.println(atomicInteger1);

        // добавить значение

        AtomicInteger atomicInteger2 = new AtomicInteger();
        System.out.println( atomicInteger2.getAndAdd(10));
        System.out.println(atomicInteger.addAndGet(10));

        atomicInteger.incrementAndGet();
        atomicInteger.getAndIncrement();

    }


}
