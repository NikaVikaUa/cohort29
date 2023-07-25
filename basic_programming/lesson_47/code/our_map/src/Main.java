import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    Map - это интерфейс. В мапе есть ключи (keys) и есть значения ( values)
    Каждому ключу соответствует определенное значение.  В качестве ключей могут быть
    различные типы данных, не только целые числа. Ключи в мапе уникальны, значения
    могут повторяться.
    Основные классы, реализующие интерфейс Мап это :
    -HashMap
    - TreeMap
    - LinkedHashMap

    HashMap

     */

    public static void main(String[] args) {

      //  HashMap<K,V>
      // K - тип ключа в паре ключ-значение
      // V - тип значения
      HashMap<Integer,String> countries = new HashMap<>() ;
        Map<String,Integer>example1 = new HashMap<>();


        // добавление элемента в мапу - метод put()
        countries.put(109,"France");
        countries.put(54,"USA");
        countries.put(189,"Belgium");
        countries.put(153,"France");
        countries.put(53,"Poland");
        countries.put(109,"Hungary");

        System.out.println(countries);

        // получение элемента - метод get()

      String country =  countries.get(53);
        System.out.println(country);


        // удаление элемента - remove()

        countries.remove(53);
        System.out.println(countries);

        // размер мапы  size()
        System.out.println(countries.size());

        // isEmpty() - проверяет пустая ли мапа
        // clear() -  удаляет все элементы

        System.out.println(countries.isEmpty());
      //  countries.clear();
        System.out.println(countries.isEmpty());

        //containsKey() -  содержится ли элемент с таким ключом

        System.out.println(countries.containsKey(54));

        // containsValue() -  содержится ли значение
        System.out.println(countries.containsValue("France"));

        //  перебор элементов мапы.
        // 1. с помощью набора ключей (keySet)

        System.out.println("====get values  by keySet");
        for( int key : countries.keySet()){
            System.out.println(key +" : "+countries.get(key));
        }

        //2. с помощью набора ключ-значение
        System.out.println("====get values  by entrySet");
        for (Map.Entry<Integer,String>entry: countries.entrySet()){
            int key = entry.getKey();
            String countryValue = entry.getValue();

            System.out.println(key+" : "+ countryValue);
        }

        // перебор по значениям. Получение значений с помощью метода values()
        System.out.println(countries.values());

    }
}
