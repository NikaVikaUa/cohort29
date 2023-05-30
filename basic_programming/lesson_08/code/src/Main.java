import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // считали первое число
        int b = scanner.nextInt(); // считали второе число

        boolean isAGreaterThanB = a > b;
        boolean isAGreaterOrEqualB = a >= b;
        boolean isAEqualB = a == b;

        System.out.println("A больше чем B? Ответ - " + isAGreaterThanB);
        System.out.println("A больше чем B, или они равны? Ответ - " + isAGreaterOrEqualB);
        System.out.println("A равен B? Ответ - " + isAEqualB);
    }
}