import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main m;

    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void yesOrNoTestEmpty(){
        assertEquals(Arrays.asList(),m.returnYesOrNo(Arrays.asList(),Arrays.asList()));
    }


    @Test
    public void yesOrNoTestEmptyOneElement(){
        List<String> expected = Arrays.asList("No");

        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(5);

        assertEquals(expected,m.returnYesOrNo(actual1,actual2));
    }

    @Test
    public void yesOrNoTestSeveral(){
        List<String> expected =Arrays.asList("No","Yes","Yes","No");
        List<Integer> actual1 = Arrays.asList(1,2,3,4);
        List<Integer> actual2 = Arrays.asList(5,2,3,7);

        assertEquals(expected,m.returnYesOrNo(actual1,actual2));
    }

    @Test
    public void findShortestOrLongestTest_emptyList_throwsException(){
        assertThrows(EmptyListException.class,()->m.findShortestOrLongest(Arrays.asList()));
    }

    @Test
    public void findShortestOrLongestTest_oneElement() throws EmptyListException{
        assertEquals("a",m.findShortestOrLongest(Arrays.asList("a")));
    }


    @Test
    public void findShortestOrLongestTest_shortFirst() throws EmptyListException{
        assertEquals("a",m.findShortestOrLongest(Arrays.asList("bb","a","ff","ddd")));
    }


    @Test
    public void findShortestOrLongestTest_longFirst() throws EmptyListException{
        assertEquals("aaa",m.findShortestOrLongest(Arrays.asList("bb","aaa","ff","d")));
    }

}