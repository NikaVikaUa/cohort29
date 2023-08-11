import java.io.FileInputStream;
import java.io.IOException;

public class Homework {

    /*
    Написать программу, сравнивающую два файла.
Программа должна считывать файлы и затем сравнивать их содержимое( байты).
Если найдено отличие, значит файлы не равны и программа выводит на экран соответствующее сообщение.
Если конец обоих файлов достигается одновременно и отличий не найдено, значит файлы одинаковые и
программа также выводит на экран соответствующее сообщение.
Предварительно файлы должны быть созданы в корневой директории проекта в виде first.txt , second.txt
     */
    public static void main(String[] args) {
        compareFiles("first.txt","second.txt");
    }

    public static void compareFiles( String file1, String file2){
        int i = 0,j = 0;
        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2))
        {
            do {
                i = f1.read();
                j = f2.read();
                if ( i != j) break;
            }while( i != -1 && j != -1);

            if( i != j)
                System.out.println("Files differ");
            else
                System.out.println("Files are equal");

        } catch (IOException e){
        System.out.println("I/0 Error:"+e );
        }
    }
}
