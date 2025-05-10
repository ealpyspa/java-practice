package hw5_6_oop_principles.task2_pet_abstract_class;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog();
        Pet cat = new Cat();
        Manager manager = new Manager();

        manager.addPet(dog);
        manager.feedPet(dog);
        manager.treatPet(dog);

        manager.addPet(cat);
        manager.feedPet(cat);
        manager.treatPet(cat);

    }
}
