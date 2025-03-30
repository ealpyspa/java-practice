package hw7_jfc.hash_map_task1;

public class Main {
    public static void main(String[] args) {
        Task1HashMap task1HashMap = new Task1HashMap();

        task1HashMap.addStudent("Alice", 28);
        task1HashMap.addStudent("Tom", 31);

        task1HashMap.printStudents();
    }
}
