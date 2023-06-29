import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Интерфейс Comparable. Используется для сравнения однотипных обьектов и позволяет сортировать
        // обьекты в соответствии с определенным порядком. Если  срвнение и сортировка  например числовых массивов
        // понятна ( задан естественный порядок сортировки) , то в случае с обьектами надо определять порядок
        // самостоятельно. Для этого и служит  интерфейс Comparable , имеющий метод compareTo()
        /*
        int compareTo( Object o1)  - этот метод сравнивает обьект, на котором он вызывается со вторым обьектом
        ( в скобках).  Он возвращает целое число, которое означает:
        - если число больше нуля, то обьект, на котором вызывается метод, больше второго обьекта о1
        - если равно нулю, то обьекты равны
        - если меньше нуля то обьект меньше чем о1

        Сравнение происходит по отдельным полям. Нужно принять решение какое поле или поля класса будут
         использоваться в определении порядка сортировки обьектов.  Порядок сортировки , заданнвй в этом
           методе, является так  называемым естественным порядком сортировки обьектов класса.
         */
        int[] array = {11,2,67,23,0,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String[] strings = {"John","Barbara","Alex"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Player player1 = new Player(30,"John",20);
        Player player2 = new Player(10,"Steve",18);
        Player player3 = new Player(20,"Alex",26);
        Player player4 = new Player(50,"Alex",20);

      //  System.out.println(player2.compareTo(player1));

        Player[] footballTeam = {player1,player2,player3,player4};

        System.out.println("Football team before sorting");
        System.out.println(Arrays.toString(footballTeam));

        System.out.println("Football team after sorting");
        Arrays.sort(footballTeam);
        System.out.println(Arrays.toString(footballTeam));
    }
}
