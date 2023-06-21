import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxElementInArrayTest {

    MaxElementInArray m;

    @BeforeEach
    void init(){
        m = new MaxElementInArray();
    }

    @Test
    public void  zeroElt_test(){
        int[] ints ={};

        assertEquals(-1,m.findMax(ints));
    }

    @Test
    public void oneElt_test(){
        int[] ints = {45};

        assertEquals(45,m.findMax(ints));
    }
    @Test
    public void twoElt_test(){
        int[] ints ={2,5};

        assertEquals(5,m.findMax(ints));
    }

    @Test
    public void severalEltMaxInTheMiddle_test(){
        int[]ints = {2,1,5,0,9,6,8,2,7};

        assertEquals(9,m.findMax(ints));
    }
    @Test
    public void severalEltMaxFirst_test(){
        int[]ints = {10,2,1,5,0,9,6,8,2,7};

        assertEquals(10,m.findMax(ints));
    }

    @Test
    public void severalEltMaxLast_test(){
        int[]ints = {10,2,1,5,0,9,6,8,2,7,25};

        assertEquals(25,m.findMax(ints));
    }
}