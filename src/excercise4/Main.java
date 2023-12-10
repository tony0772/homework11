package excercise4;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<DaySchedule> schedules = new ArrayList<>();
        schedules.add(new DaySchedule(Day.MONDAY, List.of("Work", "Lunch", "Meeting")));
        schedules.add(new DaySchedule(Day.TUESDAY, List.of("Exercise", "Study", "Dinner")));
        System.out.println(schedules);
        for (DaySchedule schedule : schedules) {
            System.out.println("Day: " + schedule.day);
            System.out.println("Activities:");
            for (String activity : schedule.activities) {
                System.out.println("- " + activity);
            }
        }
    }
}

