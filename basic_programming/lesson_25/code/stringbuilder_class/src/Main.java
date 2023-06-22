public class Main {

    public static void main(String[] args) {


        // StringBuilder methods:
        // append()
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        String str = "Hello";
        str =str + "World";

        sb.append(" World");
        System.out.println(sb);
        sb.append(" ").append(6).append(" Hurra!");
        System.out.println(sb);


        // insert() - вставляет строку начиная с заданной позиции текущей строки
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.insert(1,"World");
        System.out.println(sb1);

        //replace() - заменяет данную строку с заданного индекса начала до индекса конца

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.replace(1,3,"Java");
        System.out.println(sb2);


        // reverse() - выводит слово в обратной последовательности
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(sb3.reverse());

        System.out.println("Java".substring(1,3));
        System.out.println(ourSubstring("Java",1,3));

    }

    // написать свою собственную реализацию метода  substring , работающую как метод в джава.

    public static String ourSubstring( String string, int begin, int end){
        StringBuilder sb = new StringBuilder();

        for( int i = begin; i<string.length() && i<end; i++){
            sb = sb.append(string.charAt(i));
        }
        return new String(sb);
    }







}
