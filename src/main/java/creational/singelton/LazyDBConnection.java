package creational.singelton;

import java.util.Objects;

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
