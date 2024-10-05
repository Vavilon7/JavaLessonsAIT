package HomWork32;

import Lessons26.Season;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator testsWork;
    private List<Integer> integerList;
    private List<Student> students;

    @BeforeEach
    public void setUp() {
        testsWork = new Calculator();
        integerList = new ArrayList<>();
        students = new ArrayList<>();
    }

    @Test
        //@Disabled("Method is not ready")
    void testAdd() {
        Assert.assertEquals(0, integerList.size());
        Assert.assertTrue(integerList.add(10));
        Assert.assertTrue(integerList.add(30));
        Assert.assertTrue(integerList.add(45));
        Assert.assertEquals(3, integerList.size());
        int getResult = integerList.get(1);
        Assert.assertEquals(30, getResult);
    }

    @Test
    @DisplayName("1. Проверка позитивных чисел на наибольшее число")
    void checkPositiveNumberPositive() {
        assertEquals(6, testsWork.max(5, 6));
    }

    @Test
    @DisplayName("1. Проверка ноля и позитивного числа на наибольшее число")
    void checkZeroPositiveNumberPositive() {
        assertEquals(20, testsWork.max(0, 20));
    }

    @Test
    @DisplayName("1. Проверка ноля и негативного числа на наибольшее число")
    void checkZeroNegativeNumberPositive() {
        assertEquals(0, testsWork.max(-99, 0));
    }

    @Test
    @DisplayName("1. Проверка равных чисел на наибольшее число")
    void checkEqualsNumberPositive() {
        assertEquals(0, testsWork.max(0, 0));
    }

    @Test
    @DisplayName("1. Проверка смешанных чисел на наибольшее число")
    void checkMixNumberPositive() {
        assertEquals(11, testsWork.max(-10, 11));
    }

    @Test
    void checkUpperCaseSuccess() {
        assertEquals("HELLO", testsWork.toUpperCase("hello"));
    }


    @Test
    void checkUpperCaseError() {
        assertEquals("Input cannot be null", testsWork.toUpperCase(null), "Error string is wrong");
    }

    @Test
    void testFilterStudents() {
        students.add(new Student("Alex", 99));
        students.add(new Student("Lisa", 80));
        students.add(new Student("Sven", 85));
        students.add(new Student("David", 76));
        List<Student> filteredStudents = testsWork.filterStudents(students);
        assertFalse(filteredStudents.isEmpty());
        assertEquals(4, filteredStudents.size());
        Assert.assertEquals("Alex", filteredStudents.get(0).getName());
        Assert.assertEquals("Lisa", filteredStudents.get(1).getName());
        Assert.assertEquals("Sven", filteredStudents.get(2).getName());
        Assert.assertEquals("David", filteredStudents.get(3).getName());
    }

    @Test
    void testFilterStudentsNoStudentWasFiltered() {
        students.add(new Student("Alex", 12));
        students.add(new Student("Lisa", 45));
        students.add(new Student("Sven", 33));
        students.add(new Student("David", 43));
        List<Student> filteredStudents = testsWork.filterStudents(students);
        assertTrue(filteredStudents.isEmpty());
        assertEquals(0, filteredStudents.size());
    }

    @Test
    void testSortArray() {
        int[] numbers = {5, 3, 6, 9, 7, 2};
        int[] sortNumbers = {2, 3, 5, 6, 7, 9};
        assertArrayEquals(sortNumbers, testsWork.sortArray(numbers));
        assertNotEquals(numbers, testsWork.sortArray(sortNumbers));
    }

    @Test
    @DisplayName("7. Проверка, что метод корректно формирует приветствие для разных имён")
    void testGreetings() {
        assertEquals("Hello Alex!", testsWork.greet("Alex"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "23radar32"})
    void testIsPalindromeSuccess(String input) {
        assertTrue(testsWork.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"www333q", "ha332ndy", "computer"})
    void testIsPalindromeFalse(String input) {
        assertFalse(testsWork.isPalindrome(input));
    }

    @ParameterizedTest
    @EnumSource(Season.class)
    void testEnumSeason(Season season) {
        assertNotNull(season);
    }

    @ParameterizedTest
    @MethodSource("HomWork32.Calculator#stringProvider")
    void testStringProvider(String argument){
        assertFalse(argument.isEmpty());
    }
    @ParameterizedTest
    @CsvSource({
            "1,1,1",
            "2,3,3",
            "3,5,5",
            "-3, -6, -3"
    })
    void testMaxValue(int a, int b, int expected) {
        assertEquals(expected, testsWork.max(a, b)); //1,1 -->1 2,3 -->3 //3,5 -->5
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void testMaxvalueCsvFile(int a, int b, int expected) {
        System.out.println("argument a " +a  + " argument b " + b + " expected " + expected);
        assertEquals(expected, testsWork.max(a, b));
        assertTimeoutPreemptively(Duration.ofMillis(100),()-> testsWork.max(a,b));
    }
}
