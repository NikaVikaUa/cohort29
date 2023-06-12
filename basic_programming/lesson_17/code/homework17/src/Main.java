public class Main {

    public static void main(String[] args) {



    /*
    Задача1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
*/
//                      0       1        2        3
String[] fruits =   {"Orange","Apple","Banana","Mango"};

for ( int i = 0; i< fruits.length;i++){  // вывод на экран
    System.out.println(fruits[i]);
}

fruits[1] = "Kiwi"; // замена элемента

        System.out.println("changed array");

for ( int i = 0; i< fruits.length;i++){  // вывод на экран измененного массивс
     System.out.println(fruits[i]);
        }


/*
Задача2
Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи (т.е. Orange и Banana).
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.

*/

        System.out.println("print even elements");

        for( int i = 0;i<fruits.length; i++){
            if(i % 2 == 0){
                System.out.println(fruits[i]);
            }
        }


/*
Задача3*
Дан массив целых чисел. Написать метод, возвращающий разность между наибольшим и наименьшим элементами массива.
public static int countDif(int[] ints)
пример: {4,2,5,8} -> результат 6, т.к. 8 (максимальный)- 2(минимальный)=6

    */

        int[] numbers = {4,2,5,8};
        System.out.println("difference between max and min is "+countDifference(numbers));

        int[] empty = {};
        System.out.println("Index is " + findIndex(numbers,5)); //2
        System.out.println("Index in the empty array is " + findIndex(empty,5));//-1
        System.out.println("Index of 345 is " + findIndex(numbers,345));//-1


    }
    //{4,2,5,8}
    static int countDifference (int[] numbers){
        int max = numbers[0]; //  Создаем переменную max  и присваиваем ей начальное значение.
                                // в переменную макс будем записывать найденное макс. значение.
        int min = numbers[0]; //  Создаем переменную min  и присваиваем ей начальное значение.
                                // в переменную min будем записывать найденное наименьшее  значение.

        for ( int i = 1; i<numbers.length; i++){
            if ( numbers[i] > max) { // 5 > 4 ?
                max = numbers[i];  // max = 8      присавиваем переменной max  значение numbers[i] если оно больше max
            }
            else if (numbers[i] < min){ //  присавиваем переменной min  значение numbers[i] если оно меньше min
                min = numbers[i]; //min = 2
            }
        }
        return max - min;
    }

    // есть массив целых чисел. Написать метод, находящий и возвращающий  индекс заданного элемента. Если такого
    // элемента нет, то метод возвращает -1.
    // Индексы массива не бывают отрицательными
    //  0 1 2 3
    // {4,2,5,8} , 345 -> -1
    // {4,2,5,8} , 5 -> 2
    //{}
    static int findIndex ( int[] array, int n){
        if (array.length == 0){ //  проверка на отсутствие элементов в массиве
             return -1;
        }


      //  По очереди перебираем все элементы массива в цикле и сравниваем с искомым. Если найден элемент массива
        // равный искомому, то мы возвращаем его индекс и прекращаем поиск
        for ( int i = 0; i<array.length; i++){
            if ( array[i] == n){ //  проверка равенства здесь.  И выход из метода с возвратом найденного индекса
                return i;
            }
        }
        return  -1; //  в том случае, если в цикле элемент не найден, то возвращается -1
    }

}
