package HomWork22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class AddressDetails {
    public static void main(String[] args) {
        HashSet<Property> propertyHashSet = new HashSet<>();
        Property house = new Property("Victory str. ", "private ", 25);
        Property apartment = new Property("ul. Tsvetochnaya ", "private ", 127);
        Property dormitory = new Property("prosp. Stroiteley ", "state property ", 225);
        Property dormitoryOne= new Property("prosp. Stroiteley ", "state property ", 325);
        propertyHashSet.add(house);
        propertyHashSet.add(apartment);
        propertyHashSet.add(dormitory);
        propertyHashSet.add(dormitoryOne);


        for (Property property : propertyHashSet) {
            System.out.println(property.toString());

        }
        System.out.println("-----------------------");
        {
            propertyHashSet = new Property.FilterByType().filter(propertyHashSet);
            for (Property property : propertyHashSet) {
                System.out.println(property.getNumbers());
            }


            System.out.println("---------------------");
        }
        ArrayList<ArrayList<String>> listOfLists =new ArrayList<>();
        for (Property property : propertyHashSet){
            System.out.println(property.getAddress());
        }
    }
}

