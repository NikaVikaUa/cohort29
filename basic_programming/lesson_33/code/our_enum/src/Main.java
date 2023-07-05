public class Main {
    // Enum ( от слова Enumeration - перечисление)
    /*
    В самой простой форме Enum  это список поименованных констант, который определяет свой тип данных
    Обьект типа Enum  может содержать значения только из списка , определенного в Enum.
     */
    public static void main(String[] args) {
        // переменная типа enum  может принять только одно из значений перечисленных в данном энуме

        Directions dir = Directions.EAST;
        System.out.println(dir);

        Transport tr =Transport.TRUCK;
        if(tr == Transport.TRAIN)
            System.out.println("Train");
        else System.out.println("tr is not Train");
        tr=Transport.BOAT;
        // использование энума в switch
        switch (tr){
            case CAR:
                System.out.println("A car can drive");
                break;
            case TRUCK:
                System.out.println("A track can carry freight");
                break;
            case PLANE:
                System.out.println("a plane can fly");
                break;
            case TRAIN:
                System.out.println("A train is long");
                break;
            case BOAT:
                System.out.println("a boat can sail");
                break;
        }

        //  методы Enum
        /*
        values() - возвращает массив, содержащий список констант энума
        valueOf() - возвращает константу энума, чье значение соответствует строке переданной в качестве параметра
         */


        //  вывод на экран списка констант, полученного с помощью метода values()
     //   Transport[] allTransport = Transport.values();
     //   for(Transport t: allTransport)
     //       System.out.println(t);

        for (Transport t:Transport.values())
            System.out.println(t);


        // использование valueOf()
        Transport tp;
        tp = Transport.valueOf("PLANE"); //  получаем константу с именем PLANE
        System.out.println("Constanta PLANE "+tp);






    }
}
