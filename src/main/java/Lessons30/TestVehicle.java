package Lessons30;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car(" Audi ");
        Vehicle bike = new Motorcycle(" БМВ ");
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}

