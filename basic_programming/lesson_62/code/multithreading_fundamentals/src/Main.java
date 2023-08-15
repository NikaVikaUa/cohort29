public class Main {
   /*
    есть два вида многозадачности :
    1. process-based  - когда выполняется несколько программ ( процессов) одновременно
    2. thread -based  -  когда выполняется несколько задач в одной программе  одновременно
     Состояния потока :
     New -  еще не запущенный поток
     Running - испоняющийся
     Blocked - заблокированный поток, который ждет возможности возобновления работы
     Waiting - состояние ожидания возобновления работы
     Terminated -  закончивший работу

     // многопоточность в джаве основана на классе Thread и интерфейсе Runnable

     // основные методы класса Thread:
        getName() -  возвращает имя потока
        getPriority() - возвращает приоритет потока
        setPriority( int priority) -  установить приоритет
        isAlive() - возвращает true  если поток активен
        isInterrupted -  true  если поток был прерван
        join() - ожидает заврешение потока
        run() - точка входа в поток
        sleep() -  приостанавливает выполнение потока
        start() -  запускает поток
    */
   public static void main(String[] args) throws InterruptedException {
    //   Thread t = Thread.currentThread();
    //   System.out.println(t.getName());
    //   System.out.println(t);

       //  создание потоков

      // 1. наследование от класса Thread

       System.out.println("Main thread  started");
       Thread thread1 = new OurThread("OurThread1");
       Thread thread2 = new OurThread("OurThread2");

       thread1.start();
       thread2.start();


           thread1.join();
           thread2.join();


   //    for (int i = 3; i < 10; i++)
   //        new OurThread("OurThread"+i).start();


       Thread ourThread = new OurThread("ourThreadNew");
       ourThread.start();
       ourThread.join();

       // 2. реализация интерфейса runnable -  имеет единственный метод run()
       // конструктор Thread( Runnable runnable, String name)

       Thread ourThreadRun = new Thread( new OurThreadRun(),"MyRunnable Thread");
       ourThreadRun.start(); // используется для запуска потока
       ourThreadRun.join();

       System.out.println("Main thread finished");


   }

}
