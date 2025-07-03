package io;

import static java.lang.System.out;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImportDemo {
    public static void main(String []args) {
        out.println("Checking static import");
        out.println(sqrt(100));
        out.println(pow(5,3));
    }
}
