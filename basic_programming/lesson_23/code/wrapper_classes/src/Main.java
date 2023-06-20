public class Main {
 //   byte, short, int, long, float, double, char, boolean
 //   Byte, Short, Integer,Long,Float,Double,Character,Boolean
 public static void main(String[] args) {
     int a = 1;
     Integer b = new Integer(1);
     Integer c = Integer.valueOf(1);

     Integer strToInt = Integer.parseInt("1234");// превращает строку, состоящую из цифр в число
     System.out.println(strToInt+1);
    // System.out.println(Integer.parseInt("abcd"));

     // Autoboxing and Unboxing
     /*
     Autoboxing -  автоматическое превращение примитивного значения в соответствующий обьект-обертку
     Unboxing  - наоборот
      */
     int x = 1;
     Integer value = 1;
     for( Integer i=0;i<10;i++){ // использовать классы-обертки таким образом в циклах не желательно.
         System.out.println(i);
     }
     System.out.println("Max int = "+Integer.MAX_VALUE);
     System.out.println("Min int = "+Integer.MIN_VALUE);
     System.out.println("Long max= "+Long.MAX_VALUE);
     System.out.println("Long max= "+Long.MIN_VALUE);
     System.out.println(Byte.MAX_VALUE);
     String str = "17";
     int y = Integer.parseInt("17");
     System.out.println(y-7);
     String str1 = "3.141";
     double pi = Double.parseDouble(str1);
     str1 = "true";
     Boolean.parseBoolean(str1);

     //int num1 = 0/0;
     double num2 = 0.0/0;
     System.out.println("num2 = "+num2);
     double num3 = 10.0/0; // положительная бесконечность
     System.out.println("num3 = "+num3);
     double num4 = -10.0/0; // отрицательная бесконечность
     System.out.println("num4= "+num4);

     // NaN - Not a Number (не число ) - это специальное  числовое значение для обозначения ошибок в вычеслении для
    // типов double  и float
     System.out.println(0.0/0.0); // ноль делим на ноль
     System.out.println(Math.sqrt(-1));// корень из отрицатнльного числа
     System.out.println(5.0 % 0); // остаток от деления на ноль

     // Nan() - метод, проверяющий является ли значение Nan и возвращает в этом случае true
     // isInfinite() - метод, проверяющий является ли значение бесконечностью

     Double infinityPositive = +5.0/0.0;
     Double infinityNegative = -5.0/0.0;
     Double nan = 0.0/0.0;

     System.out.println("infinityPositive is "+ infinityPositive.isNaN());
     System.out.println("infinityNegative is "+ infinityNegative.isNaN());
     System.out.println("nan is "+ nan.isNaN());

     double number = 40.0/0.0;
     if(Double.isNaN(number) || Double.isInfinite(number)){
         System.out.println("the result is wrong");
     }else {
         System.out.println(number);
     }









 }

}
