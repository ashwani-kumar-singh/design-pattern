package structural.composite;

public class File implements FileSystem {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println(fileName);
    }
}
