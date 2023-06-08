import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  multiplyResults(5);
        sumOfEvenOdd();
    }


    /*
    Используя цикл while написать метод, выводящий
    на экран результат умножения данного числа n на каждое целое число от 0 до n
     */

    static void multiplyResults (int n){
        int i = 0;

        while (i <= n){
            System.out.println(n+"*"+i+" = "+n*i);
            i++;
        }
    }

    /*
    Используя цикл do while написать метод, принимающий с клавиатуры целое число и
    выводящий на экран сумму четных и сумму нечетных чисел, введенных пользователем.
    Пример : пользователь ввел 1,3,2,6 . Сумма четных чисел будет 8, сумма нечетных 4
     */

    static void sumOfEvenOdd(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        char choice;

        do {
            System.out.println("Enter a number ");
            number = scanner.nextInt();

            if(number % 2 == 0){

                evenSum += number;
                // evenSum = evenSum + number;
            }
            else {

                oddSum += number;
            }

            System.out.println("Do you want to continue?  enter 'y' or enter any other letter if not");
            choice = scanner.next().charAt(0);

        }while (choice == 'y');

        System.out.println("Sum of even numbers is "+evenSum);
        System.out.println("Sum of odd numbers is "+oddSum);

    }
}
