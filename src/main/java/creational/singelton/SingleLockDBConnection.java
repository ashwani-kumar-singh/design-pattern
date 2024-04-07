package creational.singelton;

import java.util.Objects;

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
