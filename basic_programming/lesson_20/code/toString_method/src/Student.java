public class Student {
 private    int number;
 private    String name;
 private    String city;

    Student( int number, String name, String city){
        this.number = number;
        this.name = name;
        this.city = city;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    // переопределяем метод toString для нашего класса Student
    public String toString(){
        return number+ " "+name+ " "+city;
    }



}
