package hw7_jfc.linked_hash_map_task1;

public class Main {
    public static void main(String[] args) {
        Taks1LinkedHashMap map = new Taks1LinkedHashMap();

        map.addPerson("Ivona", 23);
        map.addPerson("Jon", 32);
        map.addPerson("Helena", 88);
        map.addPerson("Zak", 17);
        map.addPerson("Justin", 56);

        map.printPeople();

    }
}
