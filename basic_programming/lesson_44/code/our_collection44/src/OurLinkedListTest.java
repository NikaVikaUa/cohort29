import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    OurLinkedList list;

    @BeforeEach
    public void init(){
        list = new OurLinkedList();
    }

    @Test
    public void testOurAddOurGet_emptyObject_addsOneElement(){

        list.ourAdd(5); //5 добавлено на нулевую позицию

        assertEquals(5,list.ourGet(0)); // проверяем равен ли элемент на нулевой позиции 5
        // с помощью ourGet()
    }


    @Test
    public void testOurAddOurGet_emptyObject_addsSeveralElement(){

        Integer[] expected = {1,3,-5,18,7,89,34,2,50,24,-4,60,70,22,-101};
        for ( int i = 0;i<expected.length;i++) {
            list.ourAdd(expected[i]);  //  в цикле добавляем все элементы массива к нашему листу по очереди
        }
        //    assertEquals(1, list.ourGet(0));
        //    assertEquals(3, list.ourGet(1));
        //    assertEquals(-5, list.ourGet(2));

        //  в цикле сравниваем соответствующие значения массива и результат работы метода ourGet для каждого элемента
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.ourGet(i));
        }
    }

    @Test
    public void testSize_emptyList_addsOneElement(){

        list.ourAdd(5);

        assertEquals(1,list.ourSize());
    }

    @Test
    public void testSize_emptyList_addsSeveralElements(){

        Integer[] expected = {1,3,-5,18,7,89,34,2,50,24,-4,60,70,22,-101};
        for ( int i = 0;i<expected.length;i++) {
            list.ourAdd(expected[i]);  //  в цикле добавляем все элементы массива к нашему листу по очереди
        }
        // проверяем работу метода ourSize с несколькими элементами
        assertEquals(expected.length,list.ourSize());

    }

    @Test
    public void  testSet_oneElment_changesElement(){
        list.ourAdd(3);
        list.ourSet(10,0);// меняем значение по индексу 0

        assertEquals(10,list.ourGet(0));
    }


    @Test
    public void testSet_severalElements_setsFirstLastMiddleElements(){

        Integer[] source = {1,3,-10,18,4};
        for( int i = 0;i < source.length; i++){
            list.ourAdd(source[i]);
        }
        list.ourSet(10,0);
        list.ourSet(5,4);
        list.ourSet(-5,2);

        Integer[] expected = {10,3,-5,18,5};

        for( int i = 0;i < source.length; i++){
            assertEquals(expected[i],list.ourGet(i));
        }
        assertEquals(5,list.ourSize());
    }

    // хотим получить элемент по несуществующему индексу. При правильной работе метода должны получить exception
    @Test
    public void testGet_nonEmptyList_getOuterElement(){

        list.ourAdd(4);
        list.ourAdd(8);
        list.ourAdd(1);
        list.ourAdd(43);


        // Проверка бросает ли метод нужное нам исключение.
        // Слева пишется ожидаемый тип исключения.class
        assertThrows(IndexOutOfBoundsException.class,()->list.ourGet(4));
    }

    @Test
    public void testOurSet_nonEmptyList_putOuterElement(){

        list.ourAdd(4);
        list.ourAdd(8);
        list.ourAdd(1);
        list.ourAdd(43);


        // Проверка бросает ли метод нужное нам исключение.
        // Слева пишется ожидаемый тип исключения.class
        assertThrows(IndexOutOfBoundsException.class,()->list.ourSet(76,4));
    }

    @Test
    public void testRemoveById_nonEmptyList_removesWrongElement(){
        list.ourAdd(4);
        list.ourAdd(8);
        list.ourAdd(1);
        list.ourAdd(43);


        // Проверка бросает ли метод нужное нам исключение.
        // Слева пишется ожидаемый тип исключения.class
        assertThrows(IndexOutOfBoundsException.class,()->list.ourRemoveById(4));

    }

    @Test
    public void testRemoveById_nonEmptyList_removesFirstElement(){

        list.ourAdd(5);
        list.ourAdd(15);
        list.ourAdd(2);
        list.ourAdd(13);
        list.ourAdd(7);
        list.ourAdd(57);

        Object object = list.ourRemoveById(0); // значение удаленного элемента возвращается методом
        // и присваивается переменной object
        assertEquals(5,object);

        Integer[] expected = {15,2,13,7,57};

        // проверяем остались ли элементы, которые не надо было удалять
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.ourGet(i));
        }

        assertEquals(5,list.ourSize());
    }


    @Test
    public void testRemoveById_nonEmptyList_removesMiddleElement(){

        list.ourAdd(5);
        list.ourAdd(15);
        list.ourAdd(24);
        list.ourAdd(13);
        list.ourAdd(7);
        list.ourAdd(57);

        Object object = list.ourRemoveById(2); // значение удаленного элемента возвращается методом
        // и присваивается переменной object
        assertEquals(24,object);

        Integer[] expected = {5,15,13,7,57};

        // проверяем остались ли элементы, которые не надо было удалять
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.ourGet(i));
        }

        assertEquals(5,list.ourSize());
    }



    @Test
    public void testRemoveById_nonEmptyList_removesLastElement(){


        list.ourAdd(5);
        list.ourAdd(15);
        list.ourAdd(2);
        list.ourAdd(13);
        list.ourAdd(7);
        list.ourAdd(57);

        Object object = list.ourRemoveById(5); // значение удаленного элемента возвращается методом
        // и присваивается переменной object
        assertEquals(57,object);

        Integer[] expected = {5,15,2,13,7};

        // проверяем остались ли элементы, которые не надо было удалять
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.ourGet(i));
        }

        assertEquals(5,list.ourSize());
    }


    @Test
    public void test_contains_nonEmptyList_containsElements(){

        list.ourAdd(5);
        list.ourAdd(15);
        list.ourAdd(2);
        list.ourAdd(3);
        list.ourAdd(16);
        list.ourAdd(20);

        assertTrue(list.ourContains(5));
        assertTrue(list.ourContains(16));
        assertTrue(list.ourContains(20));
    }


    @Test
    public void test_contains_nonEmptyList_notContainsElements(){

        list.ourAdd(5);
        list.ourAdd(15);
        list.ourAdd(2);
        list.ourAdd(3);
        list.ourAdd(16);
        list.ourAdd(20);

        assertFalse(list.ourContains(45));
        assertFalse(list.ourContains(160));
        assertFalse(list.ourContains(2034));
    }






}