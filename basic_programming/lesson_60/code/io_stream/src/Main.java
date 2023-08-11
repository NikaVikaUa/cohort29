import java.io.*;

public class Main {

    // классы для работы с массивами байтов

    // ByteArrayInputStream  - использует в качестве источника массив байтов
    // конструкторы
    /*
    ByteArrayInputStream( byte[] buffer
    ByteArrayInputStream( byte[] buffer, int offset, in t length)
     */
    public static void main(String[] args) {
        byte[] array = new byte[]{1,2,3,4};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);

    //    int i;
    //    while((i = byteArrayInputStream.read()) != -1){
    //        System.out.println(i);
   //     }

        // запись массива байт с помощью ByteArrayOutputStream
        // constructors:
        //  ByteArrayOutputStream() - создает массив байтов длиной 32 байта
        //  ByteArrayOutputStream(int size)- создает маччив длиной size

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String word = "Hello Java";
        byte[] buffer = word.getBytes();

        try {
            byteArrayOutputStream.write(buffer);
        }
        catch (IOException e){
            System.out.println("IO exception caught");
        }

        System.out.println(byteArrayOutputStream.toString());


        byte[] arr = byteArrayOutputStream.toByteArray();

        for ( byte b : arr){
            System.out.print((char)b);
        }

        //Буферизированные потоки

        //BufferedInputStream - добавляется специальный буфер в памяти.
       // конструкторы:
        // BufferedInputStream( InputStream iputStream)
        // BufferedInputStream( InputStream iputStream, int bufferSize)

        String word1 = "Hello World";
        byte[] buffer1 = word1.getBytes();

        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(buffer1);

       try(BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream1)) {
           int i1;
           while ((i1 = bufferedInputStream.read()) != -1){
               System.out.print((char)i1);
           }
       }
       catch (Exception e){
           System.out.println( e.getMessage());
       }
        System.out.println();

       //  буфферизованный поток вывода BufferedOutPutStream
        //  BufferedOutPutStream( OutPutStream)
        //  BufferedOutPutStream( OutPutStream, int bufferSize)

        word = "Hello World";
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("out.txt"))){
            byte[] buffer2 = word.getBytes();
            out.write(buffer2);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
