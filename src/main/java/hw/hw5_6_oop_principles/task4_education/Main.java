package hw5_6_oop_principles.task4_education;

public class Main {
    public static void main(String[] args) {
        User student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course("Литература");
        Administrator administrator = new Administrator();

        administrator.addUserToCourse(student, course);
        administrator.control(student);

        administrator.addUserToCourse(teacher, course);
        administrator.control(teacher);
    }
}
