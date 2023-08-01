import java.util.HashMap;

public class ForEachMethod {

    // hashmap.forEach(action)
   // action -  действия, которые должны быть выполнены с каждым элементом

    public static void main(String[] args) {
        HashMap<String,Integer> prices = new HashMap<>();
        prices.put("SonyTV", 200);
        prices.put("HPprinter",300);
        prices.put("SamsungHandy",150);

        prices.forEach((key,value)->{

            value = value/2;
            System.out.println(key+" = "+value);

        });
    }
}
