import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //  calculate();
        vowelOrConsonant();

    }

    /*
    Напишите метод калькулятор, который в зависимости от ввода пользователя выполняет сложение, вычитание,
    умножение или деление. Пользователь вводит оба числа, затем знак операции (+, -, * или /).
    В зависимости от введенного знака программа выполняет выбранное действие и
    выводит полученный результат на экран. При написании метода используйте Switch.
     */
    static void calculate(){
        double number1,number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        number1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        number2 = scanner.nextDouble();

        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = scanner.next().charAt(0);


        switch (operator){

            case '+':
                System.out.println(number1 +" "+operator+" "+number2+"= "+(number1+number2));
                break;

            case '-':
                System.out.println(number1 +" "+operator+" "+number2+"= "+(number1-number2));
                break;

            case '*':
                System.out.println(number1 +" "+operator+" "+number2+"= "+(number1*number2));
                break;

            case '/':
                System.out.println(number1 +" "+operator+" "+number2+"= "+(number1/number2));
                break;

            default:
                System.out.println("You have entered a wrong operator");
        }
    }

    /*
    Написать метод, который проверяет является ли введенный пользователем символ
    гласной или согласной
    буквой латинского алфавита. В решении используйте switch и оператор if-else
     */
    static void vowelOrConsonant(){
        Scanner scanner = new Scanner(System.in);
        boolean isVowel = false;

        System.out.println("Enter a character ");
        char ch = scanner.next().charAt(0);
        //a,e,i,o,u
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }

        if(isVowel){
            System.out.println(ch + " is a vowel");
        }
        else {
            if( (ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " is a consonant");

            else
                System.out.println(" the symbol is not a letter");

        }

    }


}
