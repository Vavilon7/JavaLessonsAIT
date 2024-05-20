package Lessons27;

public class CosmeticProduct {
    private String productName;
    private String brand;
    private int price;

    public CosmeticProduct(String productName, String brand, int price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void apply(){
        System.out.println(productName + " от бренда " + brand + " применяйте аккуратно");
    }

    @Override
    public String toString() {
        return "CosmeticProduct{" +
                "productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
