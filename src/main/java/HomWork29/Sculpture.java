package HomWork29;

import java.util.Objects;

public class Sculpture extends ArtParams implements Artwork{


    private double weight;

    private Material material;

    public Sculpture(String creator, String name, double weight, Material material) {
        super(creator, name);
        this.weight = weight;
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sculpture " +
                "weight=" + weight +
                ", material=" + material +
                " " + super.toString());
    }

    @Override
    public String getCreator() {
        return super.getCreator();
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "weight=" + weight +
                ", material=" + material +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sculpture sculpture)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(weight, sculpture.weight) == 0 && material == sculpture.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, material);
    }
}

