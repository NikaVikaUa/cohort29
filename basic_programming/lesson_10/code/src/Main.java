import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ctrl + Alt + L
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // считали первое число
        int b = scanner.nextInt(); // считали второе число
        // найти максимум, если числа равны, сказать, что они равны
        // a > b, a < b, a == b
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Числа равны");
        }
    }
}


