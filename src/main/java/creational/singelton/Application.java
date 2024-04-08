package creational.singelton;
/**
 * Creation Design Pattern: It provides various object creation mechanisms, which increase
 * flexibility and reuse of existing code.
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

// https://refactoring.guru/design-patterns/singleton
public class Application {

    public static void main(String[] args) {
        System.out.println("Eager Initialization: " + EagerDBConnection.getInstance().hashCode());
        System.out.println("Lazy Initialization : " + LazyDBConnection.getInstance().hashCode());
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            IntStream.of(1, 2, 3, 4, 5).forEach(i -> {
                System.out.println("Single lock Initialization (" + i + ") : " +
                        SingleLockDBConnection.getInstance().hashCode());
                System.out.println("Double lock Initialization (" + i + ") : " +
                        DoubleLockingDBConnection.getInstance().hashCode());
            });
        });
        executor.shutdown();
    }
}
