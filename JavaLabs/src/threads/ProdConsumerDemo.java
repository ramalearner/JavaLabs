package threads;

public class ProdConsumerDemo {
    public static void main(String []args) {
        BufferQueue bufferQueue = new BufferQueue();

        Producer p = new Producer(bufferQueue);
        Consumer c = new Consumer(bufferQueue);

        p.prodThread.start();
        c.consumerThread.start();
    }
}
