import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //   printCarInfo();

        int n, d ,q ;

        n = 10;
        d = 0;

        if ( d != 0 & (n%d)==0)
            System.out.println(d +" is factor of "+n);


    }

    /*
    Пользователь вводит информацию об автомобиле в консоль в следующем виде: bmw@2019@black
Используя substring получите элементы этой строки и выведите информацию в консоль в следующем виде:
Автомобиль bmw Год выпуска: 2019 Цвет: black
Пример ввода и вывода:
ka@2022@grkiey
Автомобиль kia Год выпуска: 2022 Цвет:
     */

    public  static void printCarInfo () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car info: ");
        String auto = scanner.nextLine();
        int indexFirst = auto.indexOf('@');
        int indexLast = auto.lastIndexOf('@');
       // auto.indexOf('k')
       // auto.indexOf("ki")

        String make = auto.substring(0,indexFirst);
        String year = auto.substring(indexFirst+1,indexLast);
        String colour = auto.substring( indexLast+1);
        int y = Integer.parseInt(year);
        String intToStr = String.valueOf(1000);

        System.out.println("Car is "+make+" ,production year is "+year+ " ,colour is "+colour);
    }
     /*                AND       OR     XOR    !a
     a        b       a&b       a||b    a^b
     false false      false     false   false   true
     true  false      false     true    true    false
     false true       false     true    true
     true  true       true      true    false

     XOR - true  когда операнды разные
         - false  когда они одинаковые

         &   &&
         |   ||
      */


}
