public class Main {

    public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);
          int a;
          String str;
          Person p1 = new Person(); // создание нового объекта класса Person
            p1.name = "John";
            p1.age = 35;
     //   System.out.println("p1 name is "+p1.name);
     //   System.out.println("p1 age is "+p1.age);
            p1.myName();
            p1.myAge();
            p1.canWalk();
            p1.canEat();


        System.out.println("p2 person");
          Person p2 = new Person();
            p2.name = "Mary";
            p2.age = 25;
     //   System.out.println("p2 name is "+p2.name);
     //   System.out.println("p2 age is "+p2.age);
        p2.myName();
        p2.myAge();
        p2.canWalk();
        p2.canEat();






    }
}
