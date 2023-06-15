public class Main {

    public static void main(String[] args) {
        System.out.println("Counter before objects are created is "+Person.counter);
        Person person1 = new Person("Bill",23);
        Person person2 = new Person("Jack",45);
        Person person3 = new Person("Mary",15);
        System.out.println("Counter after objects are created is "+Person.counter);

        person1.canTalk();
        Person.sum(); // статические методы также не зависят от обьекта и вызываеются с помощью имени класса
       // Math.


      //  person1.

        //Вызвать статическую переменную можно используя имя класса:
        // Person.counter
    }

}
