import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {6,3,0,5};  //  создаем массив
        bubbleSort(array); // "пропускаем" его через метод сортировки

        for ( int i = 0;i<array.length;i++) {  //  выводим на экран отсортированный массив
        //    System.out.print(array[i] + " ");
        }

        System.out.println("Print new array");

            int[] array1 = {6,1,8,-56,876,235};
        //    bubbleSort(array1);
            for ( int i = 0;i<array1.length;i++){
                System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("Print array1 with Arrays.toString");
        System.out.println(Arrays.toString(array1)); //  печать массива методом Arrazs.toString

        // сортировка методом Arrays.sort
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }

    /*
    Сортировка пузырьком ( Bubble sort)
    - Алгоритм просматривает массив и сравнивает каждую пару соседних элементов.
    Когда встречается пара, расположенная не по порядку, происходит замена этих
    двух элементов местами
     */
    //  Первый проход
    // 6 3 0 5  ->  3 6 0 5 -> 3 0 6 5 -> 3 0 5 6

    // Второй проход
    // 3 0 5 6 -> 0 3 5 6

    // Третий проход
    // 0 3 5 6 -> 0 3 5 6

    static void bubbleSort(int[] array) {
        boolean sorted = false; //  переменная показывает отсортирован ли массив
        int temp;

        while (!sorted) { //  цикл будет повторяться , пока sorted = false
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) { // проходим по массиву
                if (array[i] > array[i + 1]) { // проверка необходимости перестановки элементов
                    // перестановка элементов местами с помощью третьей буферной переменной
                    temp = array[i]; //temp = 6  временно хранит значение элемента array[i]
                    array[i] = array[i + 1]; // array[i] = 3
                    array[i + 1] = temp; // array[i+1] = 6
                    sorted = false; //  в случае перестановки элементов sorted опять  становиться false
                }
            }

        }

    }
}
