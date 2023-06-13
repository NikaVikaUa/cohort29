public class Main {
    public static void main(String[] args) {
        int[] numbers = {34,56,7,23};
        numbers[3] = 5;

        System.out.println("Print array with for loop");

        for(int i = 1;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Print array with for-each");
        // цикл for-each.  Используется для перебора всех элементов массива, без учета индекса
        for(int num:numbers){ // в переменную num ( название может быть любым) последовательно
                 if(num == 34)         // записываются все значения элементов массива
                     numbers[1]=7;

            System.out.println(num);
        }


    }
}
