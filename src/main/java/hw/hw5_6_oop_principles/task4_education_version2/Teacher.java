package hw5_6_oop_principles.task4_education_version2;

public class Teacher extends User{

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public void reviewHomework(Homework homework) {
        System.out.println("Преподаватель: " + getName() + " " + getSurname() + " проверил задание: " + homework.getAssignment().getTask());
    }
}
