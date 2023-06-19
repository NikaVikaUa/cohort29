public class SubClass extends ParentClass{
    int num = 5;


    public SubClass(String param){
        super(param); //  конструктор родительского класса вызывается в явном виде с помощью слова super и выpjd
                        // ижет первой строкой в конструкторе дочернего.
        System.out.println("I am arg Constructor of child class: ");

    }

    public void printNumber(){
        System.out.println(super.num);
    }

    public void printSmth(){
        System.out.println("I am method in child class");
    }

    public void displayParentMethod(){
        super.printSmth();
    }
}
