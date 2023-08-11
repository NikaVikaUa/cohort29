import java.io.ByteArrayInputStream;

public class ReadByteArrayClass
{

    // ByteArrayInputStream  -входной поток, считывающий информацию из массива байтов
    public static void main(String[] args) {
        byte[] array = new byte[]{1,2,3,4,5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);

        int i;
        while((i = byteArrayInputStream.read()) != -1){
            System.out.println(i);
        }
    }
}
