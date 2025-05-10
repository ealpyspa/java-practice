package hw5_6_oop_principles.task4_education_version2;

public class Homework {
    private Assignment assignment;
    private Student student;
    private Teacher teacher;
    private boolean submitted;

    public Homework(Assignment assignment, Student student, Teacher teacher) {
        this.assignment = assignment;
        this.student = student;
        this.teacher = teacher;
        this.submitted = false;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void submit() {
        this.submitted = true;
        student.completeAssignment(assignment);
        System.out.println("Домашнее задание сдано.");
    }
}
