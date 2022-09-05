package ex4_Refactoring;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Fibonacci {

    private ExecutorService executor;

    public Future<Long> beregn(int n) {
        Callable<Long> fibCallable = new Callable<>() {
            @Override
            public Long call() {
                return new Fibonacci().fib(n);
            }
        };

        // Oppretter tråder om nødvendig
        executor = Executors.newCachedThreadPool();
        // Starter call()
        return executor.submit(fibCallable);
    }

    public void shutDown() {
        executor.shutdown();
    }

    public long fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}