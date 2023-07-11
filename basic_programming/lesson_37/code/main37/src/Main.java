public class Main {

    public static void main(String[] args) {
                    //    0         1       2
        int[][] table ={ {5,7,3},{2,4,5},{9,5,8} };
        System.out.println(numberOfEven2Dim(table));
   //     System.out.println(table[0][0]);
   //     System.out.println(table[0][1]);
   //     System.out.println(table[0][2]);
    //    System.out.println(Arrays.toString(table[0]));
    //    System.out.println(Arrays.toString(table[1]));
    //    System.out.println(Arrays.toString(table[2]));

        for( int i=0;i<table.length;i++){
   //         System.out.println(Arrays.toString(table[i]));
   //         System.out.println("length of "+i+" subarray is "+table[i].length);
        }

    }

    /*
    Задача на повторение двумерных массивов
Написать метод, принимающий двумерный массив целых чисел и возвращающий количество четных чисел в нем.
public static int numberOfEven2Dim (int[][]numbers)
     */
    public static int numberOfEven2Dim (int[][]numbers){
        int counter = 0;  //  считает количество четных чисел в двумерном массиве

        for (int i = 0; i<numbers.length;i++){ //  цикл идет по строчкам(элементам) двумерного массива

            for (int j = 0;j<numbers[i].length;j++){
                if( numbers[i][j] % 2 == 0)
                    counter++;
            }

        }
        return counter;
    }


}
