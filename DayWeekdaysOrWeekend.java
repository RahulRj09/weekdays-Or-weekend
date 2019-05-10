public class DayWeekdaysOrWeekend {
    static String checkDayWeekdaysOrWeekend(String day){
        if(day.equalsIgnoreCase("sunday" )|| day.equalsIgnoreCase("saturday")){
            return "Weekend";
        } else{
            return checkDayWeekdaysOrNot(day);

        }
    }

    static String checkDayWeekdaysOrNot(String day){
        String[] weekdaysList = { "monday", "tuesday", "Wednesday", "thursday", "friday" };
        for (int i = 0; i <weekdaysList.length; i++) {
           if(day.equalsIgnoreCase(weekdaysList[i])){
                return "weekdays";
            }
        }
        return "invalid input";
    }

    public static void main(String[] args){
        String day = args[0];
        String dayStatus = checkDayWeekdaysOrWeekend(day);
        System.out.println(dayStatus);
    }
}
