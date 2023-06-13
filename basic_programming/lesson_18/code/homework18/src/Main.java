import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
 Задача1
Есть неотсортированный массив целых чисел int[] array. Нужно отсортировать его и
вывести отсортированный массив на печать. Использовать методы класса Arrays
*/
        int[] array = {5,1,0,98,45,23};

        Arrays.sort(array);
       // System.out.println(Arrays.toString(array));


/*
Задача2
Есть массив целых чисел. Написать метод,
находящий и возвращающий количество четных чисел в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
         */
        int[] numbers = {1, 2, 8, 7};
        System.out.println(countEven(numbers));
    }

    static int countEven( int[] numbers){
        int counter = 0;

        for( int i = 0; i<numbers.length; i++){
            if( numbers[i] % 2 == 0){
                System.out.println("even number is "+numbers[i]);
                counter++;
            }
        }
        return counter;
    }


}
