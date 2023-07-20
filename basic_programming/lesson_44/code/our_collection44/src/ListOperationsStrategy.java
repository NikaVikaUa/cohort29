import java.util.List;

public interface ListOperationsStrategy {

    void ourAdd(int nTimes);

    List getFilledList(int length);


    void  ourGet ( int nTimes, List list);
}
