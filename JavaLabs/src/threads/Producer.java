package threads;

public class Producer implements Runnable {
    BufferQueue q;
    Thread prodThread;
    int count;
    Producer(BufferQueue bufferQueue) {
        q = bufferQueue;
        prodThread = new Thread(this,"Producer");
    }

    @Override
    public void run() {
        int i=0;

        while (count<10) {
            q.put(i++);
        }
        count++;
    }
}
