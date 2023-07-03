import java.util.Arrays;

public class Main {

    //Arrays.copyOf() - копирует заданное количество элементов из старого массива в новый

    public static void main(String[] args) {


        int[] num = {100, 34, 67, 12, -5, 70}; // массив, откуда копируем
                                                 //сколько копируем
        int[] numCopy = Arrays.copyOf(num, num.length);
        System.out.println(Arrays.toString(numCopy));

        int[] numCopyPart = Arrays.copyOf(num,3); // копирует три элемента из старого массива
        System.out.println(Arrays.toString(numCopyPart));

        // копирование части массива  не с нулевого элемента
        int[] numCopyMiddle = Arrays.copyOfRange(num,2,6); // копирует со второго индекса вкл
                                                                         // по 6  искл.
        System.out.println(Arrays.toString(numCopyMiddle));
    }

}
