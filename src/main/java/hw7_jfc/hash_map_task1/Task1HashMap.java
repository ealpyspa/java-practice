package hw7_jfc.hash_map_task1;

import java.util.HashMap;
import java.util.Map;

public class Task1HashMap {
    private HashMap<String, Integer> students;

    public Task1HashMap() {
        this.students = new HashMap<>();
    }

    public void addStudent(String name, Integer age) {
        students.put(name, age);
    }

    public void printStudents() {
        System.out.println("All students: ");
        for(Map.Entry<String, Integer> entry: students.entrySet()) {
            System.out.println("name: " + entry.getKey() + ", age: " + entry.getValue());
        }
    }
}
