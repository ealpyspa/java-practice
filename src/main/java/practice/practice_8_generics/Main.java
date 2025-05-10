package practice_8_generics;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person("Nikita", 25);

        // Значение toString() по умолчанию
        System.out.println(nikita.toString());

        // сравнение объектов
        // примитивные типы данных сравниваются через ==
        // а ссылочные сравниваются через equals()
        Person nikita2 = new Person("Nikita", 25);

        System.out.println(nikita == nikita2); // false, потому что адреса в памяти компьютера разные

        System.out.println(nikita.equals(nikita2)); // false, потому что объект сравнивает с тем же объектом, то есть true будет для того же самого объекта
        // но чтобы в условиях задачи сравнивать по имени и возрасту - надо переопределить метод
        // true, после того, как в классе Person переопределили метод equals(), теперь сравнение идет по полям

        System.out.println(nikita.equals(nikita)); // true, потому что тот же самый объект сравнивается с собой

        // клонирование
        Person cloneNikita = nikita.clone(); // недоступен напрямую, потому что у метода clone() в классе Object нет дефолтной реализации
        System.out.println(cloneNikita.toString()); // метод клон стал доступен после переопределения в Person
        System.out.println(nikita.getClass());
    }
}
