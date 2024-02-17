package lesson06;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите имя: ");
        String name = scanner.next();
        if(age < 16){
            System.out.println(name + ", вы несовершеннолетний(/яя)");
        }
        else {
            System.out.println(name + ", вы совершеннолетний(/яя)");
        }
        scanner.close();
    }
}

