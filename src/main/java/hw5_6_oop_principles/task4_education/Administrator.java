package hw5_6_oop_principles.task4_education;

public class Administrator {

    public void control(User user) {
        user.participate();
    }

    public void addUserToCourse(User user, Course course) {
        user.add(course);
    }

}
