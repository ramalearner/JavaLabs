package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorService {

    public static int multiply(int a, int b) {
        return a*b;
    }
    public static void main(String []args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> rt = executorService.submit(new CallableTask("Rama"));
        Future<String> ht = executorService.submit(new CallableTask("Hari"));
        Future<String> pt = executorService.submit(new CallableTask("Pandu"));
        Future<String>  ut = executorService.submit(new CallableTask("Usha"));
//        rt.get();
        System.out.println(rt.get());
        System.out.println(ht.get());
        System.out.println(pt.get());
        System.out.println(ut.get());
        multiply(20,30);
        System.out.println(multiply(10,30));
        int x = multiply(5, 30);
        System.out.println(x);
        // Following is mandatory
        executorService.shutdown();
    }
}

class CallableTask implements Callable<String> {
    String threadName;

    public CallableTask(String name) {
        threadName = name;
    }
    @Override
    public String call() {
        System.out.println("Inside new style => " + Thread.currentThread().getName()) ;
        return threadName;
    }
}
