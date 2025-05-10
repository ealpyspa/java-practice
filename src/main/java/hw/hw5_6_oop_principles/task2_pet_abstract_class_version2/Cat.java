package hw5_6_oop_principles.task2_pet_abstract_class_version2;


public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм.");
    }

    @Override
    public void act() {
        System.out.println("Кошка играет.");
    }
}