package HomWork23;

import java.util.HashSet;

public class TestClothingManager {
    public static void main(String[] args) {
        ClothingManager clothingManager = new ClothingManager();
        clothingManager.addClothingItem(new ClothingItem("Jeans", 50, "blue", "underwear"));
        clothingManager.addClothingItem(new ClothingItem("Shorts", 50, "blue", "underwear"));
        clothingManager.addClothingItem(new ClothingItem("T-Short", 60, "red", "topwear"));
        clothingManager.addClothingItem(new ClothingItem("Baseball cap", 20, "blue", "hatswear"));
        clothingManager.addClothingItem(new ClothingItem("Rally shorts", 40, "black", "underwear"));
        clothingManager.printAllElementsInCollection();

        clothingManager.printAllCategoriesInCollection();

        System.out.println("-----SortBySize-------");
        clothingManager.sortBySize();
        System.out.println("---------------");

        System.out.println("-----SortByName-------");
        clothingManager.sortByName();
        System.out.println("---------------");

        System.out.println("-----Search-------");
        HashSet<ClothingItem> foundItems = clothingManager.searchByParams("JeansXXL", 50, "blue", "underwear");

        foundItems.forEach(System.out::println);
        System.out.println("------------------");

        clothingManager.deleteClothingItem(new ClothingItem("Shorts", 60, "blue", "underwear"));
        clothingManager.deleteClothingItem(new ClothingItem("Shorts-NBA", 70, "blue", "underwear"));
        clothingManager.printAllElementsInCollection();
    }
}
