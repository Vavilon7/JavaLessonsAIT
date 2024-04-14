package HomWork24;

import java.util.HashSet;

public class CollectionConsulting {public static void main(String[] args) {
    HashSet<String[]> collection = new HashSet<>();
    String[] names = new String[]{"Alex", "Anna"};
    String[] nameNew = new String[]{"Alex", "Anna"};
    collection.add(names);
    if(!checkArrays(names,nameNew)){
        collection.add(nameNew);
    }

    System.out.println();


}

    public static boolean checkArrays(String[] array, String[] arrayToCompare) {
        if (array.length != arrayToCompare.length) {
            return false;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (!array[i].equals(arrayToCompare[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

