package Lesson08;

import java.util.Scanner;

public class HomWork02 { /*
   Пользователь вводит число, напечатать табличку умножения для этого числа
Например, если введено 4, нужно напечатать:
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
(и так далее до 10)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int res = i * n;
            System.out.println(i + " * " + n + " = " + res);
        }
    }}

