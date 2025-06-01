1. Проверка чётности числа
   Напишите тесты для метода, который определяет, является ли число чётным:

public boolean isEven(int number) {
return number % 2 == 0;
}

Тесты должны проверять:
Чётные и нечётные числа
Нулевое значение
Отрицательные числа


2. Подсчёт количества гласных в строке
   Напишите тесты для метода, который считает количество гласных букв в строке:

public int countVowels(String input) {
if (input == null) {
throw new IllegalArgumentException("Input cannot be null");
}
return (int) input.toLowerCase().chars()
.filter(c -> "aeiou".indexOf(c) != -1)
.count();
}

Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных


3. Разворот строки
   Напишите тесты для метода, который переворачивает строку:

public String reverse(String input) {
if (input == null) return null;
return new StringBuilder(input).reverse().toString();
}

Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)


4. Поиск максимального числа в массиве
   Напишите тесты для метода, который находит максимальное число в массиве:

public int findMax(int[] numbers) {
return Arrays.stream(numbers).max().orElseThrow();
}

Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)


5. Проверка, является ли год високосным
   Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)


6. Проверка валидности email
   Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null


7. Факториал числа
   Напишите тесты для метода, который вычисляет факториал числа:

public int factorial(int n) {
if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
return (n == 0) ? 1 : n * factorial(n - 1);
}
Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
Отрицательные числа (должно выбрасываться исключение)


8. Поиск второго максимального числа в массиве
   Напишите тесты для метода, который находит второе по величине число:

public int findSecondMax(int[] numbers) {
return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
}

Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)


9. Подсчёт количества слов в строке
   Напишите тесты для метода, который считает количество слов в строке:

public int countWords(String sentence) {
return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
}

Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами

10. Проверка валидности номера телефона

Напишите тесты для метода, который проверяет валидность телефонного номера:

public boolean isValidPhoneNumber(String phone) {
return phone.matches("\\+\\d{1,3} \\d{10}");
}

Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")


Дополнительные задачи (по желанию):


11. Фильтрация списка чисел (оставить только чётные)

Метод:
public List<Integer> filterEvenNumbers(List<Integer> numbers) {
return numbers.stream()
.filter(n -> n % 2 == 0)
.collect(Collectors.toList());
}

Тесты:
Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
Список без чётных чисел
Пустой список


12. Сортировка списка строк по длине

Метод:
public List<String> sortByLength(List<String> words) {
return words.stream()
.sorted(Comparator.comparingInt(String::length))
.collect(Collectors.toList());
}

Тесты:
[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
Одинаковые длины ([ "aa", "bb", "cc" ])
Пустой список


13. Проверка, является ли строка анаграммой другой

Метод:
public boolean isAnagram(String str1, String str2) {
if (str1 == null || str2 == null) return false;
char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
return Arrays.equals(arr1, arr2);
}

Тесты:
"listen", "silent" → true
"java", "python" → false
null → false


14. Нахождение среднего значения массива чисел

Метод:
public double findAverage(int[] numbers) {
return Arrays.stream(numbers).average().orElseThrow();
}

Тесты:
[1, 2, 3, 4, 5] → 3.0
[10] → 10.0
Пустой массив (должно выбрасываться исключение)


15. Преобразование списка строк в список их длин

Метод:
public List<Integer> mapToLengths(List<String> words) {
return words.stream().map(String::length).collect(Collectors.toList());
}

Тесты:
[ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
Пустой список


16. Разбиение строки на части по разделителю

Метод:
public String[] splitString(String input, String delimiter) {
return input.split(delimiter);
}

Тесты:
"Java,Python,C++", "," → ["Java", "Python", "C++"]
"", "," → [""]
"word", "," → ["word"]


17. Проверка корректности пароля (длина, символы, цифры)

Метод:
public boolean isValidPassword(String password) {
if (password == null || password.length() < 😍 return false;
return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
}

Тесты:
"Password1" → true
"pass" → false
null → false


18. Нахождение наибольшего общего делителя (НОД)

Метод:
public int gcd(int a, int b) {
return b == 0 ? a : gcd(b, a % b);
}

Тесты:
24, 36 → 12
101, 103 → 1
0, 10 → 10



19. Проверка, является ли строка JSON-объектом

Метод:
import com.fasterxml.jackson.databind.ObjectMapper;
public boolean isValidJson(String json) {
try {
new ObjectMapper().readTree(json);
return true;
} catch (Exception e) {
return false;
}
}

Тесты:
"{"key":"value"}" → true
"invalid json" → false
null → false


20. Проверка, содержит ли массив дубликаты

Метод:
public boolean hasDuplicates(int[] numbers) {
return Arrays.stream(numbers).distinct().count() != numbers.length;
}

Тесты:
[1, 2, 3, 4, 5] → false
[1, 2, 2, 3] → true
Пустой массив → false
