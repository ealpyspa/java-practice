package hw5_6_oop_principles.task1_zoo_version2;

public class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Птица чирикает.");
    }

    @Override
    public void move() {
        System.out.println("Птица летает.");
    }

}
