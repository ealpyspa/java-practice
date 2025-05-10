package hw5_6_oop_principles.task2_pet_abstract_class;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм.");
    }

    @Override
    public void add() {
        System.out.println("Добавить кошку.");
    }

    @Override
    public void treat() {
        System.out.println("Поиграть с кошкой.");
    }
}
