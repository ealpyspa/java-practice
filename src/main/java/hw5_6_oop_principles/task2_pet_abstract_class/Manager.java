package hw5_6_oop_principles.task2_pet_abstract_class;

public class Manager {
    public void addPet(Pet pet) {
        pet.add();
    }

    public void feedPet(Pet pet) {
        pet.feed();
    }

    public void treatPet(Pet pet) {
        pet.treat();
    }

}
