import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DayWeekdaysOrWeekend {
    static String checkDayWeekdaysOrWeekend(String day){
        if(checkDayWeekend(day)){
            return "Weekend";
        } else{
            return checkDayWeekdaysOrNot(day);

        }
    }

    static  boolean checkDayWeekend(String day){
        boolean sunday = day.equalsIgnoreCase("sunday" );
        boolean saturday = day.equalsIgnoreCase("saturday");
        return sunday || saturday;
    }

    static String checkDayWeekdaysOrNot(String day){
        String[] weekdaysList = { "monday", "tuesday", "Wednesday", "thursday", "friday" };
        Set<String> weekdaysSet = new HashSet<>(Arrays.asList(weekdaysList));
        if(weekdaysSet.contains(day)){
            return "weekdays";
        }
        return "invalid input";
    }

    public static void main(String[] args){
        String day = args[0];
        String dayStatus = checkDayWeekdaysOrWeekend(day);
        System.out.println(dayStatus);
    }
}
