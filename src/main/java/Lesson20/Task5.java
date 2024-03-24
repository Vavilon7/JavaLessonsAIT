package Lesson20;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
       // **Задание**: Создайте `ArrayList` с элементами 4, 1, 3, 5, 2.
      //  Выведите на экран минимальный и максимальный элементы
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        int numbreMin = numbers.get(0);
        int numberMax = numbers.get(0);
        for (Integer number: numbers){
            if (number>numberMax) {
                numberMax = number;
            }
            if (number<numbreMin){
                numbreMin=number;
        System.out.println("numberMax: " + numberMax + " " + "numberMin " + numbreMin);
    }
}}}
