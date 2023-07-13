import java.util.Iterator;
import java.util.NoSuchElementException;

public class OurIterableString implements Iterable<Character>, Iterator<Character> {

    private String str;
    private int  counter = 0; // будет считать


    public OurIterableString(String str){
        this.str = str;
    }

    // следующие три метода реализуют интерфейс Итератор (Iterator)

    public boolean hasNext(){
        if( counter < str.length()){
            return true;
        }
        return false;
    }


    public Character next(){
        if( counter == str.length())
            throw new NoSuchElementException(); // отсутствует элемент, который можно вернуть. Конец строки

        counter++;
        return str.charAt(counter-1);
    }

    public void remove(){
        throw new UnsupportedOperationException(); // опреация не поддерживается
    }

    //этот метод реализует интерфейс Iterable
    public Iterator<Character>iterator(){
        return this;
    }


}
