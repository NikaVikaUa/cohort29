import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    // Date and Time in Java
    //  Начиная с Java 8  появились новые классы для работы с временем и датой
    /*
    Существовавшие до этого классы имели ряд недостатков:
    1. Не были потокобезопасными
    2. Плохой дизайн и работа методов
    3. Не учитывались временные зоны.

    Новые классы для работы с датой и временем :
    1.LocalDate
    2.LocalTime
    3.LocalDateTime
    4.ZonedDateTime
    5.Period
    6.Duration

    Классы 1-3 импользуются наиболее часто, представляют местное время и в основном когда указывать временные зоны
    в явном виде не нужно

    Класс LocalTime - представляет время без учета зональности с точностью до наносекунд
     */

    public static void main(String[] args) {


        LocalTime currentTime = LocalTime.now(); //  now() -  возвращает текущее время
        System.out.println("Time now is "+currentTime);

        // создание обьекта LocalTime  с помощью метода of()
        LocalTime localTime = LocalTime.of(20,18,34);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(20,21,34,1234);

        // получить часы
        System.out.println("Hour:"+localTime1.getHour());

        // минуты
        System.out.println("Minute:"+localTime1.getMinute());

        // секунды
        System.out.println("Seconds:"+localTime1.getSecond());

        //  наносекунды
        System.out.println("Nanos:"+ localTime1.getNano());


        LocalTime timeNow = LocalTime.now();
        System.out.println("Local time now is "+timeNow);

        LocalTime localTimePlus5 = timeNow.plusHours(5); // прибавляет заданное количество часов
        System.out.println("time now plus 5 hours is "+localTimePlus5);

        //  такие же методы существуют для минут, секунд, наносекунд


        // отнять определенное количество минут
        LocalTime localTimeMinusMinutes = timeNow.minusMinutes(30);
        System.out.println("time now 30 minutes less is "+localTimeMinusMinutes);
        //  такие же методы существуют для часов, секунд, наносекунд

        // isBefore() and isAfter()

        LocalTime nowTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(19,24,56);

        /*
         метод isBefore проверяет будеь ли время localtime на котором он
         вызывается раньше чем время с которым он сравнивается. Возвращает true  или false

         */
        System.out.println("Current time is: "+nowTime);
        System.out.println("localTime2 is "+localTime2);

        System.out.println("Time now is before localTime2 ? "+nowTime.isBefore(localTime2));

        /*
         метод isBefore проверяет будеь ли время localtime на котором он
         вызывается позже чем время с которым он сравнивается. Возвращает true  или false
         */
        System.out.println("Time now is after localTime2 ? "+nowTime.isAfter(localTime2));

        // LocalDate.  Представляет дату в формате год-месяц-день 2023-07-05 . Не учитывает временную зону

        LocalDate dateNow = LocalDate.now();
        System.out.println("Date now is"+dateNow);

        LocalDate myDate = LocalDate.of(2023,07,05);

        System.out.println("Is 2023 leap year ? "+ myDate.isLeapYear());// определяет високосный год

        // текущая дата минус один день
        LocalDate lastDay = dateNow.minusDays(1);
        System.out.println("yesterday was "+lastDay);

        // завтрашний день
        LocalDate tomorrow = dateNow.plusDays(1);
        System.out.println(tomorrow);






    }


}
