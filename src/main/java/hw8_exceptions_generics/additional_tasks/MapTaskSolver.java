package hw8_exceptions_generics.additional_tasks;

import java.util.HashMap;
import java.util.Map;

public class MapTaskSolver {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");

        set(map, 4, "kiwi");


    }

    public static <K, V> void set(Map<K, V> map, K key, V value) {
        map.put(key, value);
        System.out.println(map.entrySet());
    }
}
