import java.util.Scanner;

public class MedicalAdviser {
  public static void main(String[] args) {
    // Узнайте у пользователя его температуру

    // Если температура от 35 до 37 не включительно,
    // то нужно сообщить пользователю:
    // "Вы совершенно здоровы, голубчик".

    // Если температура >=37 и меньше 40:
    // "Вам следует выпить ибупрофен и воды".

    // Если температура >= 40:
    // "У меня есть хороший контакт бюро ритуальных услуг, вам нужен?".
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите вашу температуру");
    int temperature = scanner.nextInt();
    if(temperature > 35 & temperature < 37){
      System.out.println("Вы совершенно здоровы, голубчик");
    }
    if(temperature >= 37 & temperature < 40){
      System.out.println("Вам следует выпить ибупрофен и воды");
    }
    if (temperature >= 40){
      System.out.println(
          "У меня есть хороший контакт бюро ритуальных услуг, вам нужен?");
    }

  }
}
