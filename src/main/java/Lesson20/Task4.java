package Lesson20;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
       // **Задание**: Имея `ArrayList` с элементами "Monday", "Tuesday", "Wednesday",
              //  замените "Wednesday" на "Sunday". Выведите итоговый список на экран.
        ArrayList<String> day = new ArrayList<>();
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.set(2,"Sunday");
        System.out.println(day);

    }
}
