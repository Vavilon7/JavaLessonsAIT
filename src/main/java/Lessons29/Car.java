package Lessons29;

public class Car implements Vehicle{


    public void start() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    public void carInfo(){
        System.out.println("Car is carInfo");
    }

    @Override
    public void vehicleWait(){
        System.out.println("Car is waiting");
    }
}

