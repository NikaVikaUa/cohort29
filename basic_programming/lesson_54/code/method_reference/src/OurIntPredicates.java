// содержит два статических метода, проверяющих соответствие целого числа какому-то условию
public class OurIntPredicates {

    // проверяет является ли число четным
    public static boolean isEven( int n){
        return (n % 2) == 0;
    }

    public static boolean isPositive( int n ){
        return n > 0;
    }
}
