import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    // Пользователь вводит email
    // нужно проверить оканчивается ли email "de"
    // нужно проверить - является ли email от "gmail"
    // в строке обязательно есть . и @
    // Примеры для задания:
    // demina@gmail.de - "super"
    // demin@gmail.us - "not valid"
    // demin@yandex.de - "not valid"
    // yandex@de.de    - "not valid"
    // gmailivan@yandex.ru - "not valid"
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите email");
    String email = scanner.nextLine();
    // lastIndexOf - так же работает -
    // но ищет начиная с правой стороны, а не с левой
    int indexOfDot = email.lastIndexOf(".");
    int indexOfAt = email.indexOf("@");
    String middlePart =
        email.substring(indexOfAt + 1, indexOfDot);
    System.out.println(middlePart);
    String lastPart =
        email.substring(indexOfDot + 1);
    System.out.println(lastPart);
    // "Gmail".equalsIgnoreCase("gmail");  -> true сравнивает
    if(middlePart.equalsIgnoreCase("gmail")
        && lastPart.equals("de")){
      System.out.println("super");
    } else {
      System.out.println("not valid");
    }

  }
}
