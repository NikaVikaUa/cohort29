public class OurThread extends Thread{

    public OurThread( String name ){ // передается имя потока
        super(name);
    }

    public void run(){ // здесь находится код, который и будет выполняться в потоке.

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
