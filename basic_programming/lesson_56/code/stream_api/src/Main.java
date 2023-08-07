import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //Stream API
    /*
     Ключевым в Stream API  является пониятие  потока данных. Поток в данном случае представляет
     собой "канал" передачи данных из источника, которым могут являться коллекции, массивы, файлы, стринги
     */
    public static void main(String[] args) {
        int[] ints = {-3,-2,8,-7,2,9};

        int counter = 0;

        for ( int i: ints){
            if(i > 0)
                counter++;
        }
        System.out.println(counter);


    long count = IntStream.of(-3,-2,8,-7,2,9).filter(i->i>0).count();
        System.out.println(count);

        //  В основе Stream API  находится интерфейс BaseStream, определяющий базовые функции для работы с потоками
         /* От него наследуются следующие интерфейсы :
                Stream<T> - для работы с потоками данных ссылочного типа
                IntStream -  для потоков данных типа int
                DoubleStream -  типа double
                LongStream -  типа long

         */

        // Способы создания стримов
        //  пустой стрим
       Stream<String> streamEmpty = Stream.empty();

       // стрим коллекции
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> listStream =list.stream();

      //  стрим массива
      String[]  arr = {"a","b","c"} ;
      Stream<String> straemArr =Arrays.stream(arr);

      // стрим строк
       IntStream streamChars = "abc".chars();


       // При работе со стримами все операции бывают  либо промежуточными ( intermediate) либо терминальными(terminal)
        /*
        Промежуточные опреации возвращают измененный поток данных. Промежуточных операций  может быть в цепочке несколько
        . Терминальная опреация может быть только одна и после нее уже нельзы применить другие промежуточные опреации.

        Отличия потоков от коллекций :

        1. Потоки не хранят элементы
        2. Операции с потоками не меняют источник данных
        3. Выполнение всех опреаций с потоком происходит только когда выполняется терминальная  операция ( отложенное
            выполнение)

            Операции над потоками :

            Перебор элементов . Метод forEach() - терминальная операция, осуществляющая действие для каждого элемента
            потока

         */
       Stream<String> namesStream = Stream.of("John","Bill","Jack","Ann");
       namesStream.forEach(System.out::println);
     //  namesStream.forEach(System.out::println);
        Stream.of("John","Bill","Jack","Ann").forEach(System.out::println);

        // фильтрация. Метод filter() -  промежуточная опреация. Принимает условие ( предикату) и возвращает поток
        // из элементов, лтвечающих этому условию.

        System.out.println("filtered");

        Stream.of("John","Bill","Jack","Ann").filter(s->s.length() == 4)
                                                    .forEach(System.out::println);

        Car car1 = new Car("mercedes",100000);
        Car car2 = new Car("volvo",70000);
        Car car3 = new Car("Opel",30000);
        Car car4 = new Car("bmw",150000);
        Car car5 = new Car("acura",150000);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.stream().filter(car -> car.getPrice() > 80000)
                .forEach(car-> System.out.println(car.getBrand()));


        System.out.println("print car brands");
        // метод map() - функция преобразования одного обьекта в другой.
        cars.stream()
                .map(Car::getBrand) //  названия машин
                .forEach(System.out::println);


        cars.stream()
                .map(car -> "brand: "+car.getBrand() +" price: "+car.getPrice())
                .forEach(System.out::println);


        System.out.println("Sorted");
        //  sort -  сортировка данных
         List<String> names = new ArrayList<>();
        Collections.addAll(names,"John","Jack","Benjamin","ann","Evgeny");
        names.stream().filter(s->s.length()<7)
                .sorted()
                .forEach(System.out::println);

        System.out.println("With comparator");

        cars.stream()
                .sorted(new CarComparator())
                .forEach(car -> System.out.println(car.getBrand()));

        // метод distinct() - возвращает только уникальгые элементы
        names.add("John");
        names.add("ann");
        System.out.println(names);

        names.stream()
                .distinct()
                .forEach(System.out::println);


        // Терминальные операции
        //  метод count() -  возвращает количество элементов в потоке

        System.out.println(names.stream().filter(n -> n.length()<=5).count());
        System.out.println(names.stream().count());

        // findFirst - находит 1 элемент потока
        // и FindAny - находит случайный элемент потока

       Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());//John

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());

        // allMatch, anyMatch, noneMatch.  Принимают предикату и возвращают булеан.

        // allMatch - true, если все элементы потока удовлетворяют условию в предикате
        // anyMatch - true, если хотя бы один элемент потока удовлетворяет условию в предикате
        // noneMatch -возвращает true, если ни один элемент потока не удовлетворяет условию в предикате

        boolean anyMatch = names.stream().anyMatch(s -> s.length() == 4);
        boolean allMatch = names.stream().allMatch(s -> s.length() > 2);
        boolean noneMatch = names.stream().noneMatch(s -> s == "Kirill");
        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }








}
