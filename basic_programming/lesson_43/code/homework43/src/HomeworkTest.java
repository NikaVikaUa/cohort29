import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    public void getAddressesTestEmpty(){
        assertEquals(Arrays.asList(),homework.getAddresses(Arrays.asList()));
    }


    @Test
    public void getAddressesTestOne(){
        Address address = new Address("Street1",1);
        Person person = new Person("Person1",address);

        List<Address> expected = Arrays.asList(address);
        List<Person> actual = Arrays.asList(person);

        assertEquals(expected,homework.getAddresses(actual));
    }


    @Test
    public void getAddressesTestSeveral(){
        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Person person1 = new Person("Person1",address1);
        Person person2 = new Person("Person2",address2);

        List<Address> expected = Arrays.asList(address1,address2);
        List<Person> actual = Arrays.asList(person1,person2);

        assertEquals(expected,homework.getAddresses(actual));
    }

   // 1,2,3,4,5 ->  5,1,2,3,4 ->  5,4,1,2,3 -> 5,4,3,1,2 -> 5,4,3,2,1
    public static void reverseList( List<Integer> list){
        for (int i = 0, j = list.size()-1; i < j;i++){
            list.add(i,list.remove(j));
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverseList(list);
      //  System.out.println(list);
    }

}