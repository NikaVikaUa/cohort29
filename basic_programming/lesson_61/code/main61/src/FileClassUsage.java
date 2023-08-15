import java.io.File;
import java.io.IOException;

public class FileClassUsage {

    // класс File -  управляет информацией о файлах. Класс Файл  работает как с
    // файлами так  и с каталогами
    // котнструкторы :
    /*
    File( String путь к каталогу)
    File (File directory, String file name)
    File dir1 = new File( "C://dirName)

    основные методы класса File:

    boolean createNewFile() -  создает новый файл в соответствии с переданным
     в конструктор путем к нему

    boolean delete() - удаляет каталог или файл
    boolean exists() -  проверяет существует ли файл
    String getAbsolutePath()  - возвращает абсолютный путь к файлу
    String getName()  -возвращает имя файла или каталога
    boolean isDirectory() - true if dir
    boolean isFile() - true if file
    long length() - размер в байтах
    String[] list() -  возвращает массив файлов и подкаталогов, находящихся в определенном каталоге
    File[] listFiles() - возвращает массив файлов и подкаталогов, находящихся в определенном каталоге
     */
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        System.out.println("File name: " + file.getName());
        System.out.println("does file exist? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.createNewFile());
        System.out.println("does file exist? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.delete());
        System.out.println("does file exist? " + file.exists());

        File dirC = new File("C://");
        // dirC.listFiles(new );


    }


}
