public class Main {

    public static void main(String[] args) {
      //  System.out.println(countSumOfN(6));
        printTriangle(25);
    }

    /*
    С помощью цикла For написать метод,
    возвращаюший сумму всех четных целых чисел от 1 до заданного числа n
     */

    static int countSumOfN( int n){
        int sum = 0;

        for( int i = 1;i <= n;i++){

            if( i % 2 == 0) {
                sum = sum + i;
            }
        }
      return sum;
    }

    /*
    С помощью вложенного цикла For (цикл в цикле) написать метод, выводящий на экран треугольник такого вида:

1
12
123
1234
12345
123456
     */

    static void printTriangle (int n){
      //  int n = 8;
        for (int i = 1; i <= n; i++){ // i=3
            for ( int j = 1; j <= i; j++){
                System.out.print(j); // 12
            }
            System.out.println();

        }
    }
}
