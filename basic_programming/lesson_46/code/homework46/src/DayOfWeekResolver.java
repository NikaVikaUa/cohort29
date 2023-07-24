import java.util.Scanner;

public class DayOfWeekResolver {

    private static Scanner scanner = new Scanner(System.in);

    public void start(){
        DayOfWeek dayOfWeek = readDayOfWeek();
        System.out.println("It is "+isDayOff(dayOfWeek));
        scanner.close();

    }


    private DayOfWeek readDayOfWeek(){
        DayOfWeek enumDay = null;
        boolean flag;
        do {
            flag = false;
            System.out.println("Enter day of the week");
            String day = scanner.next();
            try {
                 enumDay = DayOfWeek.valueOf(day.toUpperCase());
            } catch (IllegalArgumentException e){
                System.out.println("Please enter valid day of week");
                flag = true;
            }

        }while(flag);

        return enumDay;
    }




//    private boolean isDayOf(String day){
 //       DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
 //       return isDayOff(dayOfWeek);
 //   }



    private boolean isDayOff( DayOfWeek day){
        switch (day){
            case SATURDAY:
            case SUNDAY: return true;
            default: return false;

        }
    }
}
