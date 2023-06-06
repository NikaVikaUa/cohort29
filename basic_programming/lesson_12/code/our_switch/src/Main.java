import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 7;
        switch (number){

            case 1:
                System.out.println("Case1: value is "+number);


            case 2:
                System.out.println("Case2: value is:"+ number);
                break;
            case 3:
                System.out.println("Case3: value is " + number);
                break;

            default:
                System.out.println("Default: value is " + number);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int dayOfWeekNumber = scanner.nextInt();
        switch (dayOfWeekNumber){
            case 1:
                int sum = 1+3;
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");


            case 7:
                System.out.println("Sunday");
                break;

            default:
               System.out.println("There is no day of week with such number");
        }


        char ch = 'x';

        switch(ch){

            case 'd':
                System.out.println("Case d");
                break;

            case 'b':
                System.out.println("Case b");
                break;

            case 'a':
                System.out.println("Case a");
                break;

            default:
                System.out.println("We do not have this letter");
        }




    }
    /*
    switch (variable or expression)
    {
    case constant:
        // Java code ;
    case constant:
    // Java code ;
    -
    -
    -
    default:
    // Java code

    }

     */



}
