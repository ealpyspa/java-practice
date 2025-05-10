package practice_7_jcf.task3.contact_book;

import javax.xml.namespace.QName;
import java.util.HashMap;

public class ContactBook {
    // ключ-значение (имя-телефон)
    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // добавить контакт
     public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
     }

    // поиск контракта по имени
    public Integer getPhone(String name) {
        return contacts.get(name);
    }

    // обновление телефона по имени
    public void updatePhone(String name, Integer updatedPhone) {
        contacts.put(name, updatedPhone);
    }

    public void printContacts() {
        System.out.println("All contacts: ");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("name " + name + ", phone " + phone);
                }
        );
        System.out.println();
    }
}
