public class PassengerCar extends Car {
    int numberOfSeats;

    public PassengerCar(String model,
                        String manufacturer,
                        int year,
                        String colour,
                        int numberOfSeats)
    {
        super(model,manufacturer,year,colour);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void drive(){
        System.out.println("Passenger car is driving");
    }

    @Override
    public void stop(){
        System.out.println("Passenger car stops");
    }

}
