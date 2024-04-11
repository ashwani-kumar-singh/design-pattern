package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    List<FileSystem> fileSystems = new ArrayList<>();

    public void add(FileSystem file) {
        fileSystems.add(file);
    }

    @Override
    public void ls() {
        fileSystems.forEach(FileSystem::ls);
    }
}
