import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    Задача1
Создать мапу с именами в качестве ключей и возрастом в качестве значений.
Добавить несколько пар ключ-значение в нее и вывести на экран в таком виде : имя : возраст
*/
    public static void main(String[] args) {
        Map<String,Integer> namesByAge = new HashMap<>();
        namesByAge.put("John",25);
        namesByAge.put("Bill",37);
        namesByAge.put("Ann",20);

        for ( Map.Entry<String,Integer>entry: namesByAge.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }



    /*
Задача2
Дана Map<String, String> map. Написать метод, который вернет Мап, такую, что если в исходной
map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
Если нет, ничего не менять Примеры: mapAB({"a": "Hi", "b": "There"}) →
{"a": "Hi", "ab": "HiThere", "b": "There"} mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
     */

    public Map<String,String> ab( Map<String,String>mapAB){

        if ( mapAB.containsKey("a") && mapAB.containsKey("b"))
            mapAB.put("ab",mapAB.get("a").concat(mapAB.get("b")));

        return mapAB;
    }
}
