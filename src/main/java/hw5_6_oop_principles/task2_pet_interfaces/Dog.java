package hw5_6_oop_principles.task2_pet_interfaces;

public class Dog extends Pet implements Walkable{

    @Override
    public void feed() {
        System.out.println("Cобака ест сухой корм.");
    }

    @Override
    public void add() {
        System.out.println("Добавить собаку.");
    }

    @Override
    public void walk() {
        System.out.println("Погулять с собакой 40 минут на улицу.");
    }
}
