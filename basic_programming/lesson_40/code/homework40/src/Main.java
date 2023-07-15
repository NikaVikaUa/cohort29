import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main m =new Main();

        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(17);
        ints.add(5);
        ints.add(6);
        ints.add(9);

        System.out.println(m.removeNumbersBiggerThanN(ints,8));
        System.out.println(m.removeNumbersBiggerThanNWithIterator(ints,8));


    }

    /*
    Написать метод, принимающий лист целых чисел и целое
    число и возвращающий лист только с элементами меньшими этого числа
     */

   // решение  через for each
    public List<Integer> removeNumbersBiggerThanN (List<Integer>input, int n){
        List<Integer> result = new ArrayList<>();

        for( Integer i : input){
            if(i<n)
                result.add(i);
        }
        return result;
    }

    // решение с итератором
    public List<Integer> removeNumbersBiggerThanNWithIterator (List<Integer>input, int n){

        Iterator<Integer> iterator = input.iterator();

        while( iterator.hasNext() ){
            if( iterator.next() >= n)
                iterator.remove();
        }
        return input;
    }

}
