package hw7_jfc.linked_hash_map_task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Taks1LinkedHashMap {
    private LinkedHashMap<String, Integer> people;

    public Taks1LinkedHashMap() {
        this.people = new LinkedHashMap<>();
    }

    public void addPerson(String name, Integer age) {
        people.put(name, age);
    }

    public void printPeople() {
        System.out.println("All people: ");
        for(Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("name: " + entry.getKey() + ", age: " + entry.getValue());
        }
    }
}
