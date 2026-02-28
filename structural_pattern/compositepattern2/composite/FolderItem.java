package structural_pattern.compositepattern2.composite;

import java.util.ArrayList;
import java.util.List;

import structural_pattern.compositepattern2.ifilesystem.FileSystemComponent;

public class FolderItem implements FileSystemComponent {

    private final String folder;
    private final List<FileSystemComponent> files = new ArrayList<>();

    public FolderItem(String name) {
        this.folder = name;
    }

    public String getName() {
        return folder;
    }

    public void add(FileSystemComponent file) {
        files.add(file);
    }

    public void remove(FileSystemComponent file) {
        files.remove(file);
    }

    public void showDetails(String indent) {
        System.out.println(indent + "+ " + folder + "/");
        for (FileSystemComponent f : files) {
            f.showDetails(indent + "  ");
        }
    }

    public int getSize() {
        int total = 0;
        for (FileSystemComponent f : files) {
            total += f.getSize();
        }
        return total;
    }
}
