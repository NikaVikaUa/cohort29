public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Horse horse = new Horse();
        Puppy puppy = new Puppy();
     //   animal.sound();
     //   dog.sound();
      //  horse.sound();
      //  puppy.sound();

        // IS - A
        Animal dog1 = new Dog();
        Animal puppy1 = new Puppy();

        dog1.sound();

        // методы, определенный только в дочернем классе в родительском классе не видны.
        Horse horse1 = new Horse();
        Animal horse2 = new Horse();

        horse1.run();
    //    Animal horse3 = (Horse) horse2;





    }
}
