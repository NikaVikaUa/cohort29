import java.util.Arrays;

public class Main {

    /*
    Создать класс Car с полями model, price, year(год выпуска)
В методе main создать массив обьектов класса Car, отсортировать
его по цене и вывести на экран
     */
    public static void main(String[] args) {
        Car car1 = new Car( "Volvo",2020, 30000);
        Car car2 = new Car( "Toyota",1991, 5000);
        Car car3 = new Car( "Audi",2023, 60000);
        Car car4 = new Car( "Lada",1980, 1);

        Car[] cars = {car1,car2,car3,car4};

        Arrays.sort(cars);
        for ( int i = 0; i<cars.length;i++){
            System.out.println(cars[i]);
            System.out.println("------------------");
        }
    }
}
