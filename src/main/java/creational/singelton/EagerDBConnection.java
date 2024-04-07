package creational.singelton;

public class EagerDBConnection {

    private static EagerDBConnection INSTANCE = new EagerDBConnection();

    private EagerDBConnection(){}

    public static EagerDBConnection getInstance(){
        return INSTANCE;
    }

}
