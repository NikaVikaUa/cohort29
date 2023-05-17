public class Main {

    // Переменные в Джава
    /*
    000 0
    001 1
    010 2
    011 3

    У каждой переменной в Джава есть три важных свойства: тип, имя  и значение.
    тип переменной определяет тип данных, которые в ней можно хранить

    Создание переменной
    тип имя
     */
    public static void main(String[] args) {


        int a;
        String b;

       // x = 56;
        int x = 456; // -2^31 до 2^31 -1    -2147483648 до 2147483647
        int y=23;
        x = 6;
        x = 5;
        x = 5;
        x = 12345;
        x = 2147483647;


        a = 25;
         x=245;
         int i = 2;
         x = i;
        System.out.println(x);

        x = i +3;//5

        x = x + 4;//9
        System.out.println(x);

        int number;
        number = 23;

        int next_number; //snake case
        int nextNumber; // camel case

        /*
        1. Названия перепменных в джава не могут содержать пробелы  , например num ber = 100
        2. Название переменной может начинаться со специального символа $  и _. Но не может начинаться
        с цифры
        2. Название должно начинаться с маленькой буквы
        3. Для  составных названий принят т.н. camel case: newNumber
         */
       int  _num;
       int $num;
      // int 6num;
       int num5;

       String name ="John";
       name = "Evgeny";
       name = "Kate";
        System.out.println("Kate");

        System.out.println("My name is "+name);

        String complex = "My name is" +" Evgeny";

        int num = 5+1;
        String strNum = "5";
        System.out.println(5+"5");
        System.out.println(num+strNum);

        System.out.println(2+4);
        System.out.println("2a"+"4");
        System.out.println("2"+4+5+4);
        System.out.println(2+3+"4");
        System.out.println("2"+(1+3));
        System.out.println("sum of 1 and 2 is "+(1+2));
        System.out.println(45 + 5 + "=" + 45 + 5);
        System.out.println(45 + 5 + "=" + (45 + 5));

        int num1,num2,num3;
        num1 = num2 = num3 = -100;

        num1 = num1 +10;
        num1 +=10;

        num2 = num2 -10;
        num2 -=10;









    }

}
