public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main started");

    //    AThread aThread = new AThread();
     //   new Thread(aThread,"AThread").start();


     //   Thread.sleep(1500);

     //   aThread.flagFalse();

     //   Thread.sleep(1500);
     //   System.out.println("main finished");

        BThread bThread = new BThread("BThread1");
        bThread.start();

        Thread.sleep(500);
        bThread.interrupt();

    //    Thread.sleep(500);


        System.out.println("main finished");
    }

}
