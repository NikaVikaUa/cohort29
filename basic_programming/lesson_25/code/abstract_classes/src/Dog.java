public class Dog extends Animal{

    public void sound(){ // в дочернем классе обязательно должен быть реализован абстрактный метод родительского класса
        System.out.println("Woof");
    }
}
