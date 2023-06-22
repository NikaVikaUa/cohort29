import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxMinDiffTest {

    FindMaxMinDiff diff;

    @BeforeEach
   public void init(){
        diff = new FindMaxMinDiff();
    }

    @Test
    @DisplayName("test with empty array")
    public void testEmpty(){
        int[] actual = {};
        assertEquals(-1,diff.countDifference(actual));

    }

    @Test
    @DisplayName("test with one element in array")
    public void testOne(){
        int[] actual = {5};
        assertEquals(-1,diff.countDifference(actual));

    }

    @Test
    @DisplayName("test with two elements in array")
    public void testTwo(){
        int[] actual = {1,2};
        assertEquals(1,diff.countDifference(actual));
    }

    @Test
    @DisplayName("test with several elements in array and max as leftmost and min rightmost")
    public void testSeveralMaxMin(){
        int[] actual = {10,4,5,1};
        assertEquals(9,diff.countDifference(actual));
    }

    @Test
    @DisplayName("test with several elements in array and max as rightmost and min leftmost")
    public void testSeveralMinMax(){
        int[] actual = {10,4,5,1};
        assertEquals(9,diff.countDifference(actual));
    }

    @Test
    @DisplayName("test with several elements in array, max and min in the middle")
    public void testSeveralMinMaxInTheMiddle(){
        int[] actual = {10,1,51,10};
        assertEquals(50,diff.countDifference(actual));
    }


}