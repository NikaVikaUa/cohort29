import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> actual = Arrays.asList("John", "Mary", "Stephan", "Amalia","Johan");

        Main m = new Main();
        System.out.println(m.removeLength4(actual));

    }

    /*
     Есть лист с именами : John, Mary, Stephan, Amalia,Johan. Написать метод, который вернет лист,
// в котором не содеражатся имена нашего листа длиной 4.
// [John, Mary, Stephan, Amalia,Johan] -> [Stephan, Amalia,Johan]
     */

    public  List<String> removeLength4 (List<String>list){
        List<String> result = new ArrayList<>();

        for( String s : list){
            if ( s.length() != 4)
                result.add(s);
        }
        return result;
    }

}
