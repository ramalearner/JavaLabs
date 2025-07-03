package threads;

public class SampleThread2 implements Runnable {
    // Two ways to create threads in Java
    // 1. extends Thread class
    // 2. implements Runnable interface
    @Override
    public void run() {
        for(int i=1; i<=50; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" +  i);
        }
    }

    public static void main(String []args) {
        Thread st1 = new Thread(new SampleThread2());
        Thread st2 = new Thread(new SampleThread2());
        Thread st3 = new Thread(new SampleThread2());
        Thread st4 = new Thread(new SampleThread2());
        Thread st5 = new Thread(new SampleThread2());

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
    }
}
