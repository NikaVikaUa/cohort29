import java.util.Random;

public class OurRandom {

    // класс Random

    public static void main(String[] args) {


        // создание экземпляра класса Random
        Random random = new Random();

        // генерация случайных чисел в диапазоне от 0 до 999
      int randInt1 =  random.nextInt(1000);
      int randInt2 =  random.nextInt(1000);
      int randInt3 =  random.nextInt(1000);


        System.out.println(randInt1);
        System.out.println(randInt2);
        System.out.println(randInt3);

      double randomDouble =  random.nextDouble();
      double randomDouble1 =  random.nextDouble();
      double randomDouble2 =  random.nextDouble();

        System.out.println(randomDouble);
        System.out.println(randomDouble1);
        System.out.println(randomDouble2);

    }


}
