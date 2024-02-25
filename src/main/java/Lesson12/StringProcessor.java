package Lesson12;

public class StringProcessor {
    /*Разработайте класс StringProcessor, который будет предоставлять статические методы для работы со строками:

Метод reverseString, который принимает строку и возвращает её в перевёрнутом виде.
Метод isPalindrome, который проверяет, является ли переданное слово палиндромом
(читается одинаково в обоих направлениях). Метод должен возвращать булево значение.
     */
    public static void main(String[] args) {
        String s = "робот";
        System.out.println(reverse(s));

        int i = 0, j = s.length() - 1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                System.out.println("Ваше слово не является палиндромом ");
                System.exit(0);
            }
            i++;
            j--;
        }

    }
    private static String reverse(String s) {
        if (s.length() == 1) return s;
        return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
