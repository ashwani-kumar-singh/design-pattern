package structural.proxy;

/**
 * This pattern is useful when you want to add an extra layer of control over access to an object.
 * The proxy acts as an intermediary, controlling access to the real object
 *
 * Advantages: Lazy Loading, Protection Proxy, Access Control, Caching, Logging and Monitoring.
 * @link: <a href="https://www.geeksforgeeks.org/proxy-design-pattern/">...</a>
 */
public class Client {

    public static void main(String[] args) {

        // Image will be loaded from disk only when display() is called
        System.out.println("First Call | Loading from Disk: No Cache");
        ProxyImage image = new ProxyImage("file_name.png");
        image.display();

        // Image will not be loaded again, as it has been cached in the Proxy
        System.out.println("Second Call | No Loading from Disk: Proxy Cache is used");
        image.display();
    }
}
