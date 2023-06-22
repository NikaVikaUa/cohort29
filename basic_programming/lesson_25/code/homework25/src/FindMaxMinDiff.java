public class FindMaxMinDiff {

    public static void main(String[] args) {
        int[] numbers = {4,2,5,8};
     //   System.out.println("difference between max and min is "+countDifference(numbers));

    }


  public  int countDifference (int[] numbers){
        if(numbers.length == 0 || numbers.length == 1)
        {return -1; }
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
}
