import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Укажите свой возраст");
    int age = scanner.nextInt();
    boolean isAdult = (age >= 21);
    System.out.println(isAdult);
    // conditional statement
    if (isAdult) {
      System.out.println("Вот ваше вино");
    }
    if (age <= 10){
      System.out.println("Вот ваша жвачка");
    }

  }
}
