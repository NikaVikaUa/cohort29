import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    // Викторина на пять вопросов

    // easy version
    // Выберите тему для викторины,
    // (смешное, забавное или интересное)
    // Спрашиваете вопрос у пользователя:
    // Например: "Сколько зубов у панды?"
    // Если пользователь отвечает 22 -
    // "Неправильный ответ"
    // Если бы пользователь бы ввел 38
    // "Правильный ответ"
    // scanner.nextLine();

    // medium version
    // "Это неправильный ответ, правильный ответ <ответ>"

    // hard version
    // После викторины выводите сообщение:
    // "Правильно отвечено на 3 вопроса из 5"

    int count = 20;
    Scanner scanner = new Scanner(System.in);
    System.out.println("В какой стране находится пантеон?");
    String correctAnswer1 = "Италия";
    String answer1 = scanner.nextLine();
    if (correctAnswer1.equals(answer1)) {
      System.out.println("Правильный ответ");
      count++; //      count = count + 1;
    } else {
      System.out.println("Неправильно. Правильный ответ: "+ correctAnswer1);
    }
    // после всех вопросов выведем итоговый результат
    System.out.println("Количество правильных ответов: " + count);

  }
}
