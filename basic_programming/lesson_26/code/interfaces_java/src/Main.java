public class Main {

    // Интерфейс в джаве похож на абстрактный класс , но не является классом.
    // Изначальная идея интерфейса заключается в пердоставлении полной абстракции в отличие
    // от абстрактного класса.
    // Методы интерфейса не имеют тела и поэтому все такие методы должны быть реализованы
    // классом, реализующим интерфейс
    //  для указания на то, что класс реализует интерфейс используется слово implements
    // Создать обьект интерфейса нельзя
    // Интерфейс не может реализовывать другой интерфейс, но может его расширять.
    // В этом случае класс, реализующий такой интерфейс должен будет реализовать
    // методы обоих интерфейсов

    public static void main(String[] args) {
        Horse horse = new Horse();
        Car car = new Car();
        horse.canMove();
        car.canMove();
        horse.drive();
        car.drive();
        car.


        Moveable car1 = new Car();
        Moveable horse1 = new Horse();
        car1.canMove();
        horse1.canMove();

        Driveable car2 = new Car();
        Driveable horse2 = new Horse();

        Flyable plane = new Plane();
        Flyable moscito = new Moscito();
        Karlson karlson = new Karlson();
        plane.canFly();
        moscito.canFly();
        karlson.canFly();


    }
}
