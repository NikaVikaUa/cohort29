public interface OurList<E>{

    void ourAdd(E o); //  добавить значение

    E ourGet( int index); // получить значение ро индексу

    void ourSet(E o, int index ); // заменить значение по индексу

    int ourSize(); // возвращает размер нашего листа

    boolean ourContains( E o);

    boolean ourRemove(E o); //  удаляет элемент по значению

    E ourRemoveById( int index);//  удаление по индексу


}
