package Lesson11;

import java.util.Scanner;

    public class HomWork {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Введите марку автомобиля: ");
            String carBrand = scanner.next().trim();
            System.out.println("Введите четырехзначный год выпуска : ");
            String countryOfOrigin;
            String carInfo;
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка, введите число");
                scanner.next();
            }
            int year = scanner.nextInt();
            switch (carBrand.toLowerCase()) {
                case "ford":
                    countryOfOrigin = "США";
                    if (year > 1990) {
                        carInfo = "Огромные внедорожники, дешевый бензин";
                    } else {
                        carInfo = "Эпоха гибридов, Тесла, ИИ в авто";
                    }
                    break;
                case "volvo":
                    countryOfOrigin = "Швеция";
                    carInfo = year > 2002 ? "Выход модели XC 90" : "Покупали модель S 60";
                    break;
                default:
                    countryOfOrigin = "Не нейдена";
                    carInfo = "Нет информации";
                    break;
            }
            printCarData(countryOfOrigin, carInfo);

        }

        public static void printCarData(String country, String info) {
            System.out.println("Страна производитель " + country);
            System.out.println("Дополнительная информация " + info);
        }
    }


