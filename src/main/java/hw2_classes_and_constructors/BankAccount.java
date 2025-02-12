package hw2_classes_and_constructors;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Alice Smith", 150);

        bankAccount.deposit(20);
        bankAccount.withdraw(30);
        bankAccount.printBalance();
    }
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -=amount;
    }

    public void printBalance() {
        System.out.println(balance);
    }
}
