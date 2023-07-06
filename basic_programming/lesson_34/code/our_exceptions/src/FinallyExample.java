public class FinallyExample {
    public static void main(String[] args) {
        myMethod();
    }


    public static int myMethod(){
        try{
            return 1;
        }
        finally {
            System.out.println("Finally runs even after return statement" );

        }
    }
}
