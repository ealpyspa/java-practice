package hw7_jfc.tree_map_task1;

import java.util.Map;
import java.util.TreeMap;

public class Task1TreeMap {
    private TreeMap<String, Integer> map;

    public Task1TreeMap() {
        this.map = new TreeMap<>();
    }

    public void addNewEntry(String name, Integer score) {
        map.put(name, score);
    }

    public void printMap() {
        System.out.println("All results:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("name: " + entry.getKey() + ", score: " + entry.getValue());
        }
    }
}
