public class Main {
    public static void main(String[] args) {
        // создание обьекта через конструктор с 2 параметрами
        Person person1 = new Person("John",24); // присваиваем значения полей
                                                                    // обьекта через конструктор
                person1.name = "John";

        System.out.println("person1 name is "+person1.name);
        System.out.println("person1 age is "+person1.age);

        // создание обьекта через конструктор без аргументов
        Person person2 = new Person();
        person2.name = "Bill";
        person2.age = 45;

        //создание обьекта через конструктор с 3 параметрами
        Person person3 = new Person("Linda",30,"Street1");
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.address);

        person3.canEat();




    }
}
