public class Rectangler implements Shape{

    double length;
    double width;

    public Rectangler( double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }

    public double getArea(){
        return length*width;
    }


}
