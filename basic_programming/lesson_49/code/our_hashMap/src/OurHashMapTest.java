import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    @Test
    public void testSizePut_emptyMap_newElements(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
    }


    @Test
    public void testSizePut_emptyMap_noElements(){
        OurMap<Integer,String> newMap = new OurHashMap<>();

        assertEquals(0,newMap.size());
    }


    @Test
    public void testSizePut_NotEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
        newMap.put(4,"d");
        assertEquals(4,newMap.size());
    }


    @Test
    public void testSizePut_NotEmptyMap_ExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
        newMap.put(2,"d");
        assertEquals(3,newMap.size());
    }


    @Test
    public void testGetContains_NotEmptyMap_ExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals("b",newMap.get(2));
        assertEquals("a",newMap.get(3));
        assertEquals("c",newMap.get(1));

    }


    @Test
    public void testGetContains_NotEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(null,newMap.get(5));


    }

    @Test
    public void testGetContains_emptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();

        assertEquals(null,newMap.get(5));

    }

    @Test
    public void testRemove_NotEmptyMap_existKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
        newMap.remove(2);
        assertEquals(2,newMap.size());
        assertEquals(null,newMap.get(2));


    }


    @Test
    public void testRemove_NotEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
        newMap.remove(5);
        assertEquals(3,newMap.size());
        assertEquals(null,newMap.get(5));


    }

}