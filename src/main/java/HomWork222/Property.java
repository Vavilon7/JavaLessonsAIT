package HomWork222;

import java.util.HashSet;
import java.util.Objects;

public class Property {

    private String address;

    private String type;


    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public static HashSet<Property> filterByType(HashSet<Property> propertyHashSet, String type){
        HashSet<Property> filteredObjects = new HashSet<>();
        if(propertyHashSet.isEmpty()){
            System.out.println("Property hashSet is empty");
        }
        else {
            for (Property property : propertyHashSet) {
                if (property.getType().equalsIgnoreCase(type)) {
                    filteredObjects.add(property);
                }
            }
            if(filteredObjects.isEmpty()){
                System.out.println("No properties was found");
            }
        }
        return filteredObjects;
    }

    public static HashSet<Property> compareHashSetObjects(HashSet<Property> hashSetOne,
                                                          HashSet<Property> hashSetTwo){
        HashSet<Property> result = new HashSet<>(hashSetOne);
        result.removeAll(hashSetTwo);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(address, property.getAddress()) && Objects.equals(type, property.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void printObjectsInfo(HashSet<Property> hashSetObjects) {
        if (hashSetObjects.isEmpty()) {
            System.out.println("No objects in hashSet to print");
        } else {
            for (Property property : hashSetObjects) {
                System.out.println(property.toString());
            }
        }
    }
}


