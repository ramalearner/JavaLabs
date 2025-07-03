package threads;

public class MyThreadPool {
    public static void main(String []args) {
        for(int i=0; i<20; i++) {
            Thread t = new Thread(new Task());
            t.start();
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside => " + Thread.currentThread().getName());
    }
}
