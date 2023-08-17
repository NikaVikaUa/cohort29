public class BThread extends Thread{

    public BThread( String name){
        super(name);
    }

    public void run(){
        int count = 1;

        while(!isInterrupted()) {
            System.out.println("Pass#" + count);
            count++;
        }
    }
}
