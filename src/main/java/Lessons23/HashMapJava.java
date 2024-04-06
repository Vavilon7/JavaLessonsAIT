package Lessons23;
import java.util.HashMap;
import java.util.Map;


public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Audi", "Deutschland");
        hashMap.put("BMW", "Deutschland");
        hashMap.put("Lada", "Russland");

        if (hashMap.containsKey("Audi")) {
            System.out.println("Audi was found");
        }
        if (hashMap.containsValue("Deutschland")) {
            System.out.println("Deutschland was found");
        }

        System.out.println(hashMap.keySet());

        System.out.println(hashMap.values());

        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.size());

        hashMap.remove("Audi", "Deutschland");

        System.out.println(hashMap.get("BMW"));

        // hashMap.clear();

        System.out.println(hashMap.entrySet());

        //--------for-keys----------
        System.out.println("--------for-----------");
        for (String autoname : hashMap.keySet()) {
            System.out.println(hashMap.get(autoname));
        }
        //--------for-values----------
        System.out.println("--------for-values------------");
        for (String country : hashMap.values()) {
            System.out.println(country);
        }

        //for-keys----an--for-values
        System.out.println("---for-keys----an--for-values-----");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("name-->" + entry.getKey() + " country-->" + entry.getValue());
        }


    }
}


