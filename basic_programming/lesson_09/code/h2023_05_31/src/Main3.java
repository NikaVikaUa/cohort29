import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Хорошо ли вам спалось? да/нет");
    String answer = scanner.nextLine();
    // if else
    // сравнивали примитивные типы через ==
    // для String, чтобы сравнить равна ли одна строка другой
    // .equals()
    String a = "hey";
    String b = "hey";
    boolean condition = a.equals(b);  // смысл такой a == b

    if (answer.equals("нет")){
      System.out.println(
          "Попробуйте подушки и матрасы нашей фирмы");
    } else {
      System.out.println("Видимо, вы уже пользуетесь нашими продуктами");
    }
    // if(условие) {
    //   выполнится если условие истинное
    // } else {
    //   этот блок выполнится, если условие ложное
    //}
  }
}
