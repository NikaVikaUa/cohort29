import java.util.Optional;

public class OurOptional {
    public static void main(String[] args) {

        // ifPresent()

        String name = "John";

        if( name != null){
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("John");
        optional.ifPresent(n -> System.out.println(n.length()));


        //Default value with  orElse() - возвращает значение из Optional,  а если его
        // нет, то значение по умолчанию, заданное заранее

        String nullValue = null;
        nullValue = "Ann";

        String str = Optional.ofNullable(nullValue).orElse("Bill");
        System.out.println(str);

        // Значение по умолчанию с orElseGet()
        nullValue = null;
        str = Optional.ofNullable(nullValue).orElseGet(()->"Bill");
        System.out.println(str);


      //  str = Optional.ofNullable(nullValue).orElseThrow(IllegalArgumentException::new);
      //  str = Optional.ofNullable(nullValue).orElseThrow();
        System.out.println(str);

        // get()
        Optional<String>optional1 = Optional.of("Java");
        String java = optional1.get();
        System.out.println(java);
    }
}
