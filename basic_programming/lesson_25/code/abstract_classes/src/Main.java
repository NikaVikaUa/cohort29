public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal lion = new Lion();
      //  Animal animal = new Animal();  обьект абстрактного класса создать нельзя !
        dog.sound();
        lion.sound();
        dog.run();
        lion.run();

        }
    }

