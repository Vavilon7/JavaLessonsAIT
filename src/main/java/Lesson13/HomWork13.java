package Lesson13;

import java.util.Arrays;
import java.util.Scanner;

/*Задача 1: Список хобби
Задание: Создайте массив строк, который содержит список хобби (например, "рисование",
"программирование", "велоспорт"). Выведите все хобби из массива на экран.

Цель: Практика создания массивов и итерации по элементам массива.

Задача 2: Поиск хобби
Задание: Дан массив хобби (как в задаче 1). Напишите программу, которая ищет в массиве
заданное хобби и выводит на экран сообщение о том, есть ли оно в списке.

Цель: Практика поиска элементов в массиве.

Задача 3: Любимое хобби
Задание: Используя массив хобби (как в задаче 1), попросите пользователя ввести номер
своего любимого хобби из списка. Выведите на экран название выбранного хобби.

Цель: Практика работы с пользовательским вводом и доступом к элементам массива.

Задача 4: Добавление хобби
Задание: Напишите программу, которая позволяет добавить новое хобби в существующий массив хобби.
Поскольку размер массива в Java фиксирован, вам нужно будет создать новый массив большего размера и
скопировать в него элементы из старого массива, добавив новое хобби.

Цель: Практика работы с массивами и управления размером массива.

Задача 5: Рейтинг хобби
Задание: Создайте два массива: один для хобби (как в задаче 1) и один для рейтинга каждого хобби (целые числа).
Напишите программу, которая выводит хобби и их рейтинги в виде списка.

Цель: Практика работы с параллельными массивами для управления связанными данными.*/
public class HomWork13 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] hobbyVictoria = new String[5];
        hobbyVictoria[0] = "рисование";
        hobbyVictoria[1] = "спорт";
        hobbyVictoria[2] = "рыбалка";
        hobbyVictoria[3] = "мода";
        hobbyVictoria[4] = "музыка";

            for (int x = 0; x < hobbyVictoria.length; x++) {
                System.out.println("hobbyVictoria " + (x + 1) + " = " + hobbyVictoria[x]);
            }
        {
            boolean found = false;
            int index = 0;
            String hobby = "музыка";
            for (int i = 0; i < hobbyVictoria.length; i++) {
                if (hobby.equals(hobbyVictoria[i])) {
                    index = i;
                    found = true;
                    break;
                }
            }
            if (found)
                System.out.println("Хобби " + hobby + " найден в списке хобби " + (index + 1));
            else
                System.out.println("Хобби " + hobby + " не найден в списке");

        }
            {
                hobbyVictoria = new String[6];
                hobbyVictoria[0] = "рисование";
                hobbyVictoria[1] = "спорт";
                hobbyVictoria[2] = "рыбалка";
                hobbyVictoria[3] = "мода";
                hobbyVictoria[4] = "музыка";
                int numberOfItems = 5;
                String newHobby = "фитнес";
                hobbyVictoria[numberOfItems++] = newHobby;
                System.out.println("Массив с добавлением нового эллемента:" + newHobby +
                        Arrays.toString(hobbyVictoria));
            }
        }

        }












