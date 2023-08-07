import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    private  Transformer transformer = new Transformer();
    String input = "aaa BBBB dDD cccCc eee";


    @Test
    public void  test_transform_zeroLength(){
        String zero ="";
        assertEquals(zero,Transformer.transform(zero,new WordsTransformerLowerCase()));
    }


    @Test
    public void  test_transform_lowerCase(){
        String expected ="aaa bbbb dDD cccCc eee";
        assertEquals(expected,Transformer.transform(input,new WordsTransformerLowerCase()));
    }


    @Test
    public void  test_transform_upperCase(){
        String expected ="AAA BBBB DDD cccCc EEE";
        assertEquals(expected,Transformer.transform(input,new WordsTransformerUpperCase()));
    }


    @Test
    public void  test_transform_star(){
        String expected ="aaa BBBB dDD ***** eee";
        assertEquals(expected,Transformer.transform(input,new WordsTransformerStar()));
    }


    @Test
    public void  test_transform_noChange(){
        String str ="aaa BBBB dDD rrrrrrrrrrr eee";
        assertEquals(str,Transformer.transform(str,new WordsTransformerStar()));
    }

}