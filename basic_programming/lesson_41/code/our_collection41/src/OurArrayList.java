public class OurArrayList<E> implements OurList<E>{

    private Object[] source;  // исходный массив
    private static final int INITIAL_CAPACITY = 16; // начальный размер нашего массива

    private int size; //  размер нашего листа


    public OurArrayList(){
        source = new Object[INITIAL_CAPACITY]; // инициализируем наш массив  в конструкторе при
                                                // создании нового листа
    }



    public void ourAdd( E value){
        if ( source.length == size){     // если массив полностью заполнен , то создается новый
            E[] newSource = (E[])new Object[source.length * 2];
            System.arraycopy(source,0,newSource,0,source.length);
            source = newSource;
        }
        source[size] = value;
        size++;
    }

    @Override
    public E ourGet(int index) {
        if( index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return (E) source[index];
    }

    @Override
    public void ourSet(E value, int index) {
        if( index >= size || index < 0)             // проверка находится ли индекс в разрешенных границах
            throw new IndexOutOfBoundsException();
        source[index] = value;
    }

    @Override
    public int ourSize() {
        return size;
    }

    @Override
    public boolean ourRemove(E value) {
        for ( int i = 0; i < source.length; i++){
            if( source[i].equals(value)){
                ourRemoveById(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E ourRemoveById(int index) {
        if( index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        E result =(E) source[index];

        System.arraycopy(source,index +1,source,index,source.length-(index + 1));
        size--;
        return result;
    }
}
