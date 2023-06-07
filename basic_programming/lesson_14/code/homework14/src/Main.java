public class Main {

    /*
С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n
Пример:для числа n=3
1 в кубе 1
2 в кубе 8
3 в кубе 27
Задача2
Используя цикл while написать метод, выводящий на экран сумму цифр от 1 до 5
sum =15
"sum of digits from 1 to 5 is" + sum
     */

    public static void main(String[] args) {

  //   sumOfFive(100);
  //   countCube(3);
        multiplicationTable();


    }
/*
Используя цикл while написать метод, выводящий на экран сумму цифр от 1 до 5
sum =15
"sum of digits from 1 to 5 is" + sum
 */

    static void sumOfFive(int n){

        int i = 1;
        int sum = 0;

        while (i<=n){
            sum = sum +i;//1+2+3+4+5
            i++;

        }
        System.out.println(sum);

    }
    /*
    С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n
Пример:для числа n=3
1 в кубе 1
2 в кубе 8
3 в кубе 27
     */

    static void countCube (int n){
        int i = 1;

        while (i <= n){
            System.out.println("Number is: "+i+" and cube of "+i+ "is: "+(i*i*i));
            i++;
        }

    }


    // Вывести на экран таблицу умножения

    static void multiplicationTable(){
        int i = 1;
        while(i <=9){
            int j = 1;
            while(j<=9) {
                System.out.println(i + "*" + j + " = " + j * i);
                j++;
            }
            System.out.println("*******************");
            i++;
            }

        }
    }

