import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Stephan");
        names.add("Amalia");
        names.add("Johan");
        removeNamesLength4(names);


    }

    // Есть лист с именами : John, Mary, Stephan, Amalia,Johan. Написать метод, который вернет лист,
    // в котором не содеражатся имена нашего листа длиной 4.
   // [John, Mary, Stephan, Amalia,Johan] -> [Stephan, Amalia,Johan]

    //public int myMethod( int num){}
    public static List<String> removeNamesLength4( List<String> names){
        List<String> result = new ArrayList<>();
        for(String s : names){
            if(s.length() == 4)
                names.remove(s);
        }
        return  result;
    }

}
