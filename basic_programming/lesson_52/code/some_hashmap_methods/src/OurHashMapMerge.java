import java.util.HashMap;

public class OurHashMapMerge {

    public static void main(String[] args) {
        //  метод merge()
        // hashmap.merge( key, value, remappingFunction)
        /*

         */
        HashMap<String,Integer> prices = new HashMap<>();
        prices.put("SonyTV", 200);
        prices.put("HPprinter",300);
        prices.put("SamsungHandy",150);

        System.out.println(prices);
        // новый ключ
      int returnedValue =  prices.merge("Clock",100, (oldValue,newValue)->oldValue+newValue);
        System.out.println("Price of clock: "+ returnedValue);

        System.out.println("updated map:");
        System.out.println(prices);


        // когда ключ есть
        HashMap<String,String> countries = new HashMap<>();
        countries.put("Paris","France");
        countries.put("Washington","America");
        countries.put("London","UK");

        System.out.println("countries: ");
        System.out.println(countries);

        String returnedCountry =
                countries.merge("London","England",(oldValue,newValue)->oldValue +"/" +newValue);

        System.out.println(returnedCountry);
        System.out.println(countries);


        // соединить две мапы с помощью метода merge()
        HashMap<String,Integer> prices1 = new HashMap<>();
        prices1.put("SonyTV", 200);
        prices1.put("HPprinter",300);


        HashMap<String,Integer> prices2 = new HashMap<>();
        prices2.put("SamsungHandy", 150);
        prices2.put("HPprinter",257);


        prices2.forEach((key,value)->prices1.merge(key,value,(oldValue,newValue)-> {
            if (oldValue < newValue){
                return oldValue;
            }
            else {
                return newValue;
            }

        }));
        System.out.println("prices1 new:");
        System.out.println(prices1);


    }
}
