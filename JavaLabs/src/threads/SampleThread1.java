package threads;

import java.util.ArrayList;

public class SampleThread1 extends Thread {
    // Two ways to create threads in Java
    // 1. extends Thread class
    // 2. implements Runnable interface
    @Override
    public void run() {
        for(int i=1; i<=50; i++) {
            System.out.println(getName() + "=>" +  i);
        }
    }

    public static void main(String []args) {
        SampleThread1 st1 = new SampleThread1();
        SampleThread1 st2 = new SampleThread1();
        SampleThread1 st3 = new SampleThread1();
        SampleThread1 st4 = new SampleThread1();
        SampleThread1 st5 = new SampleThread1();

        // You should never call run() directly to start a thread in Java
        // You must always call start() to start a thread in Java
        st1.start();
        System.out.println();
        st2.start();
        System.out.println();
        st3.start();
        System.out.println();
        st4.start();
        System.out.println();
        st5.start();

        Integer i = 100; // autoboxing, promoting primitive type int to Integer wrapper class
        Long l = 1000L;

        // Resizeable array
        ArrayList<Integer> x = new ArrayList<>();
    }
}
