import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    Homework homework = new Homework();
    List<String> actual;

    @BeforeEach
    public void init(){
        actual = new ArrayList<>();
        actual.add("ymar");
        actual.add("john");
        actual.add("jhon");
        actual.add("njho");
        actual.add("amry");
        actual.add("evg");

    }

    @Test
    public void no_such_anagram(){

        assertEquals(List.of(),homework.findAnagrams("rob",actual));
        assertEquals(List.of(),homework.anagramsList("rob",actual));
    }


    @Test
    public void john_anagram(){
        List<String> expected = new ArrayList<>();
        expected.add("john");
        expected.add("jhon");
        expected.add("njho");

        assertEquals(expected,homework.findAnagrams("john",actual));
        assertEquals(expected,homework.anagramsList("john",actual));
    }


    @Test
    public void one_name_test(){
        List<String>expected = new ArrayList<>();
        expected.add("evg");

        assertEquals(expected,homework.findAnagrams("evg",actual));
        assertEquals(expected,homework.anagramsList("evg",actual));
    }





}