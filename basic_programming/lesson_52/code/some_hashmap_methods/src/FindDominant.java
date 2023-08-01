import java.util.HashMap;
import java.util.Map;

public class FindDominant {
    /*
    Есть массив целых положит  чисел . Найьт элемент если он есть, встречающийся
    в массиве больше половины раз, т.е. больше length/2.
    Если нет , вернуть -1
    2 2 2 2 3 3 3 3
     */

    public int findDominant( int[] ints){
        Map<Integer,Integer> occurences = new HashMap<>();

        for(int i : ints){
        int res = occurences.merge(i,1, (oldVal,newVal)->oldVal+newVal);
            if(res > ints.length/2){
                return i;
            }
        }
        return  -1;
    }
}
