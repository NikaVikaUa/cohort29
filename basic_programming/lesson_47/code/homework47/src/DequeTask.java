import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTask {

    /*
    Есть массив, состоящий из трех видов скобок: (), {}, [] .
    Нужно написать метод, определяющий является ли порядок скобок в массиве корректным
     {}([]) - корректный порядок
     {}([]{()})- корректный порядок
      stack :


     {(] - некорректный порядок
     {}([])} -  некорректный порядок
     {}([])( -  некорректный порядок
     {(})- некорректный порядок

     char[] brackets = {'{', '}'}

     */
    public boolean areBracketsCorrect( char[] brackets){
        Deque<Character> stack = new ArrayDeque<>();

        for( char bracket : brackets){
            if ( bracket == '{' || bracket == '(' || bracket == '['){
                stack.addLast(bracket);
            } else if ( stack.size() > 0){
                char lastOpenBracket = stack.getLast();

                if ( bracket == '}' && lastOpenBracket == '{' ||
                     bracket == ')' && lastOpenBracket == '(' ||
                     bracket == ']' && lastOpenBracket == '[' )
                    stack.removeLast();
                else
                    return false;

            }else {
                return false;
            }

        }

        return stack.size() == 0;
    }
}
