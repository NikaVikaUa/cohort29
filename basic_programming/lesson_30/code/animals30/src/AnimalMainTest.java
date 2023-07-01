import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMainTest {

    Animal wolf = new Animal("Wolf", 100, "grey");
    Animal elephant = new Animal("Elephant", 1000, "white");
    Animal bear = new Animal("Bear", 500, "brown");
    Animal fox = new Animal("Fox", 30, "red");
    Animal anakonda = new Animal("Anakonda", 400, "yellow");

    Animal[] zoo = {wolf, elephant, bear, fox, anakonda};


    @Test
    void testComparatorName(){
        ComparatorByName cbn = new ComparatorByName();

        assertTrue(cbn.compare(elephant,bear)>0);
    }

    @Test
    void testComparatorWeight(){
        ComparatorByWeight cbw = new ComparatorByWeight();

        assertFalse( cbw.compare(elephant,bear)<0);
    }

    @Test
    void testComparatorLastLetter(){
        ComparatorByLastLetter comparatorByLastLetter = new ComparatorByLastLetter();

        assertFalse(comparatorByLastLetter.compare(wolf,fox) > 0);
    }

}