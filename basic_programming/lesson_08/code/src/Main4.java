import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // Проверить, а есть ли в строке слово Папа или Мама
        // line = Привет Марсель как дела
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine(); // строка, которую вы считали
        boolean hasMother = line.contains("Мама"); // true, если строка Мама есть в line
        boolean hasFather = line.contains("Папа"); // true, если строка Папа есть в line
        boolean result = hasMother | hasFather; // проверяем строку на условие
        System.out.println(result);
    }
}
