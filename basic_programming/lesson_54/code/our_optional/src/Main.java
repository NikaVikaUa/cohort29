import java.util.Optional;

public class Main {

    //  класс Optional
    /*

     */
    public static void main(String[] args) {


        Optional<String> empty = Optional.empty(); // создание пустого обьекта Optional
        String name = "John";
       // name = null;

        Optional<String> opt = Optional.of(name);// создание Optional   с перменной name


        name = null;

        Optional<String> optNullable = Optional.ofNullable(name); // может принять null  и возвращает
                                                                        // пустой Optional

        System.out.println("Optional of null is "+optNullable);

        //  проверка наличия значения в Optional  осуществляется с помощью методов isPresent() и isEmpty()

        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());


    }
}
