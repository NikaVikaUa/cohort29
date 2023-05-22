public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String name = "John";
        String city = "Berlin";
        int age = 35;

        System.out.println("My name is "+name);
        System.out.println("I live in "+city);
        System.out.println("I am "+age+" years old");

        /*
        Есть 2 целочисленные переменные a и b. Пусть a = 1, b =2.
        С помощью оператора присваивания и математических действий сложения
        и вычитания поменять значения a и b местами. т.е. должно быть в результате
        a =2, b=1. Просто присвоить a и b эти значения или вводить третью переменную
        нельзя. Задача должна быть решена для общего случая, т.е. для любых двух значений переменных, 1 и 2 просто пример.
        Если не получится с двумя переменными, можно попробовать
        более легкий вариант решения с введением третьей дополнительной переменной
         */

        int a = 20;
        int b = 134;

        //a = a +b - (b = a);

        a = a + b;
        b = a -b; // b = a
        a = a - b;//a= a+b -a

        System.out.println("a now is "+a+" , b now is "+b);

        int x = 10;
        int y = 5;
        int buffer = x;

        x = y;//x =5
        y = buffer;// y =10

        System.out.println("x = "+x);
        System.out.println("y = "+y);

        /*
        целочисленные типы данных
        1.byte - занимает 8 бит
        -128 до 127
         */
        byte num = 100;

        /*
        short - 16 бит ( 2 байта)
         */
        short s = 20456;

        // long - 64 бит ( 8 байт)
        long l = 1_235_675_678L;

        /*
        00
        01
        10
        11
         */

        // float - используются для хранения чисел с плавающей точкой
        float f = 3.147f;

        // double -  как и float  хранит числа с плавающей точкой, но с двойной точностью по сравнению c float

        double d = 34.5667788666666666666;

        //987654.321  0.987654321 * 10 power 6

        //Арифметические операторы
        /*
         + сложение
         - вычитание
         * - умножение
         / - деление
         % - остаток от деления
         ++ инкремент
         -- декремент

         */

        System.out.println(10/3);
        System.out.println(10%3);
        //3*3=9  отстаток от деления 1
        // 9 + 1 = 10

        double divide = 10.0/3;
        System.out.println(divide);

        int number =10;
       // number = number + 1;
        number++; // postfix
       // number--;
        ++number; // prefix

        int x1 = 10;
       // int y1 = ++x1; //11
       // y1 = x1+1;

        int y1 = x1++; //10
       // y1 = x1+1;
        System.out.println("y1 is "+y1);
        System.out.println("x1 is "+x1);


        // написать программу, которая выводит на экран площадь и периметр круга при заданном радиусе.
        // периметр = 2 * PI * radius
        // площадь = PI * radius * radius
        //

        double radius = 8.9;

        double perimeter = 2*3.14*radius;
        double area = 3.14*radius*radius;
        System.out.println(perimeter);
        System.out.println(area);



    }
}