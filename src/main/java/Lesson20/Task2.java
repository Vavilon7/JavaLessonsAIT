package Lesson20;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*Задание**: Имея `ArrayList` с элементами "Red", "Green",
    "Blue", "Yellow", удалите "Green" и "Yellow" из списка. Выведите итоговый список на экран.*/
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.remove("Green");
        colors.remove("Yellow");
        System.out.println(colors);
    }
}

