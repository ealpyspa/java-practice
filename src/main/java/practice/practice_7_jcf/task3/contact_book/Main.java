package practice_7_jcf.task3.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Eva", 1234);
        contactBook.addContact("Tom", 5678);

        contactBook.printContacts();

        contactBook.updatePhone("Tom", 1299);
        contactBook.printContacts();

    }
}
