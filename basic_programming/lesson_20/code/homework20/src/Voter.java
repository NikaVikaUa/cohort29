/*
Задача1
Создать класс Voter (Избиратель) , содержащий поля имя, адрес, возраст а
также конструктор, геттеры и сеттеры. При создании должно быть учтено, что
минимальный возраст в Германии для участия в выборах - 16 лет.
 Создать несколько обьектов класса и вывести их на печать
 */
public class Voter {

    private String name;
    private String address;
    private int age;


    public Voter(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public void setName( String name){
        this.name = name;
    }

    public void setAddress( String address ){
        this.address = address;
    }

    public void setAge(int age){
        if( age >= 16){
            this.age = age;
        } else {
            System.out.println("too young to vote");
        }
    }


}


