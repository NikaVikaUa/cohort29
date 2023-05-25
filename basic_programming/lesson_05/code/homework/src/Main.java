import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String name = scanner.nextLine();

        System.out.println("Enter the second name");
        String secondName = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Hello "+name+" "+secondName+" !"+" Your age is "+age);


    }
}
