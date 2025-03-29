package hw5_6_oop_principles.task4_education_version2;

import java.util.HashMap;
import java.util.Map;

public class Progress {
    private Map<Assignment, Boolean> assignmentStatus = new HashMap<>();

    public void markCompleted(Assignment assignment) {
        assignmentStatus.put(assignment, true);
    }

    public boolean isCompleted(Assignment assignment) {
        return assignmentStatus.getOrDefault(assignment, false);
    }

}
