/*
Задача 2
Создать класс Car, содержащий поля
model
colour
productionDate
а также методы drive и stop.
Создать дочерние классы PassengerCar и Truck. Класс PassengerCar должен также содержать поле
numberOfSeats(количество мест) а Класс Truck поле loadCapacity (грузоподьемность).
В методе main класса Main создать несколько обьектов этих классов и вывести
в консоль их характеристики и результат работы методов
 */

public class Car {
   String model;
   String colour;
   int  productionDate;

    public Car(String model, String manufacturer, int year, String colour) {
    }

    public void drive(){
       System.out.println("The car is driving");
   }

   public void stop(){
       System.out.println("The car is stopping");
   }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
