import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClass {

    public static void main(String[] args) {
        System.out.println();

        // PrintStream - форматируемый ввод и вывод
        // PrintStream(OutPutStream outputStream)
        // PrintStream (String file)

        String str = " Hello!";

        try(FileOutputStream fos = new FileOutputStream("out.txt");
            PrintStream printStream = new PrintStream(fos))  {
            printStream.println(str);
        }
        catch (IOException e){e.getMessage();}
    }
}
