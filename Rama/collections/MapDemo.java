package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String []args) {
        Map<String, String> testMap = new HashMap<>();

        // Insert / update
        testMap.put("Texas", "Austin");
        testMap.put("AP", "Amaravathi");
        testMap.put("CA", "Sacremento");
        testMap.put("KA", "Bangalore");
        testMap.put("TS", "Hyderabad");
        testMap.put("MH", "Mumbai");
        testMap.put("TN", "Chennai");
        testMap.put("ND", "Delhi");
        testMap.put("UP", "Lucknow");
        testMap.put("Bihar", "Patna");

        // Traverse a map
        for(String state:testMap.keySet()) {
            System.out.println("State:"+state+",capital:"+testMap.get(state));
        }

        // Removal

//        testMap.remove("Texas");

        // Traverse a map
        for(String state:testMap.keySet()) {
            System.out.println("Second round, State:"+state+",capital:"+testMap.get(state));
        }

        System.out.println(testMap.containsKey("Texas"));

        // For every key, it generates a hash code
        // Hash code can be same for some keys
        // It generates array of hash codes where each array[hash code] points to head of the linked list
        // this linked list contains all the nodes that have equal hash code

        // Teja => 20+5+10+1 % 5= 36 = 1
        // Rama => 18+1+12+1 % 5 = 32 = 2
        // Pandu => 16+1+13+4+.. % 5 = 36 = 1

        testMap = new LinkedHashMap<>();
        // 1. Linked List : Only has keys and only to know the order of insertion
        // 2. Hash Map : For get operations, it just goes to hash map and then locates the bucket based on hash code and then get the value
        testMap.put("Texas", "Austin");
        testMap.put("AP", "Amaravathi");
        testMap.put("CA", "Sacremento");
        testMap.put("KA", "Bangalore");
        testMap.put("TS", "Hyderabad");
        testMap.put("MH", "Mumbai");
        testMap.put("TN", "Chennai");
        testMap.put("ND", "Delhi");
        testMap.put("UP", "Lucknow");
        testMap.put("Bihar", "Patna");

        for(String state:testMap.keySet()) {
            System.out.println("third round using linkedhashmap, State:"+state+",capital:"+testMap.get(state));
        }

    }


}
