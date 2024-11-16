package creational.singelton;

import java.util.Objects;

/**
 * It is used to overcome the problem of Lazy Initialization where two objects might be created if two threads tries
 * to get the object for the first time.
 *
 * So, this synchronized keyword does two things :
 * - put a lock on the method.
 * - unlock the method.
 * So, only one thread is allowed to enter the method at a time. Hence, the possibility of 2 objects being created
 * will be zero.
 * The only disadvantage o using synchronized is that it is very, very slow and generally not used.
 */
public class SingleLockDBConnection {
    private static SingleLockDBConnection INSTANCE;

    private SingleLockDBConnection(){}

    public synchronized static SingleLockDBConnection getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingleLockDBConnection();
        }
        return INSTANCE;
    }
}
