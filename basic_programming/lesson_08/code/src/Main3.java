import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // считать четыре числа - a, b, c, d
        // проверить:

        // A = a - четное
        // B = b - нечетное
        // C = c - делится на 3
        // D = d - делится на 5

        // A & B | C & D
        Scanner scanner = new Scanner(System.in);
        // считали четыре числа
        // а - четное и b - нечетное, либо
        // c - делится на 3 и d - делится на 5
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // 26 27 35 43 - true
        // 26 28 33 45 - true
        // 26 28 45 33 - false
        boolean A = (a % 2 == 0); // a - четное
        boolean B = (b % 2 == 1); // b - нечетное
        boolean C = (c % 3 == 0); // с - делится на три
        boolean D = (d % 5 == 0); // d - делится на пять
        boolean result = A & B | C & D;

        System.out.println(result);

    }
}
