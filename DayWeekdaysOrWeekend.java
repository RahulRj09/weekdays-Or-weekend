public class DayWeekdaysOrWeekend {
    static String checkDayWeekdaysOrWeekend(String day){
        if(day.equalsIgnoreCase("sunday" )|| day.equalsIgnoreCase("saturday")){
            return "Weekend";
        } else{
            return "weekdays";
        }
    }

    public static void main(String[] args){
        String day = args[0];
        String dayStatus = checkDayWeekdaysOrWeekend(day);
        System.out.println(dayStatus);
    }
}
