package practice.practice_9.streamapi;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGenderMain {
    // Список строк с именем и полом "John:M", "Sarah:F"
    // сгруппировать по полу в map Map<String, List<String>>
    //                                  пол     список имен

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John:M", "Sarah:F", "Sasha:F", "Nick:M");

        Map<String, List<String>> groupedByGenderNames = names.stream()
                .collect(Collectors.groupingBy(name -> {
                    System.out.println("key before transformation: " + name);
                    System.out.println("key after transformation: " + name.split(":")[1]);
                    return name.split(":")[1];},
                        Collectors.mapping(name -> {
                            System.out.println("value before transformation: " + name);
                            System.out.println("value after transformation: " + name.split(":")[0]);
                            return name.split(":")[0];},
                                Collectors.toList())));

        System.out.println(groupedByGenderNames);
    }
}
