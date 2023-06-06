import java.util.Scanner;

public class Main {

    /*
    variable = Condition ? Expression1 : Expression2
     */
    public static void main(String[] args) {


        int age = 16;

        boolean isAdult = age >= 18 ? true : false;

        System.out.println("Can this person vote ?"+ isAdult);


        if(age >= 18) {
            System.out.println("Can this person vote ? true");
        }
        else{
            System.out.println("Can this person vote ? false");
        }


        int x = 100;

        String numberSign = (x > 0)? "Positive" : "Negative";

        System.out.println(x+ " is a "+numberSign+ " number");

        int y = 7;

        String evenOrOdd = (y % 2 == 0)? "even number":"odd number";

        System.out.println(evenOrOdd);

        int num1 = 100;
        int num2 = 30;

        int max = num1 >= num2 ? num1 : num2 ;
        System.out.println(max);

       // Math.abs()

        int num3 = -5;
        int abs = num3 >=0 ? num3 : -num3;
        System.out.println(abs);

        //  Написать метод, который проверяет является ли символ гласной или согласной буквой латинского
        //  алфавита. В решении нужно использовать switch  и  оператор if-else


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch1 = scanner.next().charAt(0);

    }






}
