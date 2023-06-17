public class Main {
    // Inheritance ( Наследование)
    // Наследование - важное свойство ООП , позволяющее классу использовать методы и
    // переменные другого класса. Таким образом, в классе-наследнике появляется возможность указывать только присущие
    // ему свойства а общие брать из класса , который он наследует.

    // Если мы хотим указать, что класс А  наследует класс В , то мы запишем так:
    // сlass A extends B

    // Общепринятые термины:
   // Parent Class ( Родительский класс) -класс, поля и методы которого могут использоваться классом, наследующим его.
    // Также может называться Super Class  или Base Class (Базовый класс)
    // Child Class  - Дочерний класс, наследующий  и расширяющий свойства родительского класса. Он также называется
    // Sub Class (  подкласс) или класс-наследник
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println("Our Java teacher:");
        System.out.println(javaTeacher.profession);
        System.out.println(javaTeacher.schoolName);
        System.out.println(javaTeacher.mainSubject);

        javaTeacher.teacherWorks();
    }

    // Типы наследования
    // 1.Single inheritance ( одиночное наследование)
    // class B extends A

    //2. Multilevel inheretence ( многоуровневое наследование)
   // class B extends A
    // class C extends B

    /*
    3.Hierarchical inheritance ( иерархическое наследование)
    - когда несколько классов наследуют один и тот же класс

    4. Hybrid Inheritance (гибридное) - комбинация  нескольких типов насдедования


    Класс не может наследовать больше чем одному классу

    Класс наследник  может наследовать только те переменные и методы родительского класса, которые имеют
    модификаторы доступа public  или protected.
     Модификатор  protected  означает что переменная/ метод доступны в том же пакете и подклассах родительского класса


     */


}
