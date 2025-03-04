package hw5_6_oop_principles.task4_education_version2;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }
}
