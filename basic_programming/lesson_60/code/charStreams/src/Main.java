import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // Reader and Writer -  абстрактные родительские классы для
    /*
    классов, работающих с потоками символов

    Reader -  чтение текстовой информации
    основные методы:
    void close()
    int read()
    int read( char[] buffer)
    int read( char[]buffer, int offset, int length)

    Writer - запись текстовой информации
     append() - добавляет символ в конец потока
     close()
     flush() - очищает буфер
     write(int c)
     write ( char[]buffer)
     write( char[]buffer, int offset, int length)

      Класс FileWriter - запись текстовых файлов
      constructors:
      FileWriter( String filename)
      FileWriter( File filename)
      FileWriter( String filename,boolean append)
      FileWriter( File filename, boolean append)

     */
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("inText.txt")){
            writer.write("Hello!");
            writer.append('!');

            writer.flush();

        }
        catch (IOException e){
            System.out.println("IO Error caught");
        }

        // FileReader - для чтения текстовых файлов
         // конструкторы:
        // FileReader( String fileName)
        // FileReader( File fileName)

      try  (FileReader reader = new FileReader("inText.txt"))
      {
          int ch;
          while((ch=reader.read()) != -1){

              System.out.print((char)ch);
          }

      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }
    }
}
