import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class OurLocalDateTime {

    // LocalDateTime - представляет дату и время без информации о временных зонах
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalDateTime localDateTime = LocalDateTime.of(2023,07,06,18,02);
        System.out.println(localDateTime);

        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());

        current.plusDays(4);
        current.minusHours(5);

        //current.isEqual()
       // current.isAfter()
       // current.isBefore()

        // зональное время ZonedDateTime - предоставляет информацию о дате и времени с учетом временной зоны

        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        System.out.println("Berlin zone id is "+zoneId);


      Set<String>allZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(allZoneIds);

       //  Найдем местное время в Нью-Йоркеб Берлине и Лондоне

        ZoneId america = ZoneId.of("America/New_York");
        ZoneId europe = ZoneId.of("Europe/London");

        LocalDateTime localDateAndTime = LocalDateTime.now();

        ZonedDateTime dateTimeNewYork = ZonedDateTime.of(localDateAndTime,america);
        ZonedDateTime dateTimeLondon = ZonedDateTime.of(localDateAndTime,europe);

        System.out.println("Current in NewYork: "+dateTimeNewYork);
        System.out.println("Current in London:"+dateTimeLondon);


    }
}
