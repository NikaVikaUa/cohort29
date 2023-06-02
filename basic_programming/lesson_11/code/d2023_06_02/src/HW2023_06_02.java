import java.util.Scanner;

public class HW2023_06_02 {
  public static void main(String[] args) {
//        Считать четыре числа.
//        Вывести максимальное из них.
//        Гарантируется, что все числа разные.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число");
    int number1 = scanner.nextInt();
    System.out.println("Введите число");
    int number2 = scanner.nextInt();
    System.out.println("Введите число");
    int number3 = scanner.nextInt();
    System.out.println("Введите число");
    int number4 = scanner.nextInt();
    // сделали временную переменную max - это самое большое встретившееся число
    // если встречаем число больше нашего max - то обновляем значение max
    int max = number1;
    if(max < number2){
      max = number2;
    }
    if(max < number3){
      max = number3;
    }
    if(max < number4){
      max = number4;
    }
    System.out.println(max);
    // student ver 3
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//    int d = scanner.nextInt();
//    if (a >= b & a >= c & a >= d) {        // a - самое большое
//      System.out.println(a);
//    } else if (b >= a & b >= c & b >= d) { // b -cамое большое
//      System.out.println(b);
//    } else if (c >= a & c >= b & c >= d) { // с -cамое большое
//      System.out.println(c);
//    } else  { // d -cамое большое
//      System.out.println(d);
//    }



  }
}
