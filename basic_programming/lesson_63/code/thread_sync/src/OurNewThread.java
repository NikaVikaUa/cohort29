public class OurNewThread implements Runnable {

    CommonResource resource;

    public OurNewThread( CommonResource resource){
        this.resource = resource;
    }

    public void run() {
        // при создании синхронизированного болока кода после synchronized  в скобках указывается обьект,
        //монитор которого блокируется и на это время доступ к  блоку кода имеет только поток, заблокировавший его.
        // После окончания работы блока кода, монитор разблокируется
        synchronized (resource) {
            resource.v = 1;
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " , resource = " + resource.v);
                resource.v++;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}
