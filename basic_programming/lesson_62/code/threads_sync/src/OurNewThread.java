public class OurNewThread implements Runnable {

    CommonResource resource;

    public OurNewThread( CommonResource resource){
        this.resource = resource;
    }

    public void run(){
        resource.v = 1;
        for( int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+" , resource = "+resource.v);
            resource.v++;
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
