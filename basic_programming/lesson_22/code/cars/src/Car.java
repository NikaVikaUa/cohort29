public class Car {
private String model;
private String manufacturer;

private int year;
private String colour;

    public Car(String model, String manufacturer, int year, String colour) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
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
                "manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", productionDate=" + year +
                '}';
    }
}
