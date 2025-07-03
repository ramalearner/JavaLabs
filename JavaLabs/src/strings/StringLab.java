package strings;

import java.util.StringTokenizer;

public class StringLab {
    public static void main(String []args) {

        // Write a string program that uses the following API
        // equals, equalsIgnoreCase, toCharArray, substring, toLowerCase
        // toUpperCase, split, trim, indexOf, lastIndexOf

        StringTokenizer st = new StringTokenizer("I:live:in:Frisco",":",false);
        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }

        // String is immutable/non-changeable but StringBuffer is mutable / changeable
        // Thread safe => More than one thread can access / edit at the same time
        // Both safe and buffer has letter f and that is thread safe
        StringBuffer sb1 = new StringBuffer();
        sb1.append("I ");
        sb1.append("love ");
        sb1.append("fruits");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println("Reversed="+sb1);

        // Non-Thread safe => More than one thread CANNOT edit at the same time
        StringBuilder sb2 = new StringBuilder();
        sb2.append("I ");
        sb2.append("love ");
        sb2.append("fruits");
        System.out.println(sb2);

        StringBuilder x = new StringBuilder("I live in Bangalore");
        String []x2 = x.toString().split(" ");
        x = new StringBuilder();
        for(String temp:x2) {
            x.append(temp);
        }
        System.out.println(x);

    }
}
