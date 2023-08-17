public class Main {
    //  Сотрудники банка выдают кредиты. Причем каждый выдает в опреденном диапазоне времени - минимальное время и макс.
    /*
    время нужное ему для выдачи кредита. minTime  and maxTime
    При этом есть один сотрудник, у которого неожиданно возрастает работоспособность и он начинает выдавать кредиты быстрее.
    А затем скорость опять может снизиться до обычной.
    Посчитать время , за которое каждый сотрудник выдаст n  кредитов.
     */

    private static final int MIN_TIME = 100;
    private static final int MAX_TIME = 150;
    private static final int CREDITS_NUM = 20;

    public static void main(String[] args) throws InterruptedException {
        AbstractClerk mary = new RegularClerk("Mary",
                (int) (MIN_TIME / 1.2),
                (int) (MAX_TIME / 1.2),
                CREDITS_NUM);
        AbstractClerk peter = new RegularClerk("Peter", MIN_TIME, MAX_TIME, CREDITS_NUM);
        AbstractClerk john = new LazyInspiredClerk("John",
                MIN_TIME,
                MAX_TIME,
                CREDITS_NUM,
                1.5);

        AbstractClerk[] clerks = {mary, peter, john};

        Thread th1 = new Thread(mary);
        Thread th2 = new Thread(peter);
        Thread th3 = new Thread(john);

        long startTime = System.currentTimeMillis();
        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        for (int i = 0; i < clerks.length; i++) {
            System.out.println(" The clerk named " + clerks[i].getName() + " issued " + " all credits for " +
                    (clerks[i].getFinishTime() - startTime));
        }
    }
}
