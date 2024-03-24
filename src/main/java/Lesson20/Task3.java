package Lesson20;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
       // **Задание**: Дан `ArrayList` с элементами 1, 2, 3, 4, 5. Выведите на экран третий элемент списка.
        ArrayList<Integer> nombers = new ArrayList<>();
        nombers.add(1);
        nombers.add(2);
        nombers.add(3);
        nombers.add(4);
        nombers.add(5);
        System.out.println(nombers.get(2));
    }
}
