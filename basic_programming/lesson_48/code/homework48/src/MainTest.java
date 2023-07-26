import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach
    public void  init(){
        m = new Main();
    }

    @Test
    public void abTest_true(){
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");

        Map<String,String>expected = new HashMap<>();
        expected.put("a","Hi");
        expected.put("b","There");
        expected.put("ab","HiThere");

        assertEquals(expected,m.ab(actual));
    }

    @Test
    public void abTest_noA(){
        Map<String,String>actual = new HashMap<>();
        actual.put("c","Hi");
        actual.put("b","There");

        assertEquals(actual,m.ab(actual));
    }

    @Test
    public void abTest_noB(){
        Map<String,String>actual = new HashMap<>();
        actual.put("a","Hi");

        assertEquals(actual,m.ab(actual));
    }

    @Test
    public  void abTest_empty(){
        Map<String,String> actual = new HashMap<>();

        assertEquals(actual,m.ab(actual));
    }

}