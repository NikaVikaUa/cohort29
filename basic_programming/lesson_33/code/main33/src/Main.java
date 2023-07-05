public class Main {

    public static void main(String[] args) {
 /*
    Задача1
Обьявить и инициализировать двумерный массив целых чисел с количеством элементов
по своему усмотрению. Вывести все элементы массива в цикле на печать
*/
        int[][] table = {{1, 2, -3}, {4, 5, 6}, {-7, 8,-1}};
        print2DimArray(table);


        System.out.println("sum of subarray elts is " + sumOfEltsSubArray(table, 1));
        System.out.println("sum of array's elements is " + sumElements(table));

        System.out.println("array has the following subarrays with zero sum");
        printZeroSubArrayIndex(table);

    /*    for( int i = 0;i< table.length;i++){

            for ( int j = 0;j<table[i].length;j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }*/

    }

    // метод для печати двумерного массива
    public static void print2DimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // просуммировать все элементы двумерного массива используя цикл for each

    public static int sumElements(int[][] table) {
        int sum = 0;
        for (int[] x : table) {
            for (int y : x) {
                sum += y;
            }
        }
        return sum;
    }


 /*
Задача2*
Пусть есть двумерный массив целых чисел. Написать метод, принимающий этот массив и номер одного из
подмассивов этого массива и возвращающий сумму всех значений элементов этого подмассива.
public static int sumOfSubArrayElts (int[][] ints, int n), где n -номер одного из подмассивов

     */

    public static int sumOfEltsSubArray(int[][] ints, int n) {
        int sum = 0;

        for (int i = 0; i < ints[n].length; i++) {
            sum += ints[n][i];
        }
        return sum;
    }

    //Написать метод, выводящий на экран номер подмассива сумма всех элементов которого равна нулю

    public static void printZeroSubArrayIndex(int[][] array) {
        for (int i = 0; i < array.length; i++)  //считаем сумму элементов каждого подмассива и если она равно нулю,
        // выодим  номер этого подмассива
        {
            int sumSubArray = 0;
            for (int j = 0; j < array[i].length; j++)
                sumSubArray += array[i][j];
            if (sumSubArray == 0)
                System.out.println(i + "\t");
        }
    }
}
