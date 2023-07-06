import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        /*
        Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать дату, которая была на год раньше сегодняшней используя метод minus
Создать дату на год позже сегодняшней используя plus метод
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
         */
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+today);

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("year: "+year);
        System.out.println("month: "+month);
        System.out.println("day: "+day);


        LocalDate date = LocalDate.of(1977,11,7);
        System.out.println("Custom date: "+date);


        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021,2,23);

        if(date1.equals(date2))
            System.out.println("Equal dates");
        else
            System.out.println("Dates are not equal");

        /*
        Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать дату, которая была на год раньше сегодняшней используя метод minus
Создать дату на год позже сегодняшней используя plus метод
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
         */

        LocalTime time = LocalTime.now();
        System.out.println("Current time is "+time);

        LocalTime newTime = time.plusHours(3);
        System.out.println("Current time plus 3 hours is "+newTime);

        LocalDate today1 = LocalDate.now();
        LocalDate nextWeek = today1.plusWeeks(1);
        LocalDate nextWeek1 = today1.plus(1, ChronoUnit.WEEKS);
        System.out.println("Date after one week is "+nextWeek1);

        LocalDate previousYear = today1.minusYears(1);
        LocalDate previuosYear1 = today1.minus(1,ChronoUnit.YEARS);
        System.out.println("Date before one year from now: "+previuosYear1);

        LocalDate nextYear = today1.plus(1,ChronoUnit.YEARS);
        System.out.println("Date after one year from now: "+nextYear);

        LocalDate yesterday = today1.minus(1,ChronoUnit.DAYS);
        if(yesterday.isBefore(today1))
            System.out.println("Date before: "+yesterday);

        LocalDate tomorrow = today1.plus(1,ChronoUnit.DAYS);
        if( tomorrow.isAfter(today1))
            System.out.println("Date after:"+tomorrow);


    }
}
