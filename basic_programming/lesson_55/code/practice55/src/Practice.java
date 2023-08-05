import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        String input =  "AAA BBBB dEF CDkLw bBb";
        Predicate<String>predicate = s -> s.length() == 3;
        Function<String,String>function = String::toLowerCase;

        System.out.println(practice.transform(input,predicate,function));
    }

    /*
    Написать метод, принимающий строку, содержащую слова разделенные пробелом и два функциональных интерфейса
    - function and predicate. Метод должен предоставлять возможность реализации следующих действий:
    "AAA bbbb dEF cDkLw bBb"
при длине слова= 3, изменить все буквы этого слова на строчные (маленькие) и вернуть измененную строку
при длине слова= 4, изменить все буквы слова на заглавные и вернуть измененную строку
при длине слова= 5, изменить все буквы слова на звездочки и вернуть измененную строку
(т.е. написать лямбду для каждого случая)
     */

    public String transform(String input, Predicate<String> predicate, Function<String, String> function) {
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (predicate.test(words[i])) {
                words[i] = function.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}



