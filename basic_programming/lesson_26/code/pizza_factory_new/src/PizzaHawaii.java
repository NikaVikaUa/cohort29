public class PizzaHawaii extends Pizza{

    private  static String type = "Pizza Hawaii";

    public PizzaHawaii(){
        super(type);
       // super("Pizza Hawaii");
    }

    public void prepare(){
        System.out.println("Preparing pizza with ananas and cheese");
    }
}
