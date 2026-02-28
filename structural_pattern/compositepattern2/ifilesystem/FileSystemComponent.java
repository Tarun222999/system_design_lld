package structural_pattern.compositepattern2.ifilesystem;

public interface FileSystemComponent {
    String getName();

    void showDetails(String indent);

    int getSize();
}
