// <>  угловые скобки используются для определения типа параметра
public class Example<T> {

    T obj;

    public Example( T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }

}
