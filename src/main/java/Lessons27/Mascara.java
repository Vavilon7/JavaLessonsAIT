package Lessons27;

public class Mascara extends CosmeticProduct {
    private int volumeEffect;

    public Mascara(String productName, String brand, int price, int volumeEffect) {
        super(productName, brand, price);
        this.volumeEffect = volumeEffect;
    }

    public int getVolumeEffect() {
        return volumeEffect;
    }

    @Override
    public void apply(){
        System.out.println(getProductName() + " от бренда " + getBrand() + " наносите туш только на ресницы");
    }

    @Override
    public String toString() {
        return "Mascara{" +
                "volumeEffect=" + volumeEffect +
                '}';
    }

}
