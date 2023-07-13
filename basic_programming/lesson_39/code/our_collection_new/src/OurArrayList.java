public class OurArrayList<E> implements OurList{

    private Object[] source;  // исходный массив
    private static final int INITIAL_CAPACITY = 16; // начальный размер нашего массива

    private int size; //  размер нашего листа


    public OurArrayList(){
        source = new Object[INITIAL_CAPACITY]; // инициализируем наш массив  в конструкторе при
                                                // создании нового листа
    }



    @Override
    public void ourAdd(Object o) {

    }

    @Override
    public Object ourGet(int index) {
        return null;
    }

    @Override
    public void ourSet(Object o, int index) {

    }

    @Override
    public int ourSize() {
        return size;
    }

    @Override
    public boolean ourRemove(Object o) {
        return false;
    }

    @Override
    public Object ourRemoveById(int index) {
        return null;
    }
}
