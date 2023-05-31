import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//
//    Необходимо прочитать строку и два числа.
//    Для входных данных определить:
//
//    Либо строка содержит слово "Hello" и сумма чисел - четное число
//    ИЛИ строка не содержит слово "Bye" и сумма чисел - нечетное
//
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите ваше сообщение");
    String message = scanner.nextLine();
    System.out.println("Введите первое число");
    int number1 = scanner.nextInt();
    System.out.println("Введите второе число");
    int number2 = scanner.nextInt();
//    System.out.println(message);
//    System.out.println(number1);
//    System.out.println(number2);
    // isHappy, hasDog
    boolean hasHello = message.contains("Hello");
    System.out.println(hasHello);
    // even - четный, odd - нечетный
    boolean isEven = (number1 + number2) % 2 == 0;
    boolean hasBuy = message.contains("Buy");
//    System.out.println(!hasBuy);
//    System.out.println(!isEven);
    // строка содержит слово "Hello" и сумма чисел - четное число
    boolean condition = (hasHello & isEven) | (!hasBuy & !isEven);
    System.out.println(condition);

    // И      AND
    // true & true   -> true
    // true & false  -> false
    // false & true  -> false
    // false & false -> false

    // ИЛИ    OR
    // true | true   -> true
    // true | false  -> true
    // false | true  -> true
    // false | false -> false

    // Отрицание Negate - отрицать Negation - отрицание
    // !
    // ! true -> false
    // ! false -> true
    // boolean isHealthy = true;
    // !isHealthy -> false

    // Конвенция именования - договоренность в сообществе
    // программистов о том, как называть что-либо.

    // Переменные типа boolean принято называть со словами is или has
    // isAdmin - является админом - если true - то является - если false - не является админом
    // hasCar - есть машина
    // isAdult, isMature - является взрослым



  }
}