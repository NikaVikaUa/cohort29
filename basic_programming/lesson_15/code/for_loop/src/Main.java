import java.util.Scanner;

public class Main {
    /*  цикл For

    for ( initialisation ; condition ; increment/decrement )
    {
      statement(s)
      statement
    }
    initialisation -  переменная, которой присваивается начальное значение
    i (обычно переменная обозначается  буквой i).
    j.   Инициализация происходит один раз в начале работы цикла

    condition (условие). Условие определяет до какого момента повторяется цикл. Цикл выполняется пока
    условие истинно

    increment/decrement - определяет изменение значения счетчика

    statement(s) -  код в теле цикла, который выполняется при каждом повторении цикла


     */

    public static void main(String[] args) {

        //Напечатать числа от 1 до 10 с помощью цикла for.
        int i ;

        for ( i = 1; i <= 10 ; i++ ){

        //    System.out.println("The value of i is "+i);

        }


        // используя цикл for вывести на печать значения квадратного корня от 1 до 99 и ошибку округления

        double number, squareRoot, error;

        for (number =1.0; number <100.0; number++){

            squareRoot = Math.sqrt(number);// вычисляем квадратный корень числа number  number = 4, squareRoot =2
         //   System.out.println("Square root of "+number + " is "+squareRoot);

            // вычислим ошибку округления
            error = number - (squareRoot*squareRoot);
         //   System.out.println("Rounding error is "+error);
            System.out.println();
        }
        int j;
        for (j = 10; j>=1; j--){
       //     System.out.println("The value of j is "+j);
        }

        // Вариации цикла For

        int i1,j1;

        for (i1 = 0, j1 = 10; i1 < j1; i1++,j1--){
         //   System.out.println("i1 and j1 :"+i1+" "+j1);
        }

        //цикл for будет продолжаться пока с клавиатуры пользователь не введет  букву S
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("enter smth, press S to stop");

        int y;
     //   for(y = 0; scanner.nextLine().charAt(0) != 'S';y++ ){
    //        System.out.println("pass #"+y);
    //    }
    //    System.out.println("end of for");

        // в цикле for не обязательно писать все три условия. Одно или несколько могут быть пустыми

        int index = 0;
        for( ; index < 10;){

       //     System.out.println("pass # "+index);
            index++; // увеличение счетчика непосредственно в теле цикла
        }

    //    for(;;){ // бесконечный цикл

    //    }


        // Тело цикла может быть пустым. Посчитаем сумму цифр от 1 до 5 в цикле for

      //  int i2;
     //   int sum = 0;
     //   for(int i2 = 1; i2<=5; sum += i2++);//  в этом цикле отстутствует тело цикла

     //   System.out.println("sum is "+ sum);


        // sum += i2++  это сокращенная форма записи следующих выражений:
        // sum = sum +i2
        // i2++


        // посчитаем сумму чисел от 1 до 5 а также факториал от 1 до 5
        // 4! = 1*2*3*4
        // 3! = 1*2*3


        int sum = 0;
        int fact = 1;
       // int i;
        for ( int y1 =1; y1<=5; y1++ ){
           // sum += y1;
            sum = sum + y1;
            fact *= y1;
          //  fact = fact*y1;

        }
     //   System.out.println("Sum is "+sum);
     //   System.out.println("Factorial is "+fact);


        //  цикл в цикле  (nested). Вывести на экран значения переменной j3
        for (int i3 = 1; i3<4;i3++){
            System.out.println("i3= "+i3);
            for (int j3 = 1; j3<5;j3++){
                System.out.print((j3+i3)+" ");
            }
            System.out.println();
        }

        //  Используя вложенный цикл for (цикл в цикле), написать метод
        //  выводящий на экран треугольник такого вида:
        /*
        1
        12
        123
        1234
        12345
        123456
         */






    }
}
