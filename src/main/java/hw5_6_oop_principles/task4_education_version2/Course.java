package hw5_6_oop_principles.task4_education_version2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Assignment> assignments = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Студент: " + student.getName() + " " + student.getSurname() + " добавлен на курс: " + this.name);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Преподаватель: " + teacher.getName() + " " + teacher.getSurname() + " добавлен на курс: " + this.name);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Задание: " + assignment.getTask() + " добавлено на курс: " + this.name);
    }
}
