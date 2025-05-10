package hw2_classes_and_constructors;

public class StudentGroup {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("QA", 24);

        studentGroup.setStudentCount(25);
        studentGroup.printInfo();
    }

    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return groupName;
    }

    int getStudentCount() {
        return studentCount;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo() {
        System.out.println("Группа: " + groupName + ", Количество студентов: " + studentCount);
    }

}
