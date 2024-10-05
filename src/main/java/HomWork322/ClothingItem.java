package HomWork322;

public class ClothingItem {
    String name;
    String type;
    String size;
    double prise;

    public ClothingItem(String name, String type, String size, double prise) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
