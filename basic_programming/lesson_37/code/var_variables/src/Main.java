public class Main {
    public static void main(String[] args) {
        int i;
        i= 1;
        var j = 9; //  как ключевое слово
        //j="str"

        int var =56; // как имя переменной
        var number = -var; // переменной number будет присвоено значение переменной var (56)

        int a = 56;
        number =-a;

        var myArray = new int[10]; // можно использовать var для обьявления массива. Квадратные скобки с левой стороны
                                    // при эт ом не ставятся
        int[] arr = new int[10];

        // var можно использовать для обьявления только локальных переменных, а не полей класса . Его также
        // нельзя использовать с return.

        var myString = "This is a string";
        var mySubString = myString.substring(1,3);

        var myClass = new OurVarClassExample(5);
        myClass.setI(78);
        System.out.println(myClass.getI());

      //  FileOutputStream

        for( var k = 0; k<100;k++); //  можно использовать в циклах
        for (var v:myArray);
      //  var n = null;   так нельзя
      //  var arr1 = {1,2,3}; так тоже нельзя



    }
}
