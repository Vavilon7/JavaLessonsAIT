package Lessons281;

public class ElectricBike implements ElectricVehicle,Vehicle {
    @Override
    public void start() {
        System.out.println("Electric Bike is running");
    }

    @Override
    public void stop() {
        System.out.println("Electric Bike is stopped");
    }

    @Override
    public void vehicleWait() {
        System.out.println("Electric Bike is waiting");
    }

    @Override
    public void charge() {
        System.out.println("Electric Bike is charging");
    }
}
