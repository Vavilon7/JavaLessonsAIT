package Lessons28;

public class Vehicle {
    /*
       Создайте базовый класс `Vehicle` с закрытыми атрибутами `brand`
        и `year`. Добавьте методы для установки и
         получения этих значений.
         Затем создайте производный класс `Car`,
         который наследует `Vehicle` и добавляет
         атрибут `numDoors`. Добавьте методы для
         работы с этим новым атрибутом.
        */
    private String brand;
    private int year;


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

