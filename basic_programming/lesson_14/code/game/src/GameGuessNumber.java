import java.util.Scanner;

public class GameGuessNumber {
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void main(String[] args) {
                start();
    }

    // Написать игру угадай число, в которой за ограниченное число попыток ввода числа с
    // клавиатуры нужно угадать загаданное секретное число от 0 до 9
    // 1. Класс GuessGameNumber должен содержать две переменные  scanner  для ввода  чисел с клавиатуры и secret,
    // в которой записано секретное число.
    // 2. Класс должен содержать следующие методы :
    /*
        - readNumberOfAttempts  - считывает количество предоставляемых попыток
        - readNumber -считывает вводимое число
        - guessNumber -  содержит логику игры
        - start - через вызов этого метода запускается игра
     */

    // обьединяет все методы  для того чтобы можно было запустить игру вызовом метода start()
    static void start(){
        String finish;
        do {
            int attempts = readNumberOfAttempts();
            guessNumber(attempts);
            System.out.println("One more game? press any key if yes/ enter 'no' if not");
            finish = scanner.next().toLowerCase();
        }while (!finish.equals("no"));
        scanner.close();
        // str1 == str2
    }
//  считывает введенное пользователем с клавиатуры количество попыток
    static int readNumberOfAttempts(){
        System.out.println("Enter number of attempts ");
        return scanner.nextInt();
    }
// считывает число, угадываемое пользователем
    static int readNumber(){
        System.out.println("Enter the number from 0 to 9");
        return scanner.nextInt();
    }
//   в этом методе содержится логика игры. Т.е. реакция на действия пользователя
    static void guessNumber(int attempts) {
        while (attempts > 0){
            int number = readNumber();
            attempts--;

            if ( number == secret){
                System.out.println("You have guessed the secret number!");
                return;

            }else {
                System.out.println("Wrong! You have "+attempts+" attempts left.");
            }

        }
        System.out.println("Sorry, buddy. Maybe some other time. The secret number was "+secret);
    }


}
