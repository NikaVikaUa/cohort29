public class Main {

    int a;
    static  int b;
    // Ссылки на метод ( method reference)
    /*
    Cсылка на метод - предоставляет  способ сослаться на метод не выполняя его сразу
    Понятие ссылки на метод связано с понятием лямбда- выражения, т.к. она также требует
    наличия совместимого функционального интерфейса и в результате  также создает обьект такого
    интерфейса
    Есть несколько типов ссылок на метод:
    1. ссылки на статические методы. Method references to static methods
    ClassName :: methodName -( имя класса :: имя метода)

     */

    //  метод принимает функциональный интерфейс в качестве первого параметра, т.е. в него
   // можно передатьммылку на  обьект этого интерфейса, включая ссылку созданную как метод
   // референс
    public static boolean testMethod(IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String[] args) {


       boolean result;

       //  в метод testMethod  передается ссылка на метод  isEven
      result = testMethod(OurIntPredicates ::isEven,16);
      if(result)
          System.out.println("16 is even");

        //  в метод testMethod  передается ссылка на метод  isPositive
      testMethod(OurIntPredicates :: isPositive,1);
        if(result)
            System.out.println("1 is positive");


        //2. Method reference to Instance Methods
        /*
        objectRef :: methodName
         */

        OurIntNumber ourIntNumber = new  OurIntNumber(10);
        OurIntNumber ourIntNumber1 = new OurIntNumber(12);

        // создается ссылка на метод isFactor
        IntPredicate intPredicate = ourIntNumber::isFactor;

        result = intPredicate.test(2);
        if(result)
            System.out.println("2 is factor of "+ourIntNumber.getX());

        intPredicate = ourIntNumber1 ::isFactor;
        result = intPredicate.test(3);
        if(result)
            System.out.println("3 is factor of "+ourIntNumber1.getX());

        // 3. ClassName :: instanceMethodName - когда обычный метод может быть использован
        // с любым обьектом данного класса

        OurIntNumber ourIntNumber2 = new OurIntNumber(12);
        IntPredicateTwoParams intPrTwoParams = OurIntNumber::isFactor;
        result = intPrTwoParams.test(ourIntNumber2,3);
        System.out.println(result);


        // ссылки на конструктор ( Constructor references)
        // classname :: new
        //  Такая ссылка может быть использована с  любым функциональным интерфейсом у которого есть
        //  метод, совместимый с конструктором

        //  ссылка на конструктор
        OurFunc ourClassConstructor = OurClass ::new;

        // создаем обьект класса OurClass  с помощью ссылки на конструктор
       OurClass newObject =  ourClassConstructor.func("Test");

        System.out.println(newObject.getStr());

        OurFunc2 ourClassConstructor2 = OurClass::new;
        ourClassConstructor2.func();



    }
}
