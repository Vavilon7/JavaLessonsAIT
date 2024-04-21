package Lessons27;

public class TestCosmeticProduct {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Помада", "MaxFactor", 2, "Red");
        lipstick.apply();
        Mascara mascara = new Mascara("Туш", "MaxFactor", 3, 1);
        mascara.apply();
    }

}
