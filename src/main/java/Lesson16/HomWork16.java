package Lesson16;

public class HomWork16 {
    public static void main(String[] args) {
        goodsInvoice(50, 44, 22, 35, 41);
        goodsInvoice(25, 44, 12);
        goodsInvoice(36, 15, 55, 46);
    }
    static void goodsInvoice(int... goods) {
        for (int good : goods) {
            System.out.println(good);
        }
        double sum = 0;
        for (int i = 0; i < goods.length; i++) {
            sum = goods[i] + sum;
        }
        double avergage = sum / goods.length;
        double maxGoods = goods[0];
        double minGoods = goods[0];
        for (double good : goods) {
            if (good > maxGoods) {
                maxGoods = good;
            } else if (good < minGoods) {
                minGoods = good;
            }
        }
        System.out.println("Всего : " + sum);
        System.out.println("Максимальное значение " + maxGoods);
        System.out.println("Минимальное значение " + minGoods);
        System.out.println("Среднее значение : " + avergage);
    }

}












