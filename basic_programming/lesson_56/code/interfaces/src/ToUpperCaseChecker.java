public class ToUpperCaseChecker implements WordsChecker{
    @Override
    public boolean checkWord(String word) {
        return word.length() == 4;
    }

    @Override
    public String transformWord(String word) {
        return word.toUpperCase();
    }
}
