public class Cat {
     /*
    Задача 1
Создать класс Cat содержащий следующие поля: name, age, colour,
а также конструктор, геттеры и сеттеры для всех полей и метод toString.
В том же классе создать метод main и вывести на печать несколько обьектов класса Cat.
     */

    private String name;
    private  int age;
    private String colour;

    public Cat( String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }

    public int getAge(){
        return age;
    }

    public void setName( String name){
        this.name = name;
    }

    public void setColour( String colour){
        this.colour = colour;
    }

    public void setAge( int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
