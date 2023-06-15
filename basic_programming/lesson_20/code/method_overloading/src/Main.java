public class Main {
    // Перегрузка методов (Method overloading)
    /*
    -свойство, позволяющее классу иметь различные методы с одинаковым именем, но с разным
    количеством/последовательностью/типом параметров.
    add ( int a, int b)
    add ( int a, int b, int c)

     */
    public static void main(String[] args) {
        Main m = new Main(); //  создаем обьект класса Main
        // 1.методы с разным количеством аргументов
        System.out.println(m.add(1,3));
        System.out.println(m.add(1,2,3));
        //2. методы с разным типом аргументов
        System.out.println(m.add(2.6f,3.5f)); // число с точкой по умолчанию воспринимается в джаве как  тип
                                                    // double. Поэтому принадлежность к типу float надо указывать явно
                                                    // с помощью буквы f
        System.out.println(m.add(10.5,5.5));

        // последовательность типов параметров разная
        System.out.println(m.add(5,"6"));
        System.out.println(m.add("Java",1));


        float var = 3.4f;
    }
 public   int  add(int a, int b){
     int sum = a+b;
     return sum;
 }

 public int add(int a, int b, int c){
     return a+b+c;
 }

 public float add( float a,float b){
        return a+b;
 }

 public double add ( double a, double b){
     System.out.println("I am double");
        return a+b;
 }

 public String add ( int a, String b){
    // System.out.println(1 +"2");
        return a+b;
 }

 public String add ( String b, int a){
        return b+a;
 }

}

