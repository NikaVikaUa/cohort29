public class Main {
    /*
     так называемое лямбда выражение ( lambda expression )  используется для реализации
     интерфейса без создания класса и метода. С помощью  лямбда выражения можно реализовать  интерфейс,
     содержащий только один абстрактный метод. Такие интерфейсы называеются функциональными

     лямбда выражение в общем виде выглядит так:
     (argument-list) -> {body}
     (p)->{}
     (p1,p2)->{}
     */
    public static void main(String[] args) {
        Drawable d = new Drawing();
    //    d.draw();

        String picture = "Picture";

        // с лямбда выражением
        Drawable d2 = () ->{
            System.out.println("I can draw a "+picture);
        };
        d2.draw();

        d2 = ()->{
            System.out.println("I cannot draw animals");
        };
        d2.draw();

        //  с одним параметром
        Greetable g1 = (name )->{
            return "Hello, "+name;
        };

        System.out.println(g1.sayHello("John"));

        // c несколькими параметрами
        Addable addable = (a,b)->{ return a+b;};
        System.out.println(addable.add(10,20));

        // когда лямбда выражение состоит из одной команды в правой части, использовать
        // фигурные скобки и слово return  не обязательно
        Addable addable1 = (a,b)->(a-b);
        System.out.println(addable1.add(30,20));



    }
}
