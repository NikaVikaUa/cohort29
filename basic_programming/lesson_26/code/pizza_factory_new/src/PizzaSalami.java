public class PizzaSalami extends Pizza{

    private static String type = "Pizza Salami";

    public PizzaSalami(){
        super(type);
    }

    public void prepare(){
        System.out.println("Preparing pizza with salami, cheese, tomatoes");
    }
}
