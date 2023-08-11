import java.io.*;

public class BufferedReadingWriting {

    // BufferedWriter - записывает текст в поток, перед этим помещая в буфер записываемые
    /*
    символы
    Конструкторы:
    BufferedWriter( Writer out)
    BufferedWriter( Writer out, int size)

     */
    public static void main(String[] args) {

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedText.txt")))
        {
            bufferedWriter.write("Hello Java\nHello Java");
        }
        catch (IOException e){
            System.out.println("IOException");
        }

        // чтение текста BufferedReader
        // BufferedReader(Reader in)
        // BufferedReader(Reader in, int size)
        // метод readLine() -  позволяет считывать из потока построчно

        // посимвольно
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedText.txt"))) {
            int ch;
            while ((ch = bufferedReader.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch (IOException e){

        }


        System.out.println("\nwith readLine()");
        // readLine()
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedText.txt"))) {
            // чтение построчно
            String str;
            while ((str = bufferedReader.readLine()) != null){

                System.out.println(str);
            }
        }
        catch (IOException e){

        }

        //  чтение в файл с консоли
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("inputConsole.txt")))
        {
           String input;
           while(!(input = br.readLine()).equalsIgnoreCase("stop")){
               bw.write(input +"\n");
               bw.flush();

           }

        }
        catch (IOException e){
            System.out.println("IO Exception");
        }

        File name = new File("first.txt");
        System.out.println(name.exists());


    }
}
