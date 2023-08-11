import java.io.FileInputStream;
import java.io.IOException;

public class CloseWithFinally {

    public static void main(String[] args) {


    //    FileInputStream fileInputStream = null;

        // try with resources
        try(FileInputStream fileInputStream = new FileInputStream("text.txt");) {

          //  fileInputStream = new FileInputStream("text.txt");

            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
      //  finally {

      //      try {
     //           if (fileInputStream != null)
     //               fileInputStream.close();
     //       }
     //       catch (IOException e){
     //           System.out.println(e.getStackTrace());
     //       }
     //   }
    }
}
