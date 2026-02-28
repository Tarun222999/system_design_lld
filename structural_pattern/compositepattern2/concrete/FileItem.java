package structural_pattern.compositepattern2.concrete;

import structural_pattern.compositepattern2.ifilesystem.FileSystemComponent;

public class FileItem implements FileSystemComponent {
    private final String name;
    private final int size;

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void showDetails(String indent) {
        System.out.println(indent + "- " + name + " (" + size + "KB)");
    }

    public int getSize() {
        return size;
    }
}
