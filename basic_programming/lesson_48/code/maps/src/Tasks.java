import java.util.HashMap;
import java.util.Map;

public class Tasks {

    /*
    Дан маасив строк ( не пустой). Написать метод, принимающий этот массив и возвращающий
    мапу Map<String,Boolean> , где каждая строка является ключом, а значением является
    true  если строка в массиве встречается больше одного раза и false если только один раз.

    Примеры:
    ["a","b","a","c","b"] -> { "a": true, "b":true, "c":false}
    ["a","b","c"] -> { "a": false, "b":false, "c":false}
    ["c","c","c","c"] -> { "c":true}

     */
   public  Map<String,Boolean> countWords( String[] strings){
        Map<String,Boolean> moreThanOne = new HashMap<>();

        for ( String s : strings){
            if ( moreThanOne.containsKey(s)) {
                moreThanOne.put(s, true);
            }
            else {
                moreThanOne.put(s,false);
            }
        }
        return moreThanOne;
    }

    // Есть лист имен, где некоторые имена повторяются. Написать метод, который по имени вернет
    // количество вхождений этого имени в лист.
    // public nameToNumberOccurence ( List<String> list, String name)   -> 3
}
