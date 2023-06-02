public class Main {
  public static void main(String[] args) {
    String trex = "T-rex19";
    char firstSymbol = trex.charAt(0);
    // как проверить что он является буквой?
    // Character.isAlphabetic() - проверяет является буквенным
    boolean isLetter = Character.isAlphabetic(firstSymbol);
    boolean secondIsLetter = Character.isAlphabetic(trex.charAt(1));
    System.out.println(isLetter);
    System.out.println(secondIsLetter);
    // определяет является ли числовым
    boolean isDigit = Character.isDigit(trex.charAt(trex.length() - 1));
    System.out.println(isDigit);
    // substring
    // если один параметр - то пойдет с указанного индекса включительно
    // до конца строки
    String sub1 = "notification".substring(1);
    System.out.println(sub1); // "otification"
    // если два параметра - первый включительно, а второй нет
    String sub2 = "notification".substring(2, 4);
    System.out.println(sub2);
    // метод indexOf() возвращает индекс указанного символа "w" или 'w'
    String text = "In code we trust";
    int indexOfW = text.indexOf('w');
    System.out.println(indexOfW);

    String text2 = "We Want To Sleep on Friday";
    // метод возвращает первый попавшийся - и ищет слева направо
    int index = text2.indexOf("W");
    System.out.println(index);
    // если в строке нет такого символа - то возвращается -1
    int index2 = text2.indexOf("z");
    System.out.println(index2);
    // как эти методы можно использовать вместе
    String text3 = "key=yellow&name=John";
    // как вырезать правую часть от &
    int index3 = text3.indexOf("&");
    System.out.println(index3);
    String rightPart = text3.substring(index3 + 1); // "name=John"
    System.out.println(rightPart);

    String leftPart = text3.substring(0, text3.indexOf("&"));
    System.out.println(leftPart); // "key=yellow"
    //
  }
}