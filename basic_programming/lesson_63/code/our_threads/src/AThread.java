public class AThread implements Runnable{

    private boolean flag;

    void flagFalse(){
        flag = false;
    }

   public AThread(){
        flag = true;
   }

   public  void run (){
        int count = 1;

        while (flag){
            System.out.println("Pass#"+count);
            count++;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }

   }
}
