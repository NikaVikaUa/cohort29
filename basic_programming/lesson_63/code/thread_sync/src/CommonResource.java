public class CommonResource {

    int v;

 public  synchronized void increment(){
        v = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " , resource = " + v);
            v++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

}
