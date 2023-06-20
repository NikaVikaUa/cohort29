import java.util.Arrays;

public class ArgsArray {
    public static void main(String[] args) { // через массив args   в программу передаются извне  аргументы
     //   System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        // записать элементы в массив args:
        /*
         меню Run -> Edit Configurations -> Application в поле Program Arguments  указать аргументы через пробел
         */

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        String operation = args[2];

        System.out.println(calculator(x,y,operation));

    }
    public static double calculator(double x, double y, String operation){
        switch (operation){
            case "sum":
                return x+y;

            case "sub":
                return x-y;

            case "div":
                return x/y;

            case "mul":
                return x*y;

            default:
                return Double.NaN;
        }

    }
}
