package practice_8_generics.generics;

public class Main {
    public static void main(String[] args) {
        //Box <String> boxString = new Box();
        //boxString.setElement("Element");
        //System.out.println(boxString.getElement());

        //Box <Integer> boxInteger = new Box();
        //boxInteger.setElement(4);
        //System.out.println(boxInteger.getElement());

        Box<Book> boxBook = new Box<>();
        boxBook.setElement(new Book("1984"));
        System.out.println(boxBook.getElement().getName());

        Box<Magazine> boxMagazine = new Box<>();
        boxMagazine.setElement(new Magazine("Psychology"));
        System.out.println(boxMagazine.getElement().getName());
    }
}
