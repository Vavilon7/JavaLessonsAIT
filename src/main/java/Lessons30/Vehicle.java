package Lessons30;

abstract class Vehicle {
    private String brand;

//Конструктор абстрактоного класса
    public Vehicle(String brand) {
        this.brand = brand;
    }
    //абстрактный метод
    abstract void start();
     //Конкретный метод
    public void stop(){
        System.out.println("Vehicle stopped ");
    }

    public String getBrand() {
        return brand;
    }
}
