public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Bill";
        student1.age = 32;

        Student student2 = new Student();
        student2.name = "Ann";
        student2.age = 18;

        System.out.println("Student's 1 name and age are: "+ student1.name +" "+student1.age);
        System.out.println("Student's 2 name and age are: "+ student2.name +" "+student2.age);
    }
}
