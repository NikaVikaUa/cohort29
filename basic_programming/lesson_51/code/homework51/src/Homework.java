import java.util.*;

public class Homework {

    public static void main(String[] args) {

        Homework h = new Homework();
        List<String> names = List.of("John","Ann","Jnoh");

        System.out.println(h.findAnagrams("John",names));
        System.out.println(h.anagramsList("John",names));


    }


    public  List<String> findAnagrams(String name, List<String> names){
        Map<String,List<String>> anagrams = new HashMap<>();
        List<String> namesAndAnagrams = new ArrayList<>();
      //  String nameToUpperCase =name.toUpperCase();
        char[] nameToChar = name.toCharArray();
        char[] nToChar;
        Arrays.sort(nameToChar);
        for(String n:names){
            nToChar = n.toCharArray();
            Arrays.sort(nToChar);
            if(Arrays.equals(nToChar, nameToChar)){
                namesAndAnagrams.add(n);
            }
        }
        return namesAndAnagrams;
    }


    public List<String> anagramsList ( String str, List<String>strings){
        Map<String,List<String>> anagrams = new HashMap<>();

        for ( String s : strings){

            String sortedKey = sortAnagram(s);

            if ( anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            }else{
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey,value);
            }
        }
       return  anagrams.getOrDefault(sortAnagram(str),List.of());
    }

    private String sortAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
