package HomWork32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculator {
    private List<Integer> list = new ArrayList<>();

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public String toUpperCase(String input) {
        if (input == null) {
            //throw  new IllegalArgumentException("Input cannon be null");
            return "Input cannot be null";
        }
        return input.toUpperCase();
    }

    public List<Student> filterStudents(List<Student> students) {
        return students.stream().filter(student -> student.grade > 75).collect(Collectors.toList());
    }
    public int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public String greet(String name) {
        return "Hello " + name + "!";
    }

    public boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "cherry");
    }

}
