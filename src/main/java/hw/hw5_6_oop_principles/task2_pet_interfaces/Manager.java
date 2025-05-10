package hw5_6_oop_principles.task2_pet_interfaces;

public class Manager {
    public void addPet(Pet pet) {
        pet.add();
    }

    public void feedPet(Pet pet) {
        pet.feed();
    }

    public void walkPet(Pet pet) {
        //pet.walk(); // compilation error
    }

    public void playWithPet(Pet pet) {
        //pet.play(); // compilation error
    }

}
