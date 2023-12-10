package excercise4;

import java.util.List;

public class DaySchedule {
    Day day;
    List<String> activities;

    public DaySchedule(Day day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }
}
