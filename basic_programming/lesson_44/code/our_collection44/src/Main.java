import our_collection.performance_test.ArrayListOperationsStrategy;
import our_collection.performance_test.LinkedListOperationsStrategy;
import our_collection.performance_test.ListOperationsStrategy;
import our_collection.performance_test.ListPerformanceTester;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        String jack = list.get(0);

        OurList<String> ourList = new OurArrayList<>();
        ourList.ourAdd("Jack");
        String ourJack = ourList.ourGet(0);
    //    System.out.println(ourJack);
        ourList.ourRemove("Jack");
        ourList.ourAdd("John");

        for(int i = 0; i<ourList.ourSize();i++){
            System.out.println(ourList.ourGet(i));
        }
       // Arrays.toString(ourList);
        Human john = new Human("John",20);
        Human bill = new Human("Bill",24);
        Human ann = new Human("Ann",24);
        Human bill1 = new Human("Bill",24);
        System.out.println("Bill equals Bill1 ? "+bill.equals(bill1));

        OurArrayList<Human> humans = new OurArrayList();
        humans.ourAdd(john);
        humans.ourAdd(bill);
        humans.ourAdd(ann);

        for( int i = 0;i<humans.ourSize();i++){
            System.out.println(humans.ourGet(i));
        }

        humans.ourRemove(bill);

        System.out.println("After removing Bill");
        for( int i = 0;i<humans.ourSize();i++){
            System.out.println(humans.ourGet(i));
        }

        // Проверка быстродействия ( performance test )

        ListOperationsStrategy arrayStrategy = new ArrayListOperationsStrategy();
        ListOperationsStrategy linkedStrategy = new LinkedListOperationsStrategy();

        ListPerformanceTester arrayTester = new ListPerformanceTester(arrayStrategy);
        ListPerformanceTester linkedTester = new ListPerformanceTester(linkedStrategy);

        System.out.println("arraylist: "+arrayTester.testOurAddPerformance(10000000));
        System.out.println("linkedlist: "+linkedTester.testOurAddPerformance(10000000));

        System.out.println("arraylist: "+arrayTester.testOurGetPerformance(1000000,1000));
        System.out.println("linkedlist: "+linkedTester.testOurGetPerformance(1000000,1000));




    }
}
