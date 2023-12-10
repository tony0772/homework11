package excercise1;

import java.util.HashMap;
import java.util.Map;

public class StudentGrade {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Maria", 90);
        studentGrades.put("Andrei", 85);
        studentGrades.put("Ionel", 95);
        studentGrades.put("David", 88);

        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int highestGrade = Integer.MIN_VALUE;
        String highestGradeStudent = null;
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                highestGradeStudent = entry.getKey();
            }
        }

        System.out.println("Student with the highest grade: " + highestGradeStudent);
    }
}
