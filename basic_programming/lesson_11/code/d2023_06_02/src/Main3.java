import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    // Пользователь вводит информацию о себе в консоль
    // информация в виде строки: "Alisher*Khamidov#170@brown"
    // вывести информацию в консоль по образцу:
    // Alisher Khamidov is 170 and has brown hair
    // lattice# asterisk*
    // Задание со звездочкой:
    // Если и имя, и фамилия начинаются с больших букв
    // нужно вывести в консоль "Super!"
    // Character.isUpperCase("Adsd");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите информацию о себе");
    String text = scanner.nextLine(); // "Alisher*Khamidov#170@brown"
    int indexOfAsterisk = text.indexOf("*");
    int indexOfLattice = text.indexOf("#");
    int indexOfAt = text.indexOf("@");
    String name = text.substring(0, indexOfAsterisk);
    String secondName =
        text.substring(indexOfAsterisk + 1, indexOfLattice);
    String height =
        text.substring(indexOfLattice + 1, indexOfAt);
    String colorOfHair =
        text.substring(indexOfAt + 1);
    // Alisher Khamidov is 170 and has brown hair
    System.out.println(
        name + " " + secondName + " is " +
            height + " and has " + colorOfHair + " hair"
    );
    // Задание со звездочкой
    if (Character.isUpperCase(name.charAt(0))
        && Character.isUpperCase(secondName.charAt(0))) {
      System.out.println("Super");
    }
  }
}
