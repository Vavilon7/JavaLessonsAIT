package Lessons281;

public interface Vehicle {

    void start();
    void stop();
    void vehicleWait();

    default  void displayVehicleStatus(){
        System.out.println("Vehicle status: " + this.getClass().getSimpleName());
    }
}
