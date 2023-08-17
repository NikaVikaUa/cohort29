import java.util.concurrent.atomic.AtomicInteger;

public class TestCounter {

    public static void main(String[] args)throws InterruptedException {
       final  Counter counter = new Counter();

       for( int i = 0; i < 1000; i++){

           new Thread(new Runnable() {
               @Override
               public void run() {
                   counter.increment();
               }
           }).start();

       }
       Thread.sleep(6000);
        System.out.println(counter.value());
    }



    static class Counter{
        private AtomicInteger count = new AtomicInteger(0);

        public void increment(){
            count.getAndIncrement();
        }

        public int value(){
            return count.get();
        }
    }
}
