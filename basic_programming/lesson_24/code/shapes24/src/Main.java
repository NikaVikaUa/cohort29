public class Main {
    /*
    Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата и круга.
    Кроме результата работы методов должно выводиться также название соответствующей фигуры. В методе main
    создать массив таких обьектов и вывести его на экран

    подробнее:
    1. Должны быть созданы классы Rectangle, Square, Circle, переопределяющие метод getArea родительского класса
       Shape , который содержит также общее для всех классов поле name.
    2. В методе main создаем массив, содержащий обьекты этих классов ( по одному от каждого) и затем
        в цикле выводим на экран площади фигур элементов этого массива. Кроме площади фигуры должно также
        выводиться ее название

        площадь круга pi * radius * raduis
        площадь прямоугольника со сторонами a  и b   a*b
        площадь квадрата со стороной a     a*a

        Rectangle has area of 50
        Circle has area of 20
        Square has area of 10
        Shape has area of 0



     */

    public static void main(String[] args) {
        Shape circle = new Circle("Circle",10);
        Shape rectangle = new Rectangle("Rectangle",5,10);
        Shape square = new Square("Square",7);
        Shape shape = new Shape("Shape");

        Shape[] shapes = {circle,rectangle,square,shape};

        System.out.println("shapes:");

        for( Shape s: shapes) {
            System.out.println(s.getName()+" has area of "+s.getArea());
        }

    //    for( int i = 0;i < shapes.length;i++){
    //        System.out.println(shapes[i].getName()+" has area of "+shapes[i].getArea());
        }


    }


