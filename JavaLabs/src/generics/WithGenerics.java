package generics;

import java.util.*;

class WithGenerics
{
    public static void main(String[] args)
    {
        // Generics
        // 1. They are used when you want to keep the algorithm as data type agnostic
        // 2. Can be used for classes, interfaces and methods
        // 3. Type checking happens at compile time. So removes the chances of ClassCastException
        // 4. It is denoted by <>
        // 5. Usually denoted by a single capital letter
        // 6. Reuse of code across different types
        // 7. It eliminates the need for explicit type casting
        // 8. Creation of generic array is done using "(T[]) new Object[s];". You cannot do new T[s].
        // 9. It can have 1 or more type params as args
        // 10. Specifying type is mandatory on LHS and is optional on RHS
        // 11. You cannot pass primitive types as arguments to generics. Example: ArrayList<int> al2 = new ArrayList<>()
        // 12. If you want a generic type to be subtype of a particular class, use extends.

        // Creating an ArrayList with String specified
        ArrayList <String> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al.add("Sweta");
        al.add("Gudly");

        // Now Compiler doesn't allow this
//        al.add(10);

        String s1 = al.get(0);
        String s2 = al.get(1);
        String s3 = al.get(2);
    }
}
