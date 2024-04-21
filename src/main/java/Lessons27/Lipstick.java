package Lessons27;

public class Lipstick extends CosmeticProduct {
    private String color;

    public Lipstick(String productName, String brand, int price, String color) {
        super(productName, brand, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void apply(){
        System.out.println(getProductName() + " от бренда " + getBrand() + " наносите так, чтобы было видно");
    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "color='" + color + '\'' +
                '}';
    }
}


