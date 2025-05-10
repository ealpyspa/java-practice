package practice_7_jcf.hw.solutions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTasks {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        arrayList.add(6);

        ArrayList<Integer> listEvenOnly = new ArrayList<>();

        // for
        // forEcah
        // while (iterator)

        Iterator<Integer> iteratorForList = arrayList.iterator();

        // hasNext - true/false - показывает, есть ли у коллекции следующий элемент
        // next - return next element
        // алгоритм: проверить, есть ли следующий элемент, если да - вернуть следующий

        while (iteratorForList.hasNext()) {
            Integer currentElement = iteratorForList.next();
            if(currentElement % 2 == 0) {
                // listEvenOnly.add(currentElement);
                // arrayList.remove(currentElement); // неправильно
                iteratorForList.remove(); // корректно
            }
        }

        // System.out.println(listEvenOnly);
        System.out.println(arrayList);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a", "aa", "aba"));

        System.out.println(findStringWithMaxLength(strings));

        System.out.println(findSumOfAllElements(arrayList));
    }

    public static String findStringWithMaxLength(ArrayList<String> strings) {
        Integer max = 0;
        String maxString = "";

        for(String str: strings) {
            if(str.length() > max) {
                max = str.length();
                maxString = str;
            }
        }
        return maxString;
    }

    public static int findSumOfAllElements(ArrayList<Integer> arrayList) {
        int sum = 0;
        for(Integer element: arrayList) {
            sum = sum + element;
        }

        return sum;
    }

}
