package Lessons281;

public class Smartphone implements Chargeable, Connectable, GPSable{
    @Override
    public void charge() {
        System.out.println("Smartphone charge");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone connect");
    }


    @Override
    public String getLocation() {
        return "Location ";
    }
}
