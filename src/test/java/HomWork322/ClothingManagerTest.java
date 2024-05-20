package HomWork322;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClothingManagerTest {
    private ClothingManager clothingManager;

    @BeforeEach
    public void SetUp() {
        clothingManager = new ClothingManager();
    }

    @Test
    void testAddClothingItem() {
        ClothingItem sport = new ClothingItem("шорты", "спорт", "L", 200);
        String addClothingItem = clothingManager.addClothingItem(sport);
        assertEquals("шорты", addClothingItem);
    }

    @Test
    void testRemoveClothingItem() {
        ClothingItem sport = new ClothingItem("шорты", "спорт", "L", 200);
        clothingManager.addClothingItem(sport);
        boolean removeResult = clothingManager.removeClothingItem("шорты");
        assertTrue(removeResult);
        assertFalse(clothingManager.getClothingItems().contains(sport));
        boolean removeNonExistent = clothingManager.removeClothingItem("футболка");
        assertFalse(removeNonExistent);
    }

    @Test
    void findClothingByType() {
        ClothingItem sport1 = new ClothingItem("шорты", "спорт", "L", 200);
        ClothingItem sport2 = new ClothingItem("майка", "спорт", "M", 150);
        ClothingItem classic1 = new ClothingItem("костюм", "классика", "M", 320);
        ClothingItem jeans = new ClothingItem("джинсы", "классика", "S", 212);

        // Добавляем элементы одежды
        clothingManager.addClothingItem(sport1);
        clothingManager.addClothingItem(sport2);
        clothingManager.addClothingItem(classic1);
        clothingManager.addClothingItem(jeans);

        // Ищем элементы по типу "спорт"
        List<ClothingItem> sportsItems = clothingManager.findClothingByType("спорт");
        assertEquals(2, sportsItems.size());
        assertTrue(sportsItems.contains(sport1));
        assertTrue(sportsItems.contains(sport2));

        // Ищем элементы по типу "классика"
        List<ClothingItem> classicItems = clothingManager.findClothingByType("классика");
        assertEquals(2, classicItems.size());
        assertTrue(classicItems.contains(classic1));
        assertTrue(classicItems.contains(jeans));
    }

    @Test
    void findClothingBySize() {

        ClothingItem sport1 = new ClothingItem("шорты", "спорт", "L", 200);
        ClothingItem sport2 = new ClothingItem("майка", "спорт", "M", 150);
        ClothingItem classic1 = new ClothingItem("костюм", "классика", "M", 320);
        ClothingItem jeans = new ClothingItem("джинсы", "классика", "S", 212);
        // Добавляем элементы одежды
        clothingManager.addClothingItem(sport1);
        clothingManager.addClothingItem(sport2);
        clothingManager.addClothingItem(classic1);
        clothingManager.addClothingItem(jeans);

        // Ищем элементы по типу "спорт"
        List<ClothingItem> sportsItems = clothingManager.findClothingByType("спорт");
        assertEquals(2, sportsItems.size());
        assertTrue(sportsItems.contains(sport1));
        assertTrue(sportsItems.contains(sport2));

        // Ищем элементы по типу "классика"
        List<ClothingItem> classicItems = clothingManager.findClothingByType("классика");
        assertEquals(2, classicItems.size());
        assertTrue(classicItems.contains(classic1));
        assertTrue(classicItems.contains(jeans));
    }

    @Test
    void findCheapestItem() {

        ClothingItem sport1 = new ClothingItem("шорты", "спорт", "L", 200);
        ClothingItem sport2 = new ClothingItem("майка", "спорт", "M", 150);
        ClothingItem classic1 = new ClothingItem("костюм", "классика", "M", 320);
        ClothingItem jeans = new ClothingItem("джинсы", "классика", "S", 212);

        // Добавляем элементы одежды
        clothingManager.addClothingItem(sport1);
        clothingManager.addClothingItem(sport2);
        clothingManager.addClothingItem(classic1);
        clothingManager.addClothingItem(jeans);

        // Ищем самый дешевый элемент одежды
        ClothingItem cheapestItem = clothingManager.findCheapestItem();
        assertNotNull(cheapestItem);
        assertEquals(sport2, cheapestItem);

    }

    @ParameterizedTest
    @CsvSource({
            "шорты,     спорт,       L,     200",
            "майка,     спорт,       M,     150",
            "костюм,    классика,    M,     320",
            "джинсы,    классика,    S,     212",
    })
    void testFindCheapestItem(String name, String type, String size, double price) {

        // Добавляем элементы одежды
        clothingManager.addClothingItem(new ClothingItem(name, type, size, price));

        // Проверяем, что метод findCheapestItem возвращает корректный элемент
        ClothingItem cheapestItem = clothingManager.findCheapestItem();
        assertNotNull(cheapestItem);
        assertEquals("майка", cheapestItem.getName());
    }
}


