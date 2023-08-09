import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalStream {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Optional<Integer> min = numbers.stream().min(Integer::compare);

        if( min.isPresent()){
            System.out.println(min.get());
        }
        numbers = Arrays.asList();
         min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElse(-1));


         numbers = Arrays.asList(1,2,3,4);
         min = numbers.stream().min(Integer::compare);

        Random random = new Random();
        System.out.println(min.orElseGet(()->random.nextInt(1,10)));

        // IfPresent

        numbers = Arrays.asList(1,2,3,4);
        min = numbers.stream().min(Integer::compare);
        min.ifPresent(System.out::println);

        numbers = Arrays.asList();
        min = numbers.stream().min(Integer::compare);
        min.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("value is not present")
        );


    }
}
