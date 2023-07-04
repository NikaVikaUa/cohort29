public class Main {

    public static void main(String[] args) {
      //  int i = 10;
     //   float f;
      //  f = i;
      //  System.out.println(f);

        // casting -  приведение несовместимых типов данных.

      //  (int) (x /y)   в скобках перед переменной или выражением пишем тип в  который мы хотим преобразовать эту
      //  переменную
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i =(int) (x/y);
        System.out.println("integer result of double division "+i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b ="+b);

        i = 250;
        b = (byte) i; //  будет потеря данных, т.к. 250 в byte  не поместится
        System.out.println("Value of b ="+b);

        b= 88; // ASCII code X
        ch =(char) b; //  число преобразуется в символ в соответствии с таблицей ASCII
        System.out.println("ch: "+ch);
    }



}
