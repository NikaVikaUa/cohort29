public class Main {
    public static void main(String[] args) {


        Brother brother = new Brother("John", 29);
        Brother brother1 = new Brother("Michael", 29);
        Brother brother2 = new Brother("Benn", 29);
        Brother[] brothers ={brother,brother1,brother2};

        Sister sister = new Sister("Mary", 23, brother,brothers);

        System.out.println(sister);
    }

}
