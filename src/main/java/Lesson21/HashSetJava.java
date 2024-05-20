package Lesson21;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Добавляю " + randomNumber);
            hashSet.add(randomNumber);
            System.out.println(hashSet.hashCode());
            HashSet<String> hashSetCars = new HashSet<>();
            hashSetCars.add("Audi");
            hashSetCars.add("BMW");
            hashSetCars.add("VW");

            //попытка добавить дупликат,
            //сохраняются лишь уникальные элементы
            hashSetCars.add("Audi");

            //Проверка наличия элемента
            if (hashSetCars.contains("Audi")) {
                System.out.println("Найден элемент");
            }

            //удаление элемента
            hashSetCars.remove("VW");

            System.out.println();

            //Итерация по элементам
            for (String car : hashSetCars) {
                System.out.println(car);
            }

            Iterator<String> iterator = hashSetCars.iterator();
            while (iterator.hasNext()) {
                String car = iterator.next();
                if (car.equalsIgnoreCase("Audi")) {
                    iterator.remove();
                    System.out.println("removed !!!");
                }
            }

            for (String car : hashSetCars) {
                System.out.println(car);
            }

            System.out.println(hashSet.toArray().toString());
            break;
        }

    }
}

