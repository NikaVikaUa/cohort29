public class Car {
    private String name;
    private int year;

    public static int counter;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        counter++;// подсчитаем количество сделанных машин. Т.е. каждый раз при создании нового обьекта машина, счетчик
                  // будет увеличиваться
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static int getCounter() {
        return counter;
    }
    public static void setCounter( int numberOfCars){
        counter = numberOfCars;
    }
}
