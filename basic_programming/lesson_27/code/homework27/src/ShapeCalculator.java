public class ShapeCalculator {

    public double totalSquare(Shape[] shapes){
        double res = 0;

        for(Shape s: shapes){
            res += s.getArea();
        }
     //   for(int i = 0;i<shapes.length;i++)
     //       res += shapes[i].getArea();
        return res;
    }
}
