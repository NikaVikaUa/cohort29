import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class AnotherDequeTask {

    /*
    Написать метод, принимающий упорядоченный лист интов и целое число n  и проверяющий
    есть ли такие 2 числа в листе, что их произведение равно n/
    [1,2,3,4,5 ], 6  ->  true
    [1,2,3,4,5 ], 7  ->  false
     */

    public boolean multiplyTwo (List<Integer> list, int n){
        if( list.get(0) > n) return false;

        for ( int i = 0; i < list.size(); i++){
            for ( int j = i +1 ; j < list.size();j++){
                if( list.get(j)*list.get(i)==n)
                    return true;
            }
        }
        return false;
    }

    /*
    1. Создать новую деку.
    1. Пройти по листу и отфильтровать числа делением N  на это число. Если остаток равен нулю, значит
        потенциально  это один из множителей и мы его добавляем в созданную деку
    2.

      1 , 3 ,6, 9     n = 18
     */

    public boolean multiplyTwoDeque( List<Integer> nums, int n){
        Deque<Integer> result = new ArrayDeque<>();

        for( int num: nums){
            if( n % num == 0)
                result.add(num);
        }

        while ( result.size()>1){
            if( result.getFirst() * result.getLast() < n)
                result.removeFirst();
            else if ( result.getFirst() * result.getLast() > n)
                result.removeLast();
            else
                return true;
        }
        return false;
    }
}
