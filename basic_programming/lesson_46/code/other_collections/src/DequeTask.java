import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTask {

    /*
    Есть массив, состоящий из трех видов скобок: (), {}, [] .
    Нужно написать метод, определяющий является ли порядок скобок в массиве корректным
     {}([]) - корректный порядок
     {}([]{()})- корректный порядок
     {(] - некорректный порядок
     {}([])} -  некорректный порядок
     {}([])( -  некорректный порядок
     {(})- некорректный порядок

     char[] brackets = {'{', '}'}

     */
    public boolean areBracketsCorrect( char[] brackets){
        Deque<Character> stack = new ArrayDeque<>();
        return false;
    }
}
