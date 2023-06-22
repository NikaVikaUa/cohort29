public class StringBulderTestString {
    // сравним на практике скорость работы класса String  и класса StringBuilder

    public static void main(String[] args) {
       long startTime = System.currentTimeMillis(); // показывает текущее время в милисекундах
        concatWithString();
        System.out.println("Time required for string method:"+(System.currentTimeMillis()-startTime)+"ms");

        startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Time required for StringBuilder method:"+(System.currentTimeMillis()-startTime)+"ms");





    }
    public static String concatWithString(){ // в цикле соединяет строку 10000 раз
        String str = "Hello";

        for (int i=0;i<10000;i++){
            str = str + "World";
        }
        return str;
    }

    public static String concatWithStringBuilder(){ // в цикле соединяет строку 10000 раз c помощью стрингбилдера
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0;i<10000;i++){
            sb.append("World");
        }
        return sb.toString();
    }



}
