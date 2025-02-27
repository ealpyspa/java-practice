package hw5_6_oop_principles.task2_pet;

public abstract class Pet implements Playable, Walkable{

    public abstract void feed();

    public abstract void add();

    @Override
    public void play() {
        System.out.println("Поиграть с питомцем: ");
    }

    @Override
    public void walk() {
        System.out.println("Погулять с питомцем: ");
    }
}
