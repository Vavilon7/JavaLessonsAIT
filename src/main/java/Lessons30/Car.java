package Lessons30;

public class Car extends Vehicle  {
    public Car(String brand) {
        super(brand);
    }
    @Override
    void start() {
        System.out.println(" Car " + getBrand() + " is running ");
    }
}
