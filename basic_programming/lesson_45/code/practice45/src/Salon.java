import java.util.Scanner;

public class Salon {

    public static void main(String[] args) {

        String[] salon = {"Audi","Ford","BMW","Honda","Mazda"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car brand");
        String carToFind = scanner.nextLine();

        findCar(salon,carToFind);
    }

    public static void findCar( String[]cars, String carToFind){

        for ( int i = 0;i<cars.length;i++){

            if(cars[i].equalsIgnoreCase(carToFind)){
                System.out.println("This car is available");
                return;
            }
        }
        System.out.println("This car is not available. Take ");

        for( String car: cars){
            System.out.print(car+" ");
        }
    }
}
