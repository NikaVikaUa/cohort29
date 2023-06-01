import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // Marat
        // Mars
        // Markovka
        // Programmer
        // Marazm
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // надо проверить, введенное слово больше 6 символов или хотя бы начинается с Mar
        if (word.length() > 6 || word.startsWith("Mar")) {
            System.out.println("OK!");
        } else {
            System.out.println("NOT OK!");
        }

        // надо проверить, введенное слово меньше 6 символов и заканчивается на `er`
        if (word.length() < 6 && word.endsWith("er")) {
            System.out.println("OK!");
        } else {
            System.out.println("NOT OK");
        }
    }
}
