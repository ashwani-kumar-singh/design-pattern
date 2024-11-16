package creational.singelton;

import java.util.Objects;

/**
 * It overcomes the problem in Synchronized method i. e slowness .
 * So, here the synchronized is not on method, but on the block. Because of synchronized on the block ,the lock
 * unlock once only .
 *
 * Its disadvantage is that there is a memory issue in this.
 *
 * Let's take example of  2 core processor, each core has its dedicated L , Cache which is used to cache the objects
 * and time to time it syncs with memory.
 *
 * Now let's say Thread T,'s computation is happening at core-1, and it enters the method to get object.
 *
 * Since it'll get null for the first time an object will be created temporarily stored in cache. At this point
 * Thread to whose computation is happening at Core-2 tries target the object. Now we do have the object created but
 * not yet synced with the memory.
 * Hence, a second object will be created because the object is not there in memory. Therefore two objects are created
 * despite double-checked locking.
 * This is solved using the volatile keyword. Volatile Keyword means that the object will be created in memory instead
 * of cache.
 *
 * So, if we've created any object volatile, any read/write operation happening to this always happens in memory.
 * Since we're using memory synchronized, this is also a bit slow.
 */
public class DoubleLockingDBConnection {
    private static volatile DoubleLockingDBConnection INSTANCE;

    private DoubleLockingDBConnection() {
    }

    public static DoubleLockingDBConnection getInstance() {
            if (Objects.isNull(INSTANCE)) {
                synchronized (DoubleLockingDBConnection.class) {
                    if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new DoubleLockingDBConnection();
                }
            }
        }
        return INSTANCE;
    }
}
