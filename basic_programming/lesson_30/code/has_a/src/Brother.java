public class Brother {

    String name;
    int age;

    //Sister sister;

    public Brother(String name,int age) {
        this.name = name;
        this.age  = age;
      //  this.sister = sister;
    }

    @Override
    public String toString() {
        return "Brother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
