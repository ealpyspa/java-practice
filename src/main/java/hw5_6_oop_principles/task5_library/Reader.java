package hw5_6_oop_principles.task5_library;

public class Reader implements Takable, Returnable{

    @Override
    public void takeBook(){
        System.out.println("Читатель взял книгу.");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель вернул книгу.");
    }
}
