public class Main {
    //  Синхронизация потоков
    // Чтобы избежать ситуации когда один поток не закончил работу с общим ресурсом, а другой
    // уже начал, надо синхронизировать потоки. Это можно сделать с помощью ключевого слова synchronized.
    // оно ставится перед блоком кода или методом, который нужно синхронизировать.

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();

        for( int i = 1; i <= 5; i++){
            Thread ourThread = new Thread( new OurNewThread1(commonResource));
            ourThread.setName("Thread"+i);
            ourThread.start();
        }
    }
}
