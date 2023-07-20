import java.util.List;

public class ListPerformanceTester {

    private final ListOperationsStrategy strategy;

    public ListPerformanceTester( ListOperationsStrategy strategy){
        this.strategy = strategy;
    }

    public long testOurAddPerformance( int nTimes){ //тестирует время работы метода ourAdd
        long now = System.currentTimeMillis(); // время на момент запуска метода
        strategy.ourAdd(nTimes); // вызов метода ourAdd либо для OurArrayList либо OurLinkedList
        return System.currentTimeMillis() - now; // разница между временем окончания работы листа и начала и есть
                                                 // время его работы
    }


    public long  testOurGetPerformance( int nTimes, int length){
        List list = strategy.getFilledList(length);
        long now =System.currentTimeMillis();
        strategy.ourGet(nTimes,list);
        return System.currentTimeMillis() - now;
    }
}
