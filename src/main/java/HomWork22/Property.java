package HomWork22;

import java.util.HashSet;
import java.util.Objects;

public class Property {

    private String address;
    private String type;
    private int numbers;

    public Property(String address, String type, int numbers) {
        this.address = address;
        this.type = type;
        this.numbers = numbers;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public int getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return numbers == property.numbers && Objects.equals(address, property.address) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type, numbers);
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", numbers=" + numbers +
                '}';
    }

    interface PropertyFilter {
        HashSet<Property> filter(HashSet<Property> properties);

    }

    public static class FilterByType implements PropertyFilter {
        @Override
        public HashSet<Property> filter(HashSet<Property> properties) {
            HashSet<Property> hashSet = new HashSet<>();
            for (Property property : properties) {
                if (property.getNumbers() > 100) {
                    hashSet.add(property);

                }
            }
            return hashSet;

            }
        }

}
