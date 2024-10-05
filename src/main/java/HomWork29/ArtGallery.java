package HomWork29;

import java.util.HashSet;

public class ArtGallery {
    private HashSet<Artwork> allArtGallery = new HashSet<>();

    public HashSet<Artwork> getAllArtGallery() {
        return allArtGallery;
    }

    // добавление арт объектов
    public void addArtwork(Artwork artwork) {
        allArtGallery.add(artwork);
        System.out.println("Artwork" + artwork.toString() + " was added");
    }

    // удаление арт объектов
    public void removeArtwork(Artwork artwork) {
        System.out.println("Removal of artwork");
        boolean removeCheck = allArtGallery.remove(artwork);
        if (removeCheck) {
            System.out.println("Artwork was removed");
        } else {
            System.out.println("Artwork not in the list.");
        }
    }

    // поиск арт объектов по создателю
    public void findArtwork(String creator) {
        boolean checkCreator = false;
        System.out.println("Search artwork by creator:" + creator);
        for (Artwork artwork : allArtGallery) {
            if (artwork.getCreator().equalsIgnoreCase(creator)) {
                artwork.displayInfo();
                checkCreator = true;
            }
        }
        if (!checkCreator) {
            System.out.println("Creator " + creator + " Nothing found!");
        }
    }

    // вывод на экран всех арт объектов
    public void displayAllArtworks() {
        System.out.println("All artwork printing:");
        for (Artwork artwork : allArtGallery) {
            artwork.displayInfo();
        }
    }

    // фильтрация произведений по типу
    //фильтарция по типу картины скульптуры
    public HashSet<Artwork> filterByArtType(String type) {
        HashSet<Artwork> filteredList = new HashSet<>();
        for (Artwork artwork : allArtGallery) {
            if (artwork.getClass().getSimpleName().equals(type)) {
                filteredList.add(artwork);
            }
        }
        if (filteredList.isEmpty()) {
            System.out.println("Objects of type " + type + " was not found!");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println(filteredList.size() + " objects of type " + type + " was found");
            System.out.println("----------------------------------------------");
        }
        return filteredList;
    }
}
