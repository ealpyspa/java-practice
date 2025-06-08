package hw.hw_11_testing_code;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
