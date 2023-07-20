public class OurLinkedList<E> implements OurList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public OurLinkedList(){

    }


    public void ourAdd(E value){ //  добавить значение в лист
        if(size > 0){ // если уже есть хотя бы один элемент
            Node<E> newNode = new Node<>(null,last,value);
            last.next =newNode;
            last = newNode;

        } else { // если лист пустой
            Node<E> newNode = new Node<>(null, null, value);
            first = newNode;
            last = newNode;
        }
        size++;
    }


    public E ourGet( int index){ // получает значение из листа
        if( index >=size || index < 0) // находится ли индекс в границах листа
            throw new IndexOutOfBoundsException();

        Node<E> needle = getNode( index );

        return needle.value; // возвращает значение, записанное в ноде
    }


    private Node<E> getNode( int index){ // поиск ноды по индексц
        Node<E> needle = first; // присваиваем значение самого первого элемента
        for(int i = 0; i < index; i++){
            needle = needle.next; // в цикле проходим последовательно по всем элементам пока i не равно index
        }
        return needle;
    }

    public void ourSet( E o, int index){ // заменить значение по индексу
        if( index >=size || index < 0) // находится ли индекс в границах листа
            throw new IndexOutOfBoundsException();

        Node needle = getNode(index); // находим нужный элемент
        needle.value = o;  // меняем значение
    }

    public int ourSize(){
        return size;
    }

    public boolean ourContains( E o){ //  проверяет есть ли искомый элемент в листе
        Node needle = first;

        for( int i = 0; i < size; i++){
            if ( needle.value.equals(o)) // если находится значение элемента равное о, то возвращаем true
                return true;

            needle = needle.next; //  переход к следующей ноде
        }
        return false;
    }


    public boolean ourRemove ( E o){ //  удаоить элемент из листа по значению
        Node needle = first;

        for( int i = 0; i < size; i++){
            if ( needle.value.equals(o)) { // если находится значение элемента равное о, то удвляем его и возвращаем true
                ourRemoveById(i);
                return true;
            }
            needle = needle.next; //  переход к следующей ноде
        }
        return false;

    }


    public E ourRemoveById( int index){
        if( index >=size || index < 0) // находится ли индекс в границах листа
            throw new IndexOutOfBoundsException();

        Node<E> nodeToRemove = getNode(index); //  находим элемент, который нужно удалить
        Node<E> left = nodeToRemove.prev;
        Node<E> right = nodeToRemove.next;

        if( index > 0 && index < size -1){ //случай, когда элемент не первый и не последний
                nodeToRemove.next = null;
                nodeToRemove.prev = null;

                left.next = right;
                right.prev = left;

        } else if (index == 0){ // если нужно удалить самую первую ноду
            right.prev = null;
            first = right;

        } else {  //если нужно удалить последнюю ноду
            left.next = null;
            last = left;
        }

        size--;

        return  nodeToRemove.value;


    }




    private static class Node<E>{
        E value;
      Node<E> next; //ссылка на след.элт
      Node<E> prev; // ссылка на предыдущий

      Node(){}

      Node( Node<E>next, Node<E> prev, E value)  {
          this.next = next;
          this.prev = prev;
          this.value = value;
      }


    }
}
