package structural.composite;

/**
 * The Composite Design Pattern: It lets you compose objects into tree-like structures to represent
 * part-whole hierarchies. It allows clients to treat individual objects and compositions of objects
 * uniformly. In other words, whether dealing with a single object or a group of objects (composite),
 * clients can use them interchangeably.
 *
 * @link : <a href="https://www.geeksforgeeks.org/composite-design-pattern-in-java/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        Directory parentDir = new Directory();
        File file = new File("file_1.jpg");
        parentDir.add(file);

        Directory childDir = new Directory();
        childDir.add(new File("file_2.txt"));
        childDir.add(new File("file_3.png"));

        parentDir.add(childDir);
        System.out.println("************************** list file *****************************");
        file.ls();
        System.out.println("************************** list directory ************************");
        parentDir.ls();
    }
}
