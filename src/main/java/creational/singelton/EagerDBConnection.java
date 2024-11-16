package creational.singelton;

/**
 * 1) Created initialized the object itself as private static so that it is associated with class and cannot be
 * accessible outside the class .
 * 2) Created private constructor so that nobody is allowed to create the object of the class using "new" Keyword.
 * 3) Created a public static method so that if owner classes needed the object of this class , they can access it via
 * this method which return this same object only.
 *
 * So,this is eager initialization as we're creating initialising the object as soon as the program starts even
 * if it isn't being currently used by others.
 *
 * So , Bill Pugh Solution rectified the issue of eager initialization by putting the object inside private static
 * nested class because this nested class
 */
public class EagerDBConnection {

    private static class DBConnectionHelper {
        private static final EagerDBConnection INSTANCE = new EagerDBConnection();
    }

    private EagerDBConnection(){}

    public static EagerDBConnection getInstance(){
        return DBConnectionHelper.INSTANCE;
    }

}
