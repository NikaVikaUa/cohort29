public class OurThreadRun implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e){
            System.out.println("Has been interrupted");
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
