package HomWork322;

import java.util.ArrayList;
import java.util.List;

public class ClothingManager {
    private List<ClothingItem> clothingItems;

    public ClothingManager() {
        this.clothingItems = new ArrayList<>();
    }

    public String addClothingItem(ClothingItem item) {
        clothingItems.add(item);
        return item.getName();
    }

    public List<ClothingItem> getClothingItems() {
        return clothingItems;
    }

    public List<ClothingItem> findClothingByType(String type) {
        List<ClothingItem> result = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getType().equalsIgnoreCase(type)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<ClothingItem> findClothingBySize(String size) {
        List<ClothingItem> result = new ArrayList<>();
        for (ClothingItem item : clothingItems) {
            if (item.getType().equalsIgnoreCase(size)) {
                result.add(item);
            }
        }
        return result;
    }

    public ClothingItem findCheapestItem() {
        if (clothingItems.isEmpty()) {
            return null;
        }
        ClothingItem cheapestItem = clothingItems.get(0);
        for (ClothingItem item : clothingItems) {
            if (item.getPrise() < cheapestItem.getPrise()) {
                cheapestItem = item;
            }
        }
        return cheapestItem;
    }

    public boolean removeClothingItem(String name) {
        for (ClothingItem item : clothingItems) {
            if (item.getName().equals(name)) {
                clothingItems.remove(item);
                return true;
            }
        }
        return false;
    }
}
