public class Main {

    public static void main(String[] args) {

        System.out.println(countArea(2.5));

        System.out.println(convertToCelsius(451));

        printDigitsOfNumber(365);



    }

    public static double countArea( double radius){
        double area = Math.PI *radius*radius;

        return area;
    }

//С = 5*(F-32)/9
    public static double convertToCelsius (double farenheit){
        double celsius = 5*(farenheit - 32.0)/9.0;

        return celsius;
    }

    // Дано трехзначное число (365)
    // Вывести на экран цифры этого числа
    // Результат:  first digit is 3, second digit is 6, third digit is 5
    // 365 = 3*100 +6*10 + 5*1
    //ones =n%10 = 5
    //tens = 365/10 =36%10=6
    //hundreds = 365/100 = 3
    public static void printDigitsOfNumber(int number){
        int ones,tens,hundreds;
        ones = number%10;
        tens = number/10%10;
        hundreds = number/100;

        System.out.println("first digit is "+ hundreds+" , second digit is "+ tens+" , third digit is "+ones);

    }









}
