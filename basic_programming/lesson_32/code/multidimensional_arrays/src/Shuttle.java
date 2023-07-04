public class Shuttle {
    //  написать программу, которая хранит количество пассажиров автобуса идущего от терминала
    //к самолету. Пусть  автобус ходит по рабочим дням 10 раз в день а в выходные 2 раза.
    public static void main(String[] args) {
        /*
        создадим двумерный массив, где количество строк (первый индекс) соответствует количеству дней недели когда
        курсирует автобус, а второй индекс,т.е. количество элементов каждого массива соответствует
        количеству поездок в день. В будние дни - 10, в выходные -2

         */
      int[][] riders = new int[7][];
      riders[0] = new int[10];
      riders[1] = new int[10];
      riders[2] = new int[10];
      riders[3] = new int[10];
      riders[4] = new int[10];
      riders[5] = new int[2];
      riders[6] = new int[2];

        System.out.println("riders length is "+riders.length);
        System.out.println("riders[1] length is "+riders[1].length);
        System.out.println("riders[5] length is "+riders[5].length);


      // заполняем массив данными. Т.е. количеством пассажиров на каждом рейсе
        for(int i=0;i<5;i++){
            for(int j =0;j<10;j++){
                riders[i][j] = i+j+10; // количество пассажиров на каждом рейсе, заданное случайным образом
            }
        }

        for (int i = 5;i<7;i++){
            for(int j = 0;j<2;j++){
                riders[i][j] = i+j+10;
            }
        }

        System.out.println("Passengers per trip during the weekdays");
        for(int i=0;i<5;i++){
            for(int j =0;j<10;j++){
                System.out.print(riders[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Passengers per trip on weekends");

        for (int i = 5;i<7;i++){
            for(int j = 0;j<2;j++){
                System.out.print(riders[i][j]+" ");
            }
            System.out.println();
        }
        // альтернативное обьявление двумерного массива
        int[][]num1;
        int [][] num2;
        int num3[][];
        int []num4[];

    }



}
