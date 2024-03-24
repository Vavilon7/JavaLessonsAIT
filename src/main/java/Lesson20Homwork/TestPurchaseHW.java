package Lesson20Homwork;

import java.util.ArrayList;

public class TestPurchaseHW {
    public static void main(String[] args) {
        ArrayList<PurchaseHW> goods = new ArrayList<>();
        PurchaseHW purchaseHWOne = new PurchaseHW("Ananas", 7.15); // создали объект класса
        PurchaseHW purchaseHWTwo  = new PurchaseHW("Orange", 9.57);// создали еще один объект класса

        goods.add(purchaseHWOne);
        goods.add(purchaseHWTwo);


        PurchaseHW.addPurchaseInList(goods, "Tomato", 4.10);
        PurchaseHW.addPurchaseInList(goods, "Kartofeln", 2.51);
        PurchaseHW.addPurchaseInList(goods, "Zitrone", 6.77);

        // System.out.println(goods);

        PurchaseHW.printPurchase(goods);
        PurchaseHW.searchPurchase(goods, "Kiwi");
        PurchaseHW.cleanPurchase(goods, "Mango");
        PurchaseHW.printPurchase(goods); // еще раз выводу списко на экран для проверки удаления товара.
    }
}