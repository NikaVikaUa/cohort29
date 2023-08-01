import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDominantTest {
    private FindDominant findDominant;

    @BeforeEach
    public void init(){
        findDominant = new FindDominant();
    }


    @Test
    public void testFindDom_no_dominant(){
        int[]actual = {2,2,2,3,3,3} ;
        assertEquals(-1,findDominant.findDominant(actual));
    }


    @Test
    public void testFindDom_dominant_exists(){
        int[]actual = {2,3,2,2,3,3,3} ;
        assertEquals(3,findDominant.findDominant(actual));
    }

}