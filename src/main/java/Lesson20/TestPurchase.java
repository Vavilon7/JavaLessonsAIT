package Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPurchase {
    /*1. Создание списка покупок:
    a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
    b. Создайте метод main для инициализации ArrayList с покупками и заполните его несколькими товарами.
    2. Добавление новых покупок:
    a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
    b. Проверьте работу метода, добавив несколько новых покупок в список.
    3. Вывод списка покупок:
    a. Напишите метод для вывода всех покупок из списка.
    b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
    4. Поиск покупок:
    a. Напишите метод для поиска покупок по названию товара.
    b. Проверьте работу метода, вызвав его для поиска нескольких товаров.
    5. Удаление покупок:
    a. Напишите метод для удаления покупки по её названию.
    b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.*/
    public static void main(String[] args) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        Purchase purchaseOne = new Purchase("Ананас ", 5);
        Purchase purchaseTwo = new Purchase("Cheese ", 3);
        Purchase purchaseThree = new Purchase("Апельсин ", 7.7);
        Purchase purchaseFour = new Purchase("Гранат ", 2.8);
        purchases.add(purchaseOne);
        purchases.add(purchaseTwo);
        purchases.add(purchaseThree);
        purchases.add(purchaseFour);
        Purchase.addPurchase(purchases, "Bier ", 2);
        for (Purchase purchase : purchases) {
            System.out.println(purchase);}

            }
        }




