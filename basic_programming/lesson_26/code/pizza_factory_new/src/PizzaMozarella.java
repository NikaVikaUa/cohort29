public class PizzaMozarella extends Pizza{

    private static String type = "Pizza Mozarella";

    public PizzaMozarella(){
        super(type);
    }

    public void prepare(){
        System.out.println("Preparing pizza with mozarella cheese");
    }
}
