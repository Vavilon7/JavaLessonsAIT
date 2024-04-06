package HomWork23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class ClothingManager {private HashSet<ClothingItem> collection = new HashSet<>();

    public void addClothingItem(ClothingItem clothingItem) {
        if (clothingItem == null) {
            System.out.println("ERROR !!! Element is null");
        } else {
            boolean addResult = collection.add(clothingItem);
            if (addResult) {
                System.out.println("Closing item " + clothingItem.getName() + " was added to collection");
            } else {
                System.out.println("ERROR !!!");
            }
        }
    }

    public void deleteClothingItem(ClothingItem clothingItem) {
        boolean deleteResult = collection.remove(clothingItem);
        if (deleteResult) {
            System.out.println("Closing item " + clothingItem.getName() + " was removed from collection");
        } else {
            System.out.println("ERROR !!! Element " + clothingItem.getName() + " was not removed");
        }
    }

    public HashSet<ClothingItem> searchByParams(String name, double size, String color, String category) {
        HashSet<ClothingItem> resultSearch = new HashSet<>();
        for (ClothingItem clothingItem : collection) {
            if (clothingItem.getName().equals(name) &&
                    clothingItem.getSize() == size &&
                    clothingItem.getColor().equals(color) &&
                    clothingItem.getCategory().equals(category)) {
                resultSearch.add(clothingItem);
            }
        }
        if (resultSearch.isEmpty()) {
            System.out.println("No elements were found in collection");
        }
        return resultSearch;
    }

    public HashSet<ClothingItem> getCollection() {
        return collection;
    }

    public void  printAllElementsInCollection(){
        System.out.println("-------Elements in collection----------");
        collection.forEach(System.out::println);
        System.out.println("---------------------------------------");
    }
    public void  printAllCategoriesInCollection(){
        System.out.println("-------Categories in collection----------");
        HashSet<String> categories = new HashSet<>();
        for (ClothingItem clothingItem: collection){
            categories.add(clothingItem.getCategory());
        }
        for (String clothingItemString: categories){
            System.out.println(clothingItemString);
        }

    }

    public void sortBySize(){
        ArrayList<ClothingItem> clothingItems = new ArrayList<>(collection);
        clothingItems.sort(Comparator.comparing(ClothingItem::getSize));
        for(ClothingItem item: clothingItems){
            System.out.println(item);
        }
    }

    public void sortByName(){
        ArrayList<ClothingItem> clothingItems = new ArrayList<>(collection);
        clothingItems.sort(Comparator.comparing(ClothingItem::getName));
        for(ClothingItem item: clothingItems){
            System.out.println(item);
        }
    }
}


