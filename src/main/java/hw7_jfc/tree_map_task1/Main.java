package hw7_jfc.tree_map_task1;

public class Main {
    public static void main(String[] args) {
        Task1TreeMap treeMap = new Task1TreeMap();

        treeMap.addNewEntry("Alice", 4);
        treeMap.addNewEntry("Olga", 3);
        treeMap.addNewEntry("Filip", 5);
        treeMap.addNewEntry("Zak", 1);
        treeMap.addNewEntry("Alena", 3);

        treeMap.printMap();
    }
}
