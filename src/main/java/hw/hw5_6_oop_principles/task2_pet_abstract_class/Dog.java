package hw5_6_oop_principles.task2_pet_abstract_class;

public class Dog extends Pet {

    @Override
    public void feed() {
        System.out.println("Cобака ест сухой корм.");
    }

    @Override
    public void add() {
        System.out.println("Добавить собаку.");
    }

    @Override
    public void treat() {
        System.out.println("Погулять с собакой.");
    }
}
