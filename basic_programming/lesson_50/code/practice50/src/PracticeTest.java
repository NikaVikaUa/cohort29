import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    private Practice practice;

    @BeforeEach
    public void setUp(){
        practice = new Practice();
    }

    @Test
    public void testFindDom_no_dominant(){
        int[] array = {6,7,7,6,6,7};
        assertEquals(-1,practice.findDominant(array));
        assertEquals(-1,practice.findDominantElement(array));
    }


    @Test
    public void testFindDom_dominant_exists(){
        int[] array = {5,5,9,9,5,5,1,3,6,6,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        assertEquals(5,practice.findDominant(array));
        assertEquals(5,practice.findDominantElement(array));
    }


    @Test
    public void testFindDom_dominant_oneElt(){
        int[] array = {2};
        assertEquals(2,practice.findDominant(array));
        assertEquals(2,practice.findDominantElement(array));
    }


    @Test
    public void testFindDom_dominant_two_dif(){
        int[] array = {2,3};
        assertEquals(-1,practice.findDominant(array));
        assertEquals(-1,practice.findDominantElement(array));
    }


    @Test
    public void testFindDom_dominant_two_equal(){
        int[] array = {2,2};
        assertEquals(2,practice.findDominant(array));
        assertEquals(2,practice.findDominantElement(array));
    }


    @Test
    public void test_countOrdersNumber(){
        long[] array = {1000000, 1200000, 1250000,1300000,1600000,1700000,1800000,1850000,1890000};
        assertArrayEquals(new int[]{0,1,2,3,1,1,2,3,4 },practice.countOrdersNumber(array,5));
        // 5 минут = 5*60*1000 = 300000   //0 1 2 3 1 1 2 3 4
    }

}