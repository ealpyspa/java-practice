package hw5_6_oop_principles.task2_pet;

public class Cat extends Pet{
    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм.");
    }

    @Override
    public void add() {
        System.out.println("Добавить кошку.");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(" 10 минут, используя бантик на веревочке.");
    }
}
