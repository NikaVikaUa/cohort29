public class Person {

    String name;
    int age;

    static int counter; // статическая переменная обьявляется с использованием слова static. Статическая переменая
                        // не принадлежит никакому обьекту, а является переменной класса.

    public  Person(String name, int age){
        this.name = name;
        this.age = age;
        counter++;
    }

    public void canTalk (){
        System.out.println("I can talk");
    }
    public static void sum(){
        System.out.println(1+2);
    }

}
