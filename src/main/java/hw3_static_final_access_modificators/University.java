package hw3_static_final_access_modificators;

public class University {
    public static void main(String[] args) {
        University student1 = new University(23, "Alice Cooper");
        University student2 = new University(24, "Tom Ford");
        University student3 = new University(25, "Ivan Ivanov");

        changeUniversityName("NYU");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }

    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Идентификатор студента: " + studentID + ", Имя студента: " + studentName + ", Университет: " + universityName);
    }




}
