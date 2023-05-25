public class Main {
    public static void main(String[] args) {

        hello("Hello Java ",17);
        System.out.println(hello("Hello Java ",17)+" !!!");
       int result = sum(3,4);
        hello("Hello World ",1);
        hello("Hello ",2023);
        int result1 = sum(1,10);

        System.out.println(result + result1);



        // Методы
    }

    // пишем метод hello()
   public static String  hello(String str, int num){
       // System.out.println(str + num);
       String res = str +" "+num;
       return res;
    }

   static int sum(int a, int b){
       // System.out.println(a+b);
       int sumInt = a+b;
       return sumInt;
    }

    static void foo(){
        System.out.println("Hello");
        return;
    }

}
