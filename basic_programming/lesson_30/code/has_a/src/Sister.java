public class Sister {

    String name;
    int age;

    Brother brother; // ссылка на обьект одного класса может являться полем другого класса. Тако тип отношений
    // называется has a

    Brother[] brothers;

    public Sister(String name, int age, Brother brother,Brother[] brothers) {
        this.name = name;
        this.age = age;
        this.brother = brother;
        this.brothers = brothers;
    }

    @Override
    public String toString() {
        return "Sister{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brother=" + brother +
                '}';
    }
}
