import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    Practice practice;
    String input;
    Predicate<String> predicate;
    Function<String,String> function;

    @BeforeEach
    public void init(){
        practice =  new Practice();
        input = "AAA bbbb dEF CDkLw bBb";

    }

    @Test
    public void testEmpty(){
        input ="";
        predicate = s -> s.length() == 3;
        function = String::toLowerCase;

        assertEquals("",practice.transform(input,predicate,function));
    }


    @Test
    public void test_3_toLowerCase(){

        predicate = s -> s.length() == 3;
        function = String::toLowerCase;

        assertEquals("aaa bbbb def CDkLw bbb",practice.transform(input,predicate,function));
    }


    @Test
    public void test_4_toUpperCase(){
        predicate = s -> s.length() == 4;
        function = String::toUpperCase;

        assertEquals("AAA BBBB dEF CDkLw bBb",practice.transform(input,predicate,function));
    }


    @Test
    public void test5Stars(){
        predicate = s -> s.length() == 5;
        function = s -> s = "*****";

        assertEquals("AAA bbbb dEF ***** bBb",practice.transform(input,predicate,function));
    }


    @Test
    public void testNothingChanged(){
        input = " aaa bbbbbbbbbbbbbbbbbb";
        predicate = s -> s.length() == 4;
        function = String::toUpperCase;

        assertEquals(" aaa bbbbbbbbbbbbbbbbbb",practice.transform(input,predicate,function));
    }





}