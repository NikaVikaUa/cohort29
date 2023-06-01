import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // считать три числа
        // Вывести сообщение
        //
        // "Все ок" - если:
        // если первое число - четное, второе - делится на 3, третье - оканчивается на 7
        //
        // Вывести сообщение "Почти ок" - если:
        // если первое число - четное, второе делится на 3, третье - не оканчивается на 7
        //
        // Вывести сообщение "Все плохо" - если первое число четное,
        // а второе не делится на три

        // В остальных случаях вывести - "Пока!"
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // 4567 / 10 = 456 + 7 в остатке
        // 4567 = 456 * 10 + 7
        if (a % 2 == 0) {
            if (b % 3 == 0) {
                if (c % 10 == 7) {
                    System.out.println("Все ок!");
                } else {
                    System.out.println("Почти ок!");
                }
            } else {
                System.out.println("Все плохо!");
            }
        } else {
            System.out.println("Пока!");
        }
    }
}