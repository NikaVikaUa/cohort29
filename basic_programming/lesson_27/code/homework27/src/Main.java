public class Main {

    /*
    Создать классы, содержащие методы для подсчета площади и периметра прямоугольника и круга,
    реализующие интерфейс Shape с методами getArea и getPerimeter. В классе Main создать несколько
    обьектов этих классов и
    вывести на печать значения площади и периметра каждого.

     */
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle1 = new Circle(15);


        Shape rect = new Rectangler(10,10);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Shape[] shapes = {circle,rect,circle1};
         ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("total shape is "+shapeCalculator.totalSquare(shapes));


        /*
        Дополнительно к классам и интерфейсу из задачи 1 создать класс ShapeCalculator,
        содержащий метод для вычисления общей площади фигур. Протестировать этот метод
         */


    }
}
