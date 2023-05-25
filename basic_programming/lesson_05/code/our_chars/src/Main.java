public class Main {
    //Chars
    // системы кодировки
    // ASCII - система кодирования, созданная в 1963 г
    /*
    В Джава  для хранения символа используется 2 бита или 16 байт памяти
    и таким образом можно закодировать символы в диапазоне от 0 до 65535

        */
    public static void main(String[] args) {


        char x;
        x = 'r';
      //  System.out.println("This is char: "+ x);
      //  System.out.println("This is char:"+ 'x');
        char ch ='X';
        System.out.println("This is char: "+ ch);
        ch++;
        System.out.println("This is now char "+ch);
        ch = 90;
        System.out.println("This is now char "+ch);

        char unicode ='\u00A7';
        System.out.println(unicode);

        char quote = '\'';
        System.out.println(quote);

        String str = "\"";
        char slash = '\\';
        char newLine = '\n';

        System.out.print("Hello\nWorld\n");
        System.out.print("Again");

        char cha = 'a';
        int a = 100;
        long l = 12L;
        int big = 123_450_670;





    }
}
