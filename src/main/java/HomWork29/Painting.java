package HomWork29;

import java.util.Objects;

public class Painting extends ArtParams implements Artwork
{
    private PaintType paintType;

    private String paintSize;

    public Painting(String creator, String name, PaintType paintType, String paintSize) {
        super(creator, name);
        this.paintType = paintType;
        this.paintSize = paintSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painting{" +
                "paintType=" + paintType +
                ", paintSize='" + paintSize + '\'' +
                "} " + super.toString());
    }


    @Override
    public String getCreator() {
        return super.getCreator();
    }

    @Override
    public String toString() {
        return "Painting{" +
                "paintType=" + paintType +
                ", paintSize='" + paintSize + '\'' +
                "} " + super.toString();
    }

    public PaintType getPaintType() {
        return paintType;
    }

    public void setPaintType(PaintType paintType) {
        this.paintType = paintType;
    }

    public String getPaintSize() {
        return paintSize;
    }

    public void setPaintSize(String paintSize) {
        this.paintSize = paintSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Painting painting)) return false;
        if (!super.equals(o)) return false;
        return getPaintType() == painting.getPaintType() && Objects.equals(getPaintSize(), painting.getPaintSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPaintType(), getPaintSize());
    }
}
