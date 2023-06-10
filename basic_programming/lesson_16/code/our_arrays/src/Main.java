public class Main {

    //Array - массив
    /*
    type[] array-name = new type[ size]
     */
    public static void main(String[] args) {
        // первый способ
        int[] sample;
        sample = new int[10];
      //  0     1   2   3   4   5  6  7  8  9  индексы массива
     //   10 , 20 ,30 , 40 ,50,60,70,80,90,100 элементы массива
     //  индексы элементов массива начинаются с нуля и увеличиваются
     // на единицу также как и в случае со строками

        // H e l l o
        // 0 1 2 3 4
        // charAt(0)
       int firstElement = sample[0];

        // int[] sample;
        // int []sample
        // int sample [];

        sample[0] = 10;
        sample[1] = 20;
        sample[2] = 30;
        sample[3] = 40;
        sample[4] = 50;
        sample[5] = 60;
        sample[6] = 70;

        // второй способ обьявить массив и присвоить значения его элементам
      //  int[] numbers = new int[]{19,23,56,2,7,89};

        //  третий способ обьявить массив и приcвоить значения его элементам
      //  int[] numbers ={11,22,33,44,55};
      /*  System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);*/

        // метод length - размер массива
        String hello = "Hello";
        hello.length();
        int[] numbers ={11,22,33,44,55,66,77};
       int length = numbers.length;
    //    System.out.println("length of numbers array is "+length);

       // напечатать все элементы массива numbers  в цикле for
        for (int i = 0; i < numbers.length ;i++){
       //     System.out.println(numbers[i]);
        }


        //Создать массив из 10 элементов,  заполнить его элементами от 0 до 9 и вывести на печать
        // в цикле.
        int[] nums = new int[10];

        // присваиваем значения элементам массива
        for(int i = 0;i<nums.length;i++){
            nums[i] = i;
        }

        // выводим значения элементов на печать
        for(int i = 0;i<nums.length;i++) {

        //    System.out.println("nums["+i+"] ="+nums[i]);
        }

        nums[9] = 5555 ;

        for(int i = 0;i<nums.length;i++) {

        //    System.out.println("nums["+i+"] ="+nums[i]);
        }

      //  nums[11] = 34;

        // создадим массив строк
        String[] names = {"John","Jack","Mary","Bill","Ann"};

        for (int i = 0;i<names.length;i++){
       //     System.out.println(names[i]);
        }
      //  System.out.println("new Array with Kate");
        names[1]="Kate";

        for (int i = 0;i<names.length;i++){
      //      System.out.println(names[i]);
        }
     //   names[8]="Evgeny";

        // добавить элементы в массив можно ( больше длины маасива) можно путем создания нового массива
        // нужной длины и копированием в него старых элементов + добавить новые

        String[] newNames = new String[names.length + 2];

        // в цикле копируем значения из старого массива в новый
        for ( int i=0;i<names.length; i++){
            newNames[i] = names[i];
        }

        for (int i =0;i<newNames.length;i++){
     //       System.out.println(newNames[i]);
        }

      //  System.out.println("newNames length is "+newNames.length);
       // newNames
      //  newNames[5] = "Peter";
      //  newNames[6] = "Nick";

        newNames[newNames.length-2] = "Peter";
        newNames[newNames.length-1] = "Nick";

        for (int i =0;i<newNames.length;i++){
     //       System.out.println(newNames[i]);
        }

        // найти максимальный элемент массива
        int[] intNumbers = {7,2,67,3,0};

        // обьявляем переменную max,  в которую будем записывать макс.значение
        int max = intNumbers[0]; //7


        for ( int i = 1; i < intNumbers.length; i++){
            if (intNumbers[i]>max){ // проверяем будет ли значение текущего элемента больше чем max
                max = intNumbers[i];// и если да, то присваиваем это значение перменной max
            }
        }
        System.out.println("Max element is "+max);

        //найти мин. элемент массива
        int min = intNumbers[0];
        for(int i = 1; i<intNumbers.length;i++){
            if(intNumbers[i]<min){
                min = intNumbers[i];
            }
        }
        System.out.println("Min elt is "+min);







    }
}
