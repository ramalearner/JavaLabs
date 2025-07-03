package threads;

public class Consumer implements Runnable {
    // synchronous => waiting / blocked on each other
    // asynchronous => not blocked on each other. Each party sends / receives at their convenience

    BufferQueue q;
    Thread consumerThread;
    int count;
    Consumer(BufferQueue bufferQueue) {
        q = bufferQueue;
        consumerThread = new Thread(this,"Consumer");
    }

    @Override
    public void run() {
        int i=0;

        while (count<10) {
            q.get();
        }
        count++;

    }
}
