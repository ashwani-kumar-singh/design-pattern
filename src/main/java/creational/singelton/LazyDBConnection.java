package creational.singelton;

import java.util.Objects;

/**
 * It is created to solve the problem of eager initialization where we're creating initializing the object as soon as
 * program starts.
 *
 * So, in this the object will be created only when someone calls the provided method for the first time.
 * After that the same object will be returned if someone needs the object & calls get Instance method.
 *
 * It's disadvantage is that if two threads tries to get the object at then same time , the object is null hence two
 * objects will be created.
 */
public class LazyDBConnection {
    private static LazyDBConnection INSTANCE;

    private LazyDBConnection() {
    }

    public static LazyDBConnection getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new LazyDBConnection();
        }
        return INSTANCE;
    }
}
