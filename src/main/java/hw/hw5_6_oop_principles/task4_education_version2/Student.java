package hw5_6_oop_principles.task4_education_version2;

public class Student extends User{

    private Gradebook gradebook;

    public Student(String name, String surname) {
        super(name, surname);
        this.gradebook = new Gradebook(this);
    }

    public Gradebook getGradebook() {
        return gradebook;
    }

    public void completeAssignment(Assignment assignment) {
        gradebook.getProgress().markCompleted(assignment);
    }
}
