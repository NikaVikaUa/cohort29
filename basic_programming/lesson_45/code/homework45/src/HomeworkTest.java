import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {
    private Homework homework;

    @BeforeEach
    public void init(){
        homework = new Homework();
    }

    @Test
    public void removeDuplicatesOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(actual,homework.removeDuplicates(expected));
    }


    @Test
    public void removeDuplicatesNoDuplicates(){
        List<String> actual = Arrays.asList("John","Jack","Bill","Ann");
        List<String> expected = Arrays.asList("Ann","Bill","Jack","John");

        List<String> result = homework.removeDuplicates(actual);
        Collections.sort(result);
        assertEquals(expected,result);
    }


    @Test
    public void removeDuplicatesSeveralDuplicates(){
        List<String> actual = Arrays.asList("John","Jack","Bill","Ann","John","Bill");
        List<String> expected = Arrays.asList("John","Jack","Bill","Ann");
        Collections.sort(expected);

        List<String> result = homework.removeDuplicates(actual);
        Collections.sort(result);

        assertEquals(expected,result);
    }


    @Test
    public void getDuplicatesOneElement() {
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();
        assertEquals(expected, homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesNoDuplicates() {
        List<String> actual = Arrays.asList("John","Jack","Ann","Mary");
        List<String> expected = Arrays.asList();
        assertEquals(expected, homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesOneDuplicate() {
        List<String> actual = Arrays.asList("John","Jack","Ann","Mary","Mary","John");
        List<String> expected = Arrays.asList("Mary","John");
        assertEquals(expected, homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicates_twoJohns_threeMarys() {
        List<String> actual = Arrays.asList("Mary","John","Jack","Ann","Mary","Mary","John");
        List<String> expected = Arrays.asList("Mary","John");
        assertEquals(expected, homework.getDuplicates(actual));
    }



    @Test
    public void getDuplicates_allMarys() {
        List<String> actual = Arrays.asList("Mary","Mary","Mary","Mary");
        List<String> expected = Arrays.asList("Mary");
        assertEquals(expected, homework.getDuplicates(actual));
    }





}