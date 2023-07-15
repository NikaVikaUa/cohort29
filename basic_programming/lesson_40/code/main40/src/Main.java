import java.util.Arrays;

public class Main {

    //Метод arraycopy()
    public static void main(String[] args) {
     //   System.arraycopy() - метод копирует массив начиная с заданного индекса в другой массив начиная с заданного
     // индекса

     /*
     arraycopy( src, int srcIndex, dest, int destIndex, int length)
     src - массив откуда копируется
     srcIndex - индекс, начиная с которого копируется массив
     dest - массив, куда копируется
     destIndex - индекс в массиве dest , начиная с которого копируется
     length -  количество элементов, которые нужно скопировать


      */                           //         2
     String[] src = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
     String[] dest = {"John","Bill","Ann","Mary","Jack"};

     int srcIndex = 2;
   //  int destIndex = 3;
   //  int length = 2;

     System.arraycopy(src,srcIndex,dest,1,2);

        System.out.println(Arrays.toString(dest));
    //[John, Bill, Ann, Wednesday, Thursday]

    }
}
