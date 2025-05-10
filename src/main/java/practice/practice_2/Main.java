package practice_2;

import practice_3.Test1;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(18, "Петя");

        petya.print();

        Student kolya = new Student(20, "Коля");

        kolya.print();

        //petya.setName("Антон");
        petya.name = "Антон";
        petya.print();

        //kolya.setAge(21);
        kolya.age = 21;
        kolya.print();

        // дебаггинг или дебаг, точка ОСТАНОВА

    }
}
