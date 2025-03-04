package hw5_6_oop_principles.task4_education_version2;

public class Gradebook {

    private Student student;
    private Progress progress;

    public Gradebook(Student student) {
        this.student = student;
        this.progress = new Progress();
    }

    public Student getStudent() {
        return student;
    }

    public Progress getProgress() {
        return progress;
    }
}
