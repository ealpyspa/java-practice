package hw3_static_final_access_modificators;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + getFirstName() + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", "Cooper", "123-45-6789");
        Person person2 = new Person("Tom", "Felton", "123-23-4567");

        person1.setFirstName("Julia");
        person1.setLastName("Fox");
        person1.printPersonInfo();

        person2.printPersonInfo();
    }
}

