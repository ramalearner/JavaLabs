package threads;

public class BufferQueue {
    int n;
    synchronized int get() {
        System.out.println(" Consumed =>" + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Produced =>" + n);
    }
}
