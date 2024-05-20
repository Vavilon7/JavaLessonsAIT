package lesson06;

import java.util.Scanner;

public class HomWork07 {
    //Напишите программу, которая запрашивает у пользователя целое число и сообщает,
    // является ли это число чётным или нечётным.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите Ваше число: ");
        int sum = scanner.nextInt();
        if (sum % 2 == 0) {
            System.out.println((sum) + ", Ваше число четное");
        } else if (sum > 0) {
            System.out.println((sum) + ", Ваше число не четное");
        }
        scanner.close();
    }
}