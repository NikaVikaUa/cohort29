public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.colour ="Red";
        mercedes.make = "S600";
        mercedes.year = 2020;
        mercedes.drive();


      int a = 19;


   //   str = "Java";

        String cat = "Mary";
        System.out.println("cat= "+cat);
        String cat1 = new String("Mary");
        System.out.println("cat1= "+cat1);
        // ==
        //System.out.println(2==1);
        System.out.println("cat = cat1? "+(cat == cat1));
        String cat2 = "Mary";
        System.out.println("cat = cat2 ? "+(cat == cat2));

        // length()
         //0 1 2 3
        // M a r y  length=4
        System.out.println("What is cat's length?");
        System.out.println(cat.length());
        System.out.println("Ma ry".length());

        String h = "Hello";
        String w = "World";
        System.out.println(h.concat(" ").concat(w));


        String j = "Piton";
        // charAt(int index)
        //0 1 2 3
        //J a v a

        char ch1 = j.charAt(0);//J
        char ch2 = j.charAt(1);//a
        char ch3 = j.charAt(2);//v
        char ch4 = j.charAt(3);//a

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        "Java".charAt(0);




    }
}
