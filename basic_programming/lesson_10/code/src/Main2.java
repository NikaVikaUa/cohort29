import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Ctrl + Alt + L
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // считали первое число
        int b = scanner.nextInt(); // считали второе число

        // может быть два условия одновременно
        // лишние проверки
        if (a > b) {
            System.out.println(a);
        }

        if (a < b) {
            System.out.println(b);
        }

        if (a == b) {
            System.out.println("Числа равны");
        }
    }
}


