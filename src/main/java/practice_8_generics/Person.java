package practice_8_generics;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override // переопределяем метод класса Object
    public String toString() {
        return "Name: " + this.name + ", age " + this.age;
    }

    @Override // переопределяем метод класса Object
    public boolean equals(Object obj) {
        if (this == obj) return true; // 1. Сравниваем объект с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // 2. Проверка крайних случаев:
        // 1) object, который передали, равен null, тогда нет смысла его проверять
        // 2) если класс объекта, который передали, не соответствует классу текущего объекта, тогда объекты точно не равны
        // здесь мы уже точно знаем, что у текущего и сравниваемого объектов одинаковые классы
        // теперь можно привести объект к значению класса Person
        Person that = (Person) obj;
        return this.name.equals(that.name) && this.age.equals(that.age); // упрощенная форма if-else, вернется результат логического выражения
    }

    @Override // переопределяем метод класса Object
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result * 31 + age; // у примитивных типов данных нет хеш-кода
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }
}
