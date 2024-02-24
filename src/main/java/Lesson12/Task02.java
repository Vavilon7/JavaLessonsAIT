package Lesson12;

public class Task02 {
     /*
    Создайте метод `isEven`, который принимает один
    целочисленный аргумент и возвращает `boolean` значение,
    которое указывает, является ли число четным.
     В `main`, проверьте несколько чисел
     и выведите результаты проверки.
     */

    public static void main(String[] args) {
        boolean result = isEven(14);
        System.out.println(result);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
        //return  number % 2 == 0
    }
}

