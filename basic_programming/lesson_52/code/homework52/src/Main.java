import java.util.*;

public class Main {


    public Map<String, Set<Auto>> autoByMake(List<Auto> autos){
        Map<String,Set<Auto>> autoByMakeMap = new TreeMap<>();

        for(Auto auto:autos){
            if( autoByMakeMap.containsKey(auto.make)){
                Set<Auto> value = autoByMakeMap.get(auto.make);
                value.add(auto);
                autoByMakeMap.put(auto.make,value);
            }
            else{
                Set<Auto>value = new TreeSet<>();
                value.add(auto);
                autoByMakeMap.put(auto.make,value);
            }

        }
        return autoByMakeMap;
    }


    public Map<Character, List<String>> getWordsByLetter( List<String>words){
        Map<Character,List<String>>wordsByLetterMap = new TreeMap<>();

        for( String word:words){
            char key = word.charAt(0);
            if(wordsByLetterMap.containsKey(key)){
                List<String>value = wordsByLetterMap.get(key);
                value.add(word);
                Collections.sort(value);
                wordsByLetterMap.put(key,value);
            }
            else{
                List<String>value = new ArrayList<>();
                value.add(word);
                wordsByLetterMap.put(key,value);
            }
        }
        return wordsByLetterMap;
    }
}
