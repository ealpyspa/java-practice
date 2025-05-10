package hw5_6_oop_principles.task2_pet_interfaces;

public class Cat extends Pet implements Playable {
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
        System.out.println("Поиграть с кошкой 10 минут, используя бантик на веревочке.");
    }
}
