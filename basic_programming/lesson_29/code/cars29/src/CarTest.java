import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car1 = new Car( "Volvo",2020, 30000);
    Car car2 = new Car( "Toyota",1991, 5000);
    Car car3 = new Car( "Audi",2023, 60000);
    Car car4 = new Car( "Lada",1980, 1);


    @Test
    public void sorted(){
        Car[] actual = {car1,car2,car3,car4};
        Car[] expected = {car4,car2,car1,car3};

        Arrays.sort(actual);
        assertArrayEquals(expected,actual);// проверка равенства массивов
    }

    @Test
    public void testCompareTo(){
    // assertTrue  проверяет истинность выражения в скобках. Тест пройдет если результат выражения в скобках true.
    // не пройдет в обратном случае
        assertTrue( car1.compareTo(car2) > 0);
    }


    @Test
    public void testCompareToFalse(){
// assertFalse  проверяет ложность выражения в скобках. Т.е. тест проходит, если результат выражения false
        assertFalse(car1.compareTo(car2) < 0);
    }




}