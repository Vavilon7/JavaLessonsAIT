package AUTO;
import java.util.HashSet;
import java.util.Objects;

public class AutoCons {
    private String model;
    private String version;
    private int battery;
    private Color color;
    private int price;
    private int year;
    public AutoCons(String model, String version, int battery, Color color, int price, int year) {
        this.model = model;
        this.version = version;
        this.battery = battery;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public AutoCons(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getVersion() {
        return version;
    }

    public int getBattery() {
        return battery;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public static HashSet<AutoCons> filterByModel(HashSet<AutoCons> autoConsHashSet, String model, String version) {
        HashSet<AutoCons> filteredObjects = new HashSet<>();

        for (AutoCons autoCons : autoConsHashSet) {
            if (autoCons.getModel().equalsIgnoreCase(model)) {
                filteredObjects.add(autoCons);
            }
        }
        if (filteredObjects.isEmpty()) {
            System.out.println("No properties was found");
        }

        return filteredObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoCons autoCons = (AutoCons) o;
        return Objects.equals(model, autoCons.model) && Objects.equals(version, autoCons.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, version);
    }

    @Override
    public String toString() {
        return "model = '" + model + '\'' +
                ", version = '" + version + '\'' +
                ", battery = " + battery + " кВт/ч " +
                ", color = " + color +
                ", price = " + price +
                ", year = " + year +
                '}';
    }

    /* Mетод исключающий дубликатов*/
    public static void printObjectsInfo(HashSet<AutoCons> hashSetObjects) {
        if (hashSetObjects.isEmpty()) {
            System.out.println("No objects in hashSet to print");
        } else {
            for (AutoCons autoCons : hashSetObjects) {
                System.out.println(autoCons.toString());
            }

        }
    }
}







