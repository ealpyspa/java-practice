package hw5_6_oop_principles.task4_education;

public class Teacher extends User{
    @Override
    public void add(Course course) {
        System.out.println("Добавить преподавателя на курс: " + course.getName());
    }

    @Override
    public void participate() {
        System.out.println("Преподаватель проверяет задание.");
    }
}
