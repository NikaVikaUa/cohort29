import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnotherDequeTaskTest {

    public AnotherDequeTask anotherDequeTask;
    List<Integer> test;

    @BeforeEach
    public void init(){
        anotherDequeTask = new AnotherDequeTask();
        test = Arrays.asList(1,2,3,5);
    }

    @Test
    public void test_true(){
        assertTrue(anotherDequeTask.multiplyTwoDeque(test,6));
    }


    @Test
    public void test_false(){
        assertFalse(anotherDequeTask.multiplyTwoDeque(test,7));
    }


    @Test
    public void test_oneElt(){
        assertFalse(anotherDequeTask.multiplyTwoDeque(Arrays.asList(3),7));
    }

}