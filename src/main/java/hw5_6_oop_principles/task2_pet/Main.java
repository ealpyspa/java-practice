package hw5_6_oop_principles.task2_pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Manager manager = new Manager();

        manager.addPet(dog);
        manager.feedPat(dog);
        manager.walkPet(dog);

        manager.addPet(cat);
        manager.feedPat(cat);
        manager.playWithPet(cat);

    }
}
