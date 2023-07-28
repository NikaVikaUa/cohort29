import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

   private Homework homework;

   @BeforeEach
   public void init(){
       homework = new Homework();
   }

   @Test
   public void numeToNumberOccurence_test_2Occurences(){
       List<String> input = Arrays.asList("John","Mary","Ann","John");

       assertEquals(2,homework.nameToNumberOccurence(input,"John"));
   }


    @Test
    public void numeToNumberOccurence_test_1Occurences(){
        List<String> input = Arrays.asList("John","Mary","Ann","John");

        assertEquals(1,homework.nameToNumberOccurence(input,"Ann"));
    }


    @Test
    public void numeToNumberOccurence_test_0_Occurences(){
        List<String> input = Arrays.asList("John","Mary","Ann","John");

        assertEquals(0,homework.nameToNumberOccurence(input,"Evgeny"));
    }


    @Test
    public void numeToNumberOccurence_test_onlyTwoJohns(){
        List<String> input = Arrays.asList("John","John");

        assertEquals(2,homework.nameToNumberOccurence(input,"John"));
    }


    @Test
    public void numeToNumberOccurence_test_empty(){
        List<String> input = Arrays.asList();

        assertEquals(0,homework.nameToNumberOccurence(input,"Ann"));
    }

}