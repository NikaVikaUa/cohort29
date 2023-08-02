import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Foo foo = new Foo() {
            @Override
            public Integer toInt(String s) {
                return null;
            }

            @Override
            public Integer toInt1(String s) {
                return null;
            }
        };

      //  Foo foo1 = f -> f.length();

      //  (argument-list)-> {body}

        //

        int height = 1000;
    //    ()->{body} -  без параметров
        Flyable fly = ()->{
            System.out.println("Flying at "+height);
        };
        fly.fly();


    //    (p)->{body} -  один параметр
        Walkable walk = (name)-> {
            return "Hello, "+name;
        };

        System.out.println(walk.walk("John"));
    //    (p1,p2)->{body} - 2  параметра

        Arithmetical ar1 = ( a, b)->(a+b);
        System.out.println(ar1.add(1,2));

        ar1 = (a,b)-> a-b;
        System.out.println(ar1.add(1,2));

        List<String> list = new ArrayList<>();
        list.add("Winter");
        list.add("Spring");
        list.add("Summer");
        list.add("Autumn");

        list.forEach(
                (n) -> System.out.println(n)
        );

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Dell Laptop",50000));
        products.add(new Product(2,"Mouse",50));
        products.add(new Product(3,"HP Keybord",200));

        System.out.println("Sorting by name");

        products.sort((p1, p2) -> p1.name.compareTo(p2.name));

        for(Product product: products)
        System.out.println(product.name);






    }

}
