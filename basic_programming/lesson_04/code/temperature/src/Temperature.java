import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        //  написать программу , конвертирующую температуру по Фаренгейту в градусы
       // Цельсия. Формула для перевода Цельсий = 5*(Фаренгейт - 32)/9
        //Значение градусов фаренгейта ввести с клавиатуры.
        // Вывести результат на экран
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        double farenheit = scanner.nextDouble();

        double celsius = 5*(farenheit - 32.0)/9.0;

        System.out.println(farenheit +" degree Fahrenheit is equal to "+celsius+" in Celsius");




    }


}
