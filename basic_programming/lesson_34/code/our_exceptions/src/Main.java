import java.util.Scanner;

public class Main {
    // Exception handling in Java
    // Обработка исключений в Джаве

    // Исключение - это нежелательное событие, прерывающее нормальный ход программы.
    /* в результате чего выполнение программы останавливается и мы получаем системное
    сообщение об ошибке.
    Возникшую ошибку можно обработать таким образом, что программа не будет аварийно завершена  и
    пользователь получит понятное сообщение о том, что случилось.


     */

    public static void main(String[] args) {


        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        //    System.out.println("Enter the first number:");
        //    num1 = scanner.nextInt();

        //    System.out.println("Enter second number:");
        //    num2 = scanner.nextInt();

    /*    try {
            int division = num1 / num2;
            System.out.println(num1 + "/" + num2 + " = " + division);
        } catch (ArithmeticException e){
            System.out.println("Division by zero is illegal");
        }*/


        String str = null;
        //NullPointerException -
        //   System.out.println(str.length());

        // NumberFormatException - неверный формат данных
        String str1 = "Hello";
        //   int num = Integer.parseInt(str1);

        int arr[] = new int[3];
        //ArrayIndexOutOfBoundsException - индекс вне границ массива
        //   arr[45] =250;

        // Ошибки и исключения.
        /*
        Ошибка - что-то пошло не так за рамками программы. Ошибку нельзя обработать, она является следствием или
        указывает на системный сбой или другую серьезную проблему.
        Exceptions - это то, что происходит при выполнении программы  вследствие неверных данных
         введенных пользователем, ошибок в коде или например отстутствия файла для считывания данных. Программист
         может обрабатывать такие ошибки.
         В свою очередь, исключения бывают проверяемые ( checked)  и непроверяемые во время компиляляции (unchecked)

         Основные понятия при работе с исключениями:

         try - код, который может вызвать ошибку помещается внутрь блока try. В случае ошибки try  передает управление
               программой блоку catch. Блок catch  следует за блоком try

         catch -  в этом блоке пишется код обрабатывающий исключение. Он выполняется если исключение происходит в
                    соответствующем try блоке.

        finally - блок кода, который выполняется всегда, независимо от того происходит ли ошибка или нет

        throw -  используется для того, чтобы бросить exception

        throws - мспользуется в сигнатуре метода и указывает на то, что метод может бросить исключение.


        try-catch

        try{
        // код, который может вызвать ошибку
        } catch(Exception e){
            код, который будет выполняться если происходит ошибка
            }


         */
        num1 = 5;
        num2 = 0;
        try {

            String str2 = "Hello";
            int num3 = Integer.parseInt(str2);

            int division = num1 / num2;
    //        System.out.println(num1 + "/" + num2 + " = " + division);


        } catch (ArithmeticException e) {
    //        System.out.println("Division by zero is illegal");

        } catch (Exception e) {
     //       System.out.println("Exception occured");


            //ловит все ошибки, общий обработчик

        }

        // блок finally

        try {
           int division = num1 / 2;
            System.out.println(num1 + "/" + num2 + " = " + division);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is illegal");

        }

        finally {
            System.out.println("This is finally block");
        }

        System.out.println("Out of try-catch-finally");



    }

}
