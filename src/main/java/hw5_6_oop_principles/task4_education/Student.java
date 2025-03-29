package hw5_6_oop_principles.task4_education;

public class Student extends User{

    @Override
    public void add(Course course) {
        System.out.println("Добавить студента на курс: " + course.getName());
    }

    @Override
    public void participate() {
        System.out.println("Студент учится на курсе.");
    }
}
