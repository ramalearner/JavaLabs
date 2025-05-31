package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String []args) {
        // Collection with Generics
        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(1000);
        al.add(234);

//        int i = 100;
        long k = 200_123_3456_6789L;
        // explicit casting is possible as they are compatible types
//        i = (int) k;
        String s = "Pandu";

        // int (primitive type) => Integer (Object) => Auto boxing
        // Integer => int (auto unboxing)
        // float => Float
        // double => Double, boolean => Boolean, char => Char
        // traditional for loop
        for(int i=0; i<al.size(); i++) {
            int x = al.get(i);
            System.out.println(x);
        }
        // for each loop
        for(Integer x:al) {
            System.out.println(x);
        }

        // CRUD => Create, Read, Update and Delete
        // APIs => Perform operations of add, get, set, remove on ArrayList

        List<String> groceryStores1 = new LinkedList<>();
        groceryStores1.add("Baskin Robbins");
        groceryStores1.add("Costco");
        groceryStores1.add("India Bazar");
        groceryStores1.add("Patel Brothers");
        groceryStores1.add("Walmart");


        // Order of Complexity => Space Complexity, Time Complexity
        // ArrayList of 1 Million numbers
        // Space = O(N)
        // Create = O(1) = Fixed number and constant number = O(N) for N elements
        // Read = O(1)
        // Update = O(1)
        // Delete = O(1)
        // Search = O(N) for unordered list
        // Search = O(log N) for ordered list
        // Space = O(N) for linked list
        // Create = O(1)
        // Read = O(N)
        // Update = O(N)
        // Delete = O(N)
        // Search = O(N) for unordered and ordered list

    }
}
