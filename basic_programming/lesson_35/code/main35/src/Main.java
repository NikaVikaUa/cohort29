import java.io.IOException;

public class Main {

    /*
    Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
int a = 40/0

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
String s =null;
String m = s.toLowerCase()

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
int[] m = new int[2]
m[8]=5
     */

    public static void main(String[] args){
        //1.
     try{
        int a = 40/0;
        System.out.println(a);
     }catch (ArithmeticException e){
    //     System.out.println("Division by zero is forbidden");
    //     System.out.println(e.getMessage());
     }

     //2. NullPointerException
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch(NullPointerException exception){
      //      System.out.println("Method can't be called on null");
        }


        //3
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
     //       System.out.println(e.getMessage());
        }

     //   throw -  используется для того, чтобы бросить exception

    //    throws - мспользуется в сигнатуре метода и указывает на то, что метод может бросить исключение.

        // throw
        // throw new exception_class("error message");
       // throw new ArithmeticException("dividing by 5 is forbidden");

        //  напишем метод, проверяющий что при приеме новых членов в детский клуб дзюдо их вес не
        // меньше 30 кг а возраст не меньше 10 лет
     //   checkAgeWeight(9,20);

        try {
            Main m = new Main();
      //      m.myMethod(1);
        }catch (Exception ex) {
     //      System.out.println(ex.getMessage());
        }
        try {
            throw new MyException("This is my exception");
        } catch (MyException e){
            System.out.println(e);
        }
    }
    public static void checkAgeWeight(int age, int weight){
        if(age<10 && weight<30){
            throw new ArithmeticException("The person is not eligible for registration");
        }
        else {
            System.out.println("Welcome aboard");
        }
    }

    //throws
    void myMethod(int number ) throws IOException,ClassNotFoundException{
        if(number == 1)
            throw new IOException("IOException occured");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }




}
