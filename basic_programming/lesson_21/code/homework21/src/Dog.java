public class Dog {
    public static void main(String[] args) {
        System.out.println("The number of dogs before  is "+Dog.counter);
        Dog willy = new Dog("Willy");
        Dog billy = new Dog("Billy");
        System.out.println("The number of dogs after  is "+willy.counter);
        System.out.println("The number of dogs after  is "+billy.counter);

    }
    /*
    Задача 1
Создать класс Dog c полями name и counter. Cоздать
несколько обьектов этого класса и вывести на печать количество созданных обьектов.
     */
     String name;
    static int counter;

    public Dog( String name){
        this.name = name;
        counter++;
    }
}
