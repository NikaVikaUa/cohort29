import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        OurIterableString str = new OurIterableString("Hello");

    //    for(char ch: str){
    //        System.out.print(ch+" ");
    //    }

        System.out.println("\nPrint with our iterator");

        Iterator<Character> ourIterator = str.iterator();

        while( ourIterator.hasNext()){
            char ch = ourIterator.next();
            System.out.println(ch);
        }
    }

}
