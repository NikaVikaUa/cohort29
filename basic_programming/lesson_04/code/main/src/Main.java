import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     double divide = 25/3;
        System.out.println(divide);
        double x = 25;
        System.out.println(x/3);

        double y = 3;
        System.out.println(x/y);
        System.out.println(25.0%3);

        int a = 4;
        System.out.println(a*a*a);

        //Java Math Class
        //java.lang.Math

        //значение по модулю
        System.out.println(Math.abs(10)); //10
        System.out.println(Math.abs(-10.78));//10.78

        // мин число
        System.out.println(Math.min(10,20)); // 10

        // макс из двух чисел
        System.out.println(Math.max(10,20));

        //округление

        System.out.println(Math.round(24.345));
        System.out.println(Math.round(24.645));

        //случайное число

       double random = Math.random();
        System.out.println(random);
        System.out.println(random*100);

        // возведение в степень
        System.out.println(Math.pow(2,3));

        // извлечение корня
        System.out.println(Math.sqrt(4));

        // число пи
        System.out.println(Math.PI);

        // Scanner class - позволяет получить в программе ввод пользователя
        // java.util

        // создание сканера
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        // чтение числа, введенного пользователем и сохранение его в переменной num1
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        // чтение второго числа
        int num2 = scanner.nextInt();



        System.out.println("Sum of entered numbers is  "+(num1+num2));

      //  scanner.close();



        //метод для ввода строк

     //   Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter your name: ");
        scanner.nextLine();

        String name = scanner.next();

        System.out.println("Enter your surname: ");
        String surName = scanner.next();

        System.out.println("Hello, "+name+" "+surName);

      //  System.out.println(bin);
        System.out.println();

        scanner.close();

    }
}