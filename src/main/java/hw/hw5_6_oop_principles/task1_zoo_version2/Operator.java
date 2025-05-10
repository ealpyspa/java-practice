package hw5_6_oop_principles.task1_zoo_version2;

public class Operator {

    public void add(hw5_6_oop_principles.task1_zoo_version2.Animal animal) {
        System.out.println("Добавить животное в зоопарк: " + animal.getClass().getSimpleName());
    }

    public void demonstrateSound(hw5_6_oop_principles.task1_zoo_version2.Animal animal) {
        animal.sound();
    }

    public void demonstrateMove(Animal animal) {
        animal.move();
    }
}
