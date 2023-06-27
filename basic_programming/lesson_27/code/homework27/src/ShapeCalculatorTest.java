import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    ShapeCalculator shapeCalculator;

    @BeforeEach
    void init(){
        shapeCalculator = new ShapeCalculator();
    }

    @Test
    public void test_two_shapes(){

   //     Circle circle = new Circle(10);
   //     Rectangler rectangler = new Rectangler(5,10);
   //     Shape[] shapes = {circle,rectangler};
        Shape[] shapes = {new Circle(10),new Rectangler(5,10)};
        assertEquals(364.0,shapeCalculator.totalSquare(shapes));
    }

    @Test
    public void test_one_shape(){

        Shape[] shapes = {new Rectangler(5,10)};
        assertEquals(50.0,shapeCalculator.totalSquare(shapes));
    }


    @Test
    public void test_zero_shape(){

        Shape[] shapes = {};
        assertEquals(0.0,shapeCalculator.totalSquare(shapes));
    }



}