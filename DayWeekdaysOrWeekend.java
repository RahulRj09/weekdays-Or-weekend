import java.util.*;

public class DayWeekdaysOrWeekend {
    static String checkDayWeekdaysOrWeekend(String day){
        if(isWeekend(day)){
            return "Weekend";
        } else{
            return checkDayWeekdaysOrNot(day);
        }
    }

    static  boolean isWeekend(String day){
        day = day.toLowerCase();
        boolean sunday = day.equals("sunday" );
        boolean saturday = day.equals("saturday");
        return sunday || saturday;
    }

    static String checkDayWeekdaysOrNot(String day){
        Set<String> weekdaysSet = new HashSet<>(List.of("monday", "tuesday", "Wednesday", "thursday", "friday"));
        if(weekdaysSet.contains(day.toLowerCase())){
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
