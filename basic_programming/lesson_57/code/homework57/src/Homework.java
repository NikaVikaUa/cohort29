import java.util.stream.Stream;

public class Homework {
    public static void main(String[] args) {
        System.out.println(countWords(" aaaaaaaaaa adfr gggg brtz a","a"));

        System.out.println(isDig(""));
    }


    /*
    Задача 1
Используя стримы написать метод, принимающий предложение (строку) и букву и возвращающий количество слов, начинающихся с этой буквы. Слова в предложении разделены пробелами
Пример: " aaaaaaaaaa adfr gggg brtz a" -> 3
     */

    public static long countWords( String input, String w){
        return Stream.of(input.split(" "))
                .filter(s ->s.startsWith(w))
                .count();
    }

    /*
    Задача 2
Используя стримы написать метод, проверяющий является ли строка числом ( строковым представлением числа).
Метод принимает строку и возвращает boolean.
Пример: "1 2 3 4 5" - true
"abc14" - false
     */

    public static boolean isDig( String input){
        return input.chars().allMatch(Character :: isDigit);
    }
}
