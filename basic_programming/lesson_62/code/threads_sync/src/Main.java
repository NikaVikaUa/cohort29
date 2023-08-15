public class Main {
    //  Синхронизация потоков

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();

        for( int i = 1; i <= 5; i++){
            Thread ourThread = new Thread( new OurNewThread(commonResource));
            ourThread.setName("Thread"+i);
            ourThread.start();
        }
    }
}
