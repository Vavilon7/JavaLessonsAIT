package HomWork23;

import java.util.Objects;

public class ClothingItem {private String name;

    private double size;

    private  String color;

    private String category;


    public ClothingItem(String name, double size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothingItem that = (ClothingItem) o;
        return Double.compare(size, that.size) == 0 &&
                Objects.equals(color, that.color) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, category);
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}


