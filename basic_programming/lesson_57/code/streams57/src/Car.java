public class Car {

    private  String brand;
    private  int price;

    private String colour;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;

    }

    public Car(String brand, int price,String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;

    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
