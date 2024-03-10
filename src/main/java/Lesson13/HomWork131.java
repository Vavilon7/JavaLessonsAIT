package Lesson13;

import java.util.Scanner;

public class HomWork131 {
    //Создайте массив строк, который содержит список хобби
    // (например, "рисование", "программирование", "велоспорт")
    private static String[] hobbies = {"рисование", "программирование", "велоспорт"};
    private static int[] ratings = {10, 5, 40};

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showHobbies();
        boolean foundHobby = findHobby("программирование");
        if (foundHobby) {
            System.out.println("Хобби найдено");
        } else {
            System.out.println("Хобби не найдено");
        }

        System.out.println("Введите индекс хобби");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int hobbyIndex = scanner.nextInt();
        showFavoriteHobbyByIndex(hobbyIndex);

        System.out.println("Введите новое хобби");
        String newHobby = scanner.next();
        addHobby(newHobby);
        showHobbies();
        showHobbiesAndRatings();
    }

    //Выведите все хобби из массива на экран.
    public static void showHobbies() {
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
    }

    //ищет в массиве заданное хобби
    public static boolean findHobby(String hobbyToFind) {
        boolean found = false;
        for (String hobby : hobbies) {
            if (hobby.equals(hobbyToFind)) {
                found = true;
                break;
            }
        }
        return found;
    }

    //поиск через номер своего любимого хобби
    public static void showFavoriteHobbyByIndex(int number) {
        if (number < 0 || number >= hobbies.length) {
            System.out.println("ERROR");
        } else {
            String favoriteHobby = hobbies[number];
            System.out.println(favoriteHobby);
        }
    }

    //Добавление хобби
    public static void addHobby(String newHobby) {
        String[] hobbiesNew = new String[hobbies.length + 1];
        System.arraycopy(hobbies, 0, hobbiesNew, 0, hobbies.length);
        hobbiesNew[hobbiesNew.length - 1] = newHobby;
        hobbies = hobbiesNew;
    }


    //Рейтинг хобби
    public static void showHobbiesAndRatings() {
        if (hobbies.length != ratings.length) {
            System.out.println("ERROR RATING!!!");
        } else {
            for (int i = 0; i < hobbies.length; i++) {
                String hobby = hobbies[i];
                int rating = ratings[i];
                System.out.println(String.format("Хобби %s рейтинг %d", hobby, rating));
            }
        }
    }
}


