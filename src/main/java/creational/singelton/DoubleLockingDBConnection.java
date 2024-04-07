package creational.singelton;

import java.util.Objects;

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
