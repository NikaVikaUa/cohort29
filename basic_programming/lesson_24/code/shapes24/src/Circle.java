public class Circle extends Shape{

  //  private static double PI = 3.14;

    private double radius;


    public Circle ( String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
