package structural.proxy;

import java.util.Objects;

public class ProxyImage {
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (Objects.isNull(realImage))
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
