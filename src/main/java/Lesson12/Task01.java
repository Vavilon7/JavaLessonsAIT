package Lesson12;

import java.util.Scanner;

public class Task01 {
    /**
     * Напишите программу, которая принимает на вход расширение файла
     * (например, "pdf", "docx", "jpg")
     * и выводит тип файла (Документ, Изображение и т.д.).
     * Используйте `switch-case` для обработки разных расширений.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите расширение файла (например, pdf, docx, jpg): ");
        String file = scanner.next().toLowerCase();
        String fileType = switch (file) {
            case "pdf" -> "Документ (PDF)";
            case "docx" -> "Документ (Word)";
            case "jpg" -> "Изображение";
            default -> "Неизвестный тип файла";
        };
        System.out.println("Тип файла для расширения ." + file + " : " + fileType);
    }
}


