package hw5_6_oop_principles.task1_zoo_version1;

public class Elephant extends Animal {

    @Override
    public void sound() {
        System.out.println("Слон трубит.");
    }

    @Override
    public void move() {
        System.out.println("Слон ходит.");
    }

    @Override
    public void add() {
        System.out.println("Слон был добавлен.");
    }
}
