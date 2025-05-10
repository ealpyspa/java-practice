package hw5_6_oop_principles.task2_pet_abstract_class_version2;

public class Manager {
    public void addPet(Pet pet) {
        System.out.println("Добавить питомца в систему: " + pet.getClass().getSimpleName());
    }

    public void feedPet(Pet pet) {
        pet.eat();
    }

    public void interact(Pet pet) {
        pet.act();
    }

}