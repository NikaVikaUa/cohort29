public class Calculator {

    public static void main(String[] args) {
        Calculator calculator;
        calculator = new Calculator();
        System.out.println(calculator.multiply(2,2));
        System.out.println(calculator.multiply(0,2));
    }

    public int multiply( int a, int b){

        return a*b;
    }
}
