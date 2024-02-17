package lesson06;

import javax.xml.transform.Result;
import java.util.Scanner;

public class HonWork06 {
    //Напишите программу, которая запрашивает у пользователя два числа и выводит их сумму.//
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите Ваше первое число: ");
        int ageOne = scanner.nextInt();
        System.out.println("Введите Ваше второе число: ");
        long ageTwo = scanner.nextInt();
        {
            System.out.println("Ваша сумма составляет " +(ageOne + ageTwo));
        }
        scanner.close();
}
}