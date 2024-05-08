package HomWork29;

import java.util.Objects;

public class ArtParams {
    private String creator;

    private String name;

    public ArtParams(String creator, String name) {
        this.creator = creator;
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArtParams{" +
                "creator='" + creator + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtParams artParams)) return false;
        return Objects.equals(getCreator(), artParams.getCreator()) && Objects.equals(getName(), artParams.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreator(), getName());
    }

}
