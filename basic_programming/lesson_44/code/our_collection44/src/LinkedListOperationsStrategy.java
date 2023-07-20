import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListOperationsStrategy implements ListOperationsStrategy {
    private static final Object object = 10; // элемент, который мы будем добавлять в лист
    private Random rnd = new Random();


    public void ourAdd( int nTimes){
        List list = new LinkedList();

        for( int i = 0; i < nTimes; i++){
            list.add(object);
        }
    }

    public void ourGet(int nTimes, List list){
        int length = list.size();

        for( int i = 0; i < nTimes; i++){
            list.get(rnd.nextInt(length));// получение элементов листа случайным образом
        }
    }

    public List getFilledList( int length){
        List list = new LinkedList();

        for( int i = 0;i < length;i++){
            list.add(object);
        }
        return list;
    }

}
