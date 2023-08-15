import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    private Practice practice;

    @BeforeEach
    public void init() {
        practice = new Practice();
    }

    @Test
    public void test_composeList() {
        List<Person> people = Practice.composeList("classPeople.txt");
        assertEquals("Jack", people.get(0).name);
        assertEquals(30, people.get(0).age);
        assertEquals("John", people.get(1).name);
        assertEquals(45, people.get(1).age);
    }

}