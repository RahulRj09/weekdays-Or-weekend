import java.util.*;

public class WeekdaysOrWeekendChecker {

    static String checkWeekdaysStatus(String day) {
        if (isWeekend(day)) {
            return "Weekend";
        }else if(isWeekday(day)) {
            return "weekdays";
        }else{
           return  "invalid input";
        }
    }

    static boolean isWeekend(String day) {
        return day.equals("sunday") || day.equals("saturday");
    }

    static boolean isWeekday(String day) {
        Set<String> weekdaysSet = new HashSet<>(List.of("monday", "tuesday", "Wednesday", "thursday", "friday"));
        return weekdaysSet.contains(day);
    }

    public static void main(String[] args) {
        String day = args[0].toLowerCase();
        String dayStatus = checkWeekdaysStatus(day);
        System.out.println(dayStatus);
    }
}
