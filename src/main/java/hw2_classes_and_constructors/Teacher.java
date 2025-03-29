package hw2_classes_and_constructors;

public class Teacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Анна Ивановна", "Литература");

        teacher.setSubject("Математика");
        teacher.printInfo();
    }
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return name;
    }

    String getSubject() {
        return subject;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }
}
