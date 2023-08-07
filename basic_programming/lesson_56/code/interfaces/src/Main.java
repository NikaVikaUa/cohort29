public class Main {
    public static void main(String[] args) {
        String input = "AAA bbbb dDD cccCc eee";


        WordsChecker wordsChecker1 = new ToUpperCaseChecker();
        System.out.println(transform(input,wordsChecker1));

        WordsChecker wordsChecker2 = new ToLowerCaseChecker();
        System.out.println(transform(input,wordsChecker2));
    }


    public static String transform( String input, WordsChecker t){
        String[] words = input.split(" ");

        for( int i = 0; i < words.length; i++){
            if(t.checkWord(words[i])){
                words[i] = t.transformWord(words[i]);
            }
        }
        return String.join(" ",words);
    }


}
