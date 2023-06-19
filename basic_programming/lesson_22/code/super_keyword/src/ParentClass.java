public class ParentClass {
    int num = 1;

    ParentClass(String param){ // конструктор родительского класса с параметрами
        System.out.println(" I am Constructor of parent class"+param);
    }

    public void printSmth(){
        System.out.println("I am method in Parent class");
    }

}
