public class OurNewThread1 implements Runnable{
    CommonResource resource;

    OurNewThread1( CommonResource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.increment();
    }
}
