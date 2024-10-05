package HomWork22;
import java.util.HashSet;

public class TestProperty {
    public static void main(String[] args) {
    HashSet<Property> properties = new HashSet<>();
    HashSet<Property> propertiesNew = new HashSet<>();
    Property propertyCommercial = new Property ( "Würzburg, Mutterstr. 56", "commercial");
    propertiesNew.add(propertyCommercial);
    Property propertyHouse = new Property ("Berlin, Maxstr. 12", "house");
    Property propertyHouseDuplicat = new Property ("Berlin, Maxstr. 12", "house");
    Property propertyApartment = new Property ("München, Mariaweg. 12", "apartment");

    properties.add(propertyHouse);
    properties.add(propertyHouseDuplicat);
    properties.add(propertyApartment);
    properties.add(propertyCommercial);

    Property.printObjectsInfo(properties);

    HashSet<Property> resultSearch = Property.filterByType (properties, "apartment");
    Property.printObjectsInfo(resultSearch);

    HashSet<Property> resultCompare = Property.compareHashSetObjects(properties, propertiesNew);
    Property.printObjectsInfo(resultCompare);
}
}


