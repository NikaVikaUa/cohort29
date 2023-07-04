import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Two-dimensional arrays
        int[] numbers = new int[10];
        int[][] table = new int[10][20];
        table[0][0]=123;
        table[0][1]=124;

        // элементами двумерного массива являются массивы
        int arr[][]= {
              // 0   1  2
                {11,22,33},//0  arr[0]
                {44,55,66},//1  arr[1]
                {77,88,99},// 2  arr[2]

        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println("zero elt of arr "+ Arrays.toString(arr[0]));
        System.out.println("first elt of arr "+ Arrays.toString(arr[1]));
        System.out.println("second elt of arr "+ Arrays.toString(arr[2]));
        System.out.println(arr[1][0]);

        //  вывести элементы массива в цикле на экран

        /*
        {11,22,33},//0  arr[0]
        {44,55,66},//1  arr[1]
        {77,88,99}
         */

        // внешний цикл от 0 до количества строк/ массивов двумерного массива
        for (int i = 0;i<3;i++){

        // внутренний цикл от 0 до количества столбцов/элементов массива
            for(int j = 0;j<3;j++ ){
                System.out.print( arr[i][j]+" ");
            }
            //с новой строки после каждого массива
            System.out.println();
        }

        int [][] num = new int [3][];
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[67];

    }
}
