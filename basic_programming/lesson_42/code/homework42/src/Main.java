import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)throws EmptyListException {

        List<Integer> ints1 = Arrays.asList(1,2,5000,67);
        List<Integer> ints2 = Arrays.asList(1,3,5000,6);

        Main m = new Main();
        System.out.println(m.returnYesOrNo(ints1,ints2));


        List<String> strings = Arrays.asList("bb","aaa","c");

        System.out.println(m.findShortestOrLongest(strings));



    }
    // Homework
    //I. Есть два листа одинаковой длины с целыми числами. Написать метод, который вернет
    // лист  с элементами Yes или No,  где значение на i-ом месте зависит от того, равны
    // ли элементы двух листов  под номером i.
     // Например: [1,2,3,4] and [5,2,3,7]  вернет [No,Yes,Yes,No]
    // Протестировать



   // 1. public List<String> returnYesOrNo ( List<Integer> list1, List<Integer> list2)
   // 2. создать новый лист стрингов resultYesNo
   // 3. в цикле пройти по листам цедых чисел list1  и list2  сравнивая элементы. Если соотвтествующие элементы
   //    равны, то в лист resultYesNo записывается Yes и No  в противном случае.
   // 4.вернуть результат  , т.е. получившийся лист стрингов resultYesNo
   public List<String> returnYesOrNo (List<Integer> list1, List<Integer> list2){
       List<String> resultYesNo =new ArrayList<>();

       for( int i = 0;i<list1.size();i++){
            if(list1.get(i).equals(list2.get(i)))
                resultYesNo.add("Yes");
            else resultYesNo.add("No");
        }
        return resultYesNo;
   }


    /*
    II*  Есть лист со строками. Написать метод, возвращающий строку, которая встречается в листе раньше -
         самую короткую или самую длинную. Известно, что все строки в листе разные. Если лист пустой - бросить
         бросить EmptyListException
         пример 1: [bb, a, fff, dddd] -> a - самый короткий  элемент a  встречается раньше
         пример 2: [bb, aaa, ff, d] -> aaa - самый длинный элемент aaa встречается раньше
         Протестировать

        1. public String findShortestOrLongest( List<string> list) throws EmptyListException
        2. проверить не пустой ли лист и если пустой, то бросить exception
        3. В цикле пройти по листу находя максимальный и минимальный  элементы и запомнить их индексы.
        4. Сравнить индексы и вернуть элемент индекс которого будет меньше.

     */
    public String findShortestOrLongest( List<String> list) throws EmptyListException{
        if ( list.isEmpty()) throw new EmptyListException();

        String minSizeElement = list.get(0);
        int indexMinElement = 0;
        String maxSizeElement = list.get(0);
        int indexMaxElement = 0;

        for( int i = 0; i < list.size(); i++){
            if(list.get(i).length() < minSizeElement.length()){
                minSizeElement = list.get(i);
                indexMinElement = i;
            }else if (list.get(i).length() > maxSizeElement.length()){
                maxSizeElement = list.get(i);
                indexMaxElement = i;
            }
        }
        if ( indexMinElement < indexMaxElement)
            return minSizeElement;
        return maxSizeElement;
    }




}
