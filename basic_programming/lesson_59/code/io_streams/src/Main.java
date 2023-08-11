import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    // потоки ввода-вывода
    /*
    /Понятие потока является ключевым в данном случае. Обьект, из которого
    считываеются данные это поток ввода , а обьект в который записываются данные - поток вывода.
    Все классы, работающие с вводом-выводом делятся на две группы - работающие с байтами и работающие с символами.
    В основе всех классов, работающих с потоками байтов лежат два абстрактных класса  InputStream  и OutputStream,\
    а классов, работающих с символами - Reader и Writer

    Потоки байтов

    Класс InputStream,  основные методы:
    int available() - возвращает количество доступных для чтения в потоке байтов
    void close() - закрывает поток
    int read() - возвращает целочисленное представление следующего  байта в потоке, а когда в потоке не
                остается доступных для чтения байтов - возвращает -1
    int read(byte[] buffer) - считывает байты в массив и возвращает количество считанных байтов. Если ни одного
                                байта не считано, вернет -1

     int read( byte[]buffer, int offset, int length) -считывает байты в количестве равном length  и записывает
                их в массив buffer, начиная с элемента buffer[offset]. Возвращает число прочитанных байтов

    Класс OutputStream

    void close()
    void flush() - очищает буфер вывода , записывая содержимое

    void write(int b) - записывает в  выходной поток один байт
    void write(byte[]buffer ) - записывает в  выходной поток массив  байтов
    void write (byte[]buffer, int offset, int length)

    Чтение и запись файлов- FileInputStream и FileOutputStream

    FileOutputStream - предназначен для записи байтов в файл
    конструкторы:
    FileOutputStream( String filePath)
    FileOutputStream( String filePath,boolean append)
    filePath - путь к файлу и его имя
    append -добавлять информацию после уже имеющейся или перезаписывать файл
     */
    public static void main(String[] args) {

        String string = " Hello Java!";
        try(FileOutputStream fos = new FileOutputStream("text.txt"))
        {
            byte[] buffer = string.getBytes();

            fos.write(buffer,0,buffer.length);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        // чтение файла FileInputStream(String fileName)

       try (FileInputStream fin = new FileInputStream("text.txt"))
       {
        int i;
        while((i = fin.read()) != -1){
            System.out.print((char)i);
        }
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }


       // считать данные в массив байтов

       try (FileInputStream fileInputStream = new FileInputStream("text.txt"))
        {
            byte[]buffer = new byte[512];

            int counter;
            while((counter = fileInputStream.read(buffer)) != -1){
                for( int i = 0; i < counter; i++){
                    System.out.println((char)buffer[i]);
                }
            }
        }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
