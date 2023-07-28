import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {


    /*
    // Есть лист имен, где некоторые имена повторяются. Написать метод, который по имени вернет
    // количество вхождений этого имени в лист.
    // public nameToNumberOccurence ( List<String> list, String name)   -> 3
     */

    public int nameToNumberOccurence (List<String> list, String name){
        Map<String,Integer> nameByNumber = new HashMap<>();

        for( String s: list){
            if(nameByNumber.containsKey(s))
                nameByNumber.put(s,nameByNumber.get(s)+1);

            else
                nameByNumber.put(s,1);
        }
          return nameByNumber.getOrDefault(name,0);
        // метод getOrDefault() -  возвращает значение по ключу если оно существует или дефолтное
        // значение, если такого ключа нет. Дефолтное значение задается в качестве второго параметра метода.
        //
        }
}
