package hw5_6_oop_principles.task2_pet_abstract_class_version2;

public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("Cобака ест сухой корм.");
    }

    @Override
    public void act() {
        System.out.println("Собака гуляет.");
    }
}