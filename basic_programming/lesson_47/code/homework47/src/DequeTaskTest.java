import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeTaskTest {

    /*
    {}([]) - корректный порядок
     {}([]{()})
     */

    DequeTask d = new DequeTask();


    @Test
    public void test1(){
        char[] brackets = {'{', '}' , '(', '[',']', ')' };
        assertTrue(d.areBracketsCorrect(brackets));

    }

//   {}([]{()})
    @Test
    public void test2(){
        char[] brackets = {'{', '}' , '(', '[',']','{','(', ')','}',')' };
        assertTrue(d.areBracketsCorrect(brackets));
    }


    @Test
    public void test3(){
        char[] brackets = {'{', '(', ']'};
        assertFalse(d.areBracketsCorrect(brackets));
    }

   /* {}([])} -  некорректный порядок
        {}([])( -  некорректный порядок
        {(})- некорректный порядок */

    @Test
    public void test4(){
        char[] brackets = {'{','}','(','[',']',')','}'};
        assertFalse(d.areBracketsCorrect(brackets));
    }


    @Test
    public void test5(){
        char[] brackets = {'{','}','(','[',']',')','('};
        assertFalse(d.areBracketsCorrect(brackets));
    }

    @Test
    public void test6(){
        char[] brackets = {'{','(','}',')'};
        assertFalse(d.areBracketsCorrect(brackets));
    }


    @Test
    public void test7(){
        char[] brackets = {'}','}'};
        assertFalse(d.areBracketsCorrect(brackets));
    }


}