public class Main1 {

    public static void main(String[] args) {
        Main1 m = new Main1();

        try {
            m.weightCheck(5);
        } catch (InvalidWeightException e){
            System.out.println(e.getMessage());

        }

    }

    public void weightCheck(int weight) throws InvalidWeightException{
        if( weight < 10) {
            throw new InvalidWeightException("The product is not heavy enough");
        }
        }
    }

