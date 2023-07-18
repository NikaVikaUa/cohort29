import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        Homework homework = new Homework();
        homework.reversed(ints);
        System.out.println(ints);
    }

    /*
   1. Есть два класса: Address  с полями street and houseNumber  и второй класс
    Person  с полями  name and Address.
    Нужно написать метод, который по списку persons  возвращает список их адресов
    1. создать эти два класса с полями, конструкторами, геттерами  и методом toString.
    2. Сигнатура  метода :  public List<Address> getAddresses (List<Person> persons)
    3. Создать лист, в который будут записываться адреса.
    4. С помощью цикла for each  пройти по листу персонов и для каждого персона получить адрес и записать его в
        лист адресов
    5. Вернуть этот лист адресов после окончания цикла for each
    6. Протестировать


    2.Есть лист целых чисел. Написать метод, который этот лист реверсирует,
    т.е. возвращает лист элементов в обратном порядке
    [1,2,3,4,5] -> [5,4,3,2,1]. Можно использовать методы класса Collections




     */
    public List<Integer> reversed ( List<Integer>list){
        Collections.reverse(list);
        return list;
    }
}
