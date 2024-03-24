package Lesson20Homwork;

import java.util.ArrayList;

public class PurchaseHW {
    private String itemName;
    private double price;

    public PurchaseHW(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    // static позволяет вызвать метод класса. Без статика этот метод вызывается только у объекта класса.
    public static void addPurchaseInList(ArrayList<PurchaseHW> list, String name, double price) {
        list.add(new PurchaseHW(name, price)); // добавляем в лист созданный объект класса Purchase
        // и передаем для конструктора параметр name & price

    }

    @Override
    public String toString() {
        return itemName + " " + price;
    }

    public static void printPurchase(ArrayList<PurchaseHW> list) {
        for (PurchaseHW good : list) {
            System.out.println(good.getItemName() + " " + good.getPrice());
        }
    }

    public static void searchPurchase(ArrayList<PurchaseHW> list, String name) {
        boolean isName = false;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getItemName())) { // Сравниваем входящее имя с:
                // 1. объектами (вытаскиваем коробку под индексом i, и потом вытаксиваем имя из коробки.
                System.out.println("Покупка найдена!");
                isName = true;
            }
        }
        if (!isName) {
            System.out.println("Покупка не найдена!");
        }
    }

    public static void cleanPurchase(ArrayList<PurchaseHW> list, String name) {
        boolean isRemove = false;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getItemName())) {
                list.remove(i);
                System.out.println("Покупка " + name + " удалена из списка!");
                isRemove = true;
            }
        }
        if (!isRemove) {
            System.out.println("Покупка не найдена!");
        }
    }
}

