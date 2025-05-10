package hw8_exceptions_generics.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // task1
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }

        //task2
        try {
            division(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }

        //task3
        try {
            ageCheck(-3);
        } catch (NotEligibleAgeException e) {
            System.out.println(e.getMessage());
        }

        //task4
        try {
            emailValidationCheck("test.com");
        } catch (NotValidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void division(int a, int b) {
        int result = a / b;
        if(b == 0) throw new ArithmeticException();
    }

    public static void ageCheck(int age) throws NotEligibleAgeException {
        if(age < 0 || age > 150) {
            throw new NotEligibleAgeException(age + " is not eligible age.");
        }
    }

    public static void emailValidationCheck(String email) {
        String regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!email.matches(regexp)) {
            throw new NotValidEmailException(email + " is not valid email address.");
        }
    }
}
