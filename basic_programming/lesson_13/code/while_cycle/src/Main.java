import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Цикл While
        /*
        while(condition){
          statements
        }

        Вывести на экран числа от 1 до 10 используя цикл while
         */
        int i = 1;

        while( i <= 10){
            System.out.println(i);
           // i = i + 1;
            i++;
        }
        System.out.println("end of while loop");


        int y = 1;
        while (y <= 5){
            System.out.println("Hello");
            y++;
        }

        // напечатать маленькие буквы английского алфавита используя цикл while

        char ch = 'a';
        while(ch <= 'z'){

            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();

        int j = 10;
        while (j>=1){
            System.out.println(j);
            j--;
        }

        String nataly = "HelloJava";
        System.out.println(nataly.charAt(0));
        System.out.println(nataly.charAt(1));
        System.out.println(nataly.charAt(2));
        System.out.println(nataly.charAt(3));
        System.out.println(nataly.charAt(4));

        System.out.println("Print hello letters with while loop");

        int index = 0 ;
        int length = nataly.length();

        while (index<length){
            System.out.println(nataly.charAt(index));
            index++;
        }

        // do-while цикл

      /*
    do
    {
    statement(s)
    }while(condition)


*/
        int q =1;

        do {
            System.out.println(q);
            q--;
        } while (q < 1);


        Scanner sca = new Scanner(System.in);
        char input;

        do {

            System.out.println("Enter a letter/ enter q to quit ");
            input = sca.next().charAt(0);
            System.out.println("you have entered " + input);

        }while (input != 'q');

        // Используя цикл while  написать метод, выводящий на экран сумму цифр от 1 до 5
        // 1+2+3+4+5=15
        // sum =15
        // "sum of digits from 1 to 5 is" + sum


    }


}
