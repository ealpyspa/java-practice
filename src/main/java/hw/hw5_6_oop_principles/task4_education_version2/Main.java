package hw5_6_oop_principles.task4_education_version2;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java");
        Student student = new Student("Ivan", "Ivanov");
        Teacher teacher = new Teacher("Tom", "Smith");
        Assignment assignment = new Assignment("OOP practice");

        course.addStudent(student);
        course.addTeacher(teacher);
        course.addAssignment(assignment);

        Homework homework = new Homework(assignment,student,teacher);
        homework.submit();

        teacher.reviewHomework(homework);
    }
}
