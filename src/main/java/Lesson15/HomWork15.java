package Lesson15;

public class HomWork15 {
    public static void main(String[] args) {

        //Создание массивов
        String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
        String[] animalSounds = {"РРРРРы", "Тутуту", "ОААААА"};

        printAnimalSounds(animalSpecies, animalSounds);
        System.out.println("-----");
        findAnimalSound("Левро", animalSpecies, animalSounds);
    }

    //Вывод информации о животных
    public static void printAnimalSounds(String[] animals, String[] sounds) {
        for (int i = 0; i < animals.length; i++) {
            String animalString = animals[i];
            String animalSoundString = sounds[i];
            System.out.println(animalString + " " + animalSoundString);
        }
    }

    //Поиск животного по названию
    public static void findAnimalSound(String animal, String[] animals, String[] sounds) {
        boolean found = false;
        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                String sound = sounds[i];
                System.out.println(sound);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Животное " + animal + " не найдено !!!");
        }


        //-----2------
        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                String sound = sounds[i];
                System.out.println(sound);
                break;
            }
            if (i == animals.length-1){
                System.out.println("Животное " + animal + " не найдено !!!");
            }
        }
    }

    // == !=    !a.equals(b)
}



