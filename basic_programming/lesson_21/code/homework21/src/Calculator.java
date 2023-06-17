public class Calculator {
    public static void main(String[] args) {
        System.out.println(plus(1,2));
        System.out.println(plus(1,2,3));
        System.out.println(plus(1.5,2.5));
        System.out.println(plus(1.6,2.7,4.7));
       // Math.min

    }

    /*
    Задача 2
Создать класс Calculator, способный выполнять два арифметических действия
- сложение двух чисел, вычитание двух
чисел а также сложение трех чисел и вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)
     */

    public static int plus (int a, int b){
        return a+b;
    }
    public static int plus (int a, int b, int c){
        return a+b+c;
    }

    public static int minus (int a, int b){
        return a-b;
    }
    public static int minus (int a, int b, int c){
      // if(a>b) return a-b;
        return a-b-c;
    }



    public static double plus (double a, double b){
        return a+b;
    }
    public static double plus (double a, double b, double c){
        return a+b+c;
    }

    public static double minus (double a, double b){
        return a-b;
    }
    public static double minus (double a, double b, double c){
        return a-b-c;
    }



}
