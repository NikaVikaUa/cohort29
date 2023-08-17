public class CharThread extends Thread{

    /*
    Написать метод 100 раз печатающий char и вывести на экран результат его работы для двух потоков ( например,
     один поток печатает # , второй *). В конце должно выводиться " end of main"
     */
    private final char symbol;

    public CharThread( char symbol){
        this.symbol = symbol;
    }

    public void run(){

        for( int i = 0; i < 100; i++){
            System.out.println(symbol);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
