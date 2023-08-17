public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starting");

        Thread hashThread = new CharThread('#');
        Thread starThread = new CharThread('*');

        hashThread.start();
        starThread.start();

        do{
            System.out.print(".");
                Thread.sleep(100);


        }while(hashThread.isAlive()||starThread.isAlive());

      //  hashThread.join();
      //  starThread.join();

        System.out.println("end of main");
    }
}
