import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    public void list_empty_test(){
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();
        assertEquals(expected,m.removeNumbersBiggerThanNWithIterator(actual,5));
    }

    @Test
    public void list_one_elt_test(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = Arrays.asList(1);
        assertEquals(expected,m.removeNumbersBiggerThanNWithIterator(actual,5));
    }

    @Test
    public void list_remove_all_test(){
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = new ArrayList<>();
        actual.add(3);//  метод add добавляет элемент в конец листа
        actual.add(1);
        actual.add(2);
        actual.add(9);
        assertEquals(expected,m.removeNumbersBiggerThanNWithIterator(actual,0));
    }

    @Test
    public void list_remove_less_8(){
        List<Integer> expected = new ArrayList<>();
        expected.add(3);//  метод add добавляет элемент в конец листа
        expected.add(1);
        expected.add(2);

        List<Integer> actual = new ArrayList<>();
        actual.add(3);//  метод add добавляет элемент в конец листа
        actual.add(1);
        actual.add(2);
        actual.add(9);
        assertEquals(expected,m.removeNumbersBiggerThanNWithIterator(actual,8));
    }






}