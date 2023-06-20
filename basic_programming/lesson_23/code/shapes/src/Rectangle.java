public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle (String name, double a, double b){
        super(name);
        this.a = a;
        this.b = b;
    }

    public double getArea(){
        return a*b;
    }
}
