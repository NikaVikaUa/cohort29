import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {

    /*
     1. C использованием множеств (Set)  написать метод, который принимает лист, в котором могут быть
      повторяющиеся элементы и возвращает  лист без повторяющихся элементов.
      ["John","John", Jack,Bill,Jack] -> John,Jack, Bill

     2*. C использованием множеств написать метод, который вернет лист из повторяющихся элеменов из  начального листа .
      Пример:   ["John","John", Jack,Bill,Jack, Piter ]-> John,Jack
       */
  public List<String> removeDuplicates( List<String> input){
      Set<String> set = new HashSet<>(input);

      return new ArrayList<>(set);
  }


  public List<String> getDuplicates( List<String>input){
      Set<String>set = new HashSet<>();
      List<String> duplicates = new ArrayList<>();

      for( String s: input){
          if(!set.add(s) && !duplicates.contains(s))
              duplicates.add(s);
      }
      return duplicates;
  }

}
