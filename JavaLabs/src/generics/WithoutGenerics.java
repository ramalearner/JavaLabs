package generics;

import java.util.*;

// Java program to demonstrate that NOT using
// generics can cause run time exceptions


class WithoutGenerics
{
    public static void main(String[] args)
    {
        // Creating an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Teja");
        al.add("Pandu");
        al.add(10); // Compiler allows this

        // You can assign derived object to base object BUT NOT VICE VERSA
        Object s1 = (String) al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }
}
