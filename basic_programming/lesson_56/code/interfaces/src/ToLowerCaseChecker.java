public class ToLowerCaseChecker implements WordsChecker {
    @Override
    public boolean checkWord(String word) {
        return word.length() == 3;
    }

    @Override
    public String transformWord(String word) {
        return word.toLowerCase();
    }
}
