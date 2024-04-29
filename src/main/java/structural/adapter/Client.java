package structural.adapter;

/**
 *  Structural Design Pattern: This provides a way to combine or arrange different classes or objects
 *  to form a complex or bigger structure to solve a particular requirement.
 *
 * Adapter Design Pattern: It acts as a bridge between two incompatible interfaces, making them
 * work together. This pattern involves a single class, known as the adapter, which is
 * responsible for joining functionalities of independent or incompatible interfaces.
 *
 * @link: <a href="https://www.geeksforgeeks.org/adapter-pattern/">...</a>
 */
public class Client {

    public static void main(String[] args) {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        Volt v3 = sockAdapter.get3Volt();
        Volt v12 = sockAdapter.get12Volt();
        Volt v120 = sockAdapter.get120Volt();
        System.out.println("v3 volts using Object Adapter=" + v3.getVolt());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolt());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolt());
    }

}
