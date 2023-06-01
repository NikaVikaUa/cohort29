import java.util.Random;
import java.util.Scanner;

public class Main4 {
    // компьютер загадывает число, а мы должны угадать с нескольких попыток
    // используя подсказки - больше или меньше
    public static void main(String[] args) {

        Random random = new Random(); // создаем генератор случайных чисел
        Scanner scanner = new Scanner(System.in); // создаем считыватель с консоли
        int computerNumber = random.nextInt(10) + 1; // генерируем число от 1 до 10

        int userNumber; // число, которое введет пользователь
        int attemptsCount = 2; // общее число попыток
        boolean isRun = true; // булевская переменная, помогает определить, угадали мы число или нет
        // isRun = true, пока не угадали, isRun = false, когда угадали
//        System.out.println(computerNumber);

        if (isRun) { // если игра работает
            userNumber = scanner.nextInt(); // считываем число, которое подал пользователь
            attemptsCount--; // уменьшаем количество попыток
            if (computerNumber == userNumber) { // если игра запущена и пользователь угадал число
                System.out.println("Угадали!");
                isRun = false; // говорим, что игра остановлена
            } else if (computerNumber < userNumber) { // если загаданное число меньше
                System.out.println("Надо меньше!");
            } else { // если загаданное число больше
                System.out.println("Надо больше!");
            }
            if (isRun) { // если игра осталась запущенной
                // печатаем информацию о попытках
                System.out.println("Мимо! Осталось попыток: " + attemptsCount);
            }
        }

        if (isRun) {
            userNumber = scanner.nextInt();
            attemptsCount--;
            if (computerNumber == userNumber) {
                System.out.println("Угадали!");
                isRun = false;
            } else if (computerNumber < userNumber) {
                System.out.println("Надо меньше!");
            } else {
                System.out.println("Надо больше!");
            }
            if (isRun) {
                System.out.println("Мимо! Осталось попыток: " + attemptsCount);
            }
        }

        if (isRun) {
            userNumber = scanner.nextInt();
            attemptsCount--;
            if (computerNumber == userNumber) {
                System.out.println("Угадали!");
                isRun = false;
            } else if (computerNumber < userNumber) {
                System.out.println("Надо меньше!");
            } else {
                System.out.println("Надо больше!");
            }
            if (isRun) {
                System.out.println("Мимо! Осталось попыток: " + attemptsCount);
            }
        }
    }
}
