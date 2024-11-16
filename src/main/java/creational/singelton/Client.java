package creational.singelton;
/**
 * Creation Design Pattern: It provides various object creation mechanisms, which increase
 * flexibility and reuse of existing code.
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

/**
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a
 * global access point to this instance.
 *
 * Different ways of creating Singleton Class :
 * -Eager Initialization
 * -Lazy Initialization
 * -Synchronization Block
 * -Double Check Lock (there is a memory issue, resolved through Volatile instance variable)
 * - Bill Pugh Solution
 * - Enum Singleton - As we know , in Enum , all constructors are private only one object
 *  of enum is created per JVM . So by default enum are singleton only
 *
 * @link: <a href="https://refactoring.guru/design-patterns/singleton">...</a>
 */
//
public class Client {

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
