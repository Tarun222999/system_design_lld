package structural_pattern.compositepattern2.drive;

import structural_pattern.compositepattern2.composite.FolderItem;
import structural_pattern.compositepattern2.concrete.FileItem;
import structural_pattern.compositepattern2.ifilesystem.FileSystemComponent;

public class Main {
    public static void main(String[] args) {
        FolderItem root = new FolderItem("root");
        FolderItem docs = new FolderItem("docs");
        FolderItem photos = new FolderItem("photos");
        FolderItem trip = new FolderItem("trip");

        FileSystemComponent resume = new FileItem("resume.pdf", 120);
        FileSystemComponent notes = new FileItem("notes.txt", 30);
        FileSystemComponent img1 = new FileItem("img1.jpg", 450);
        FileSystemComponent img2 = new FileItem("img2.jpg", 480);
        FileSystemComponent todo = new FileItem("todo.txt", 10);

        docs.add(resume);
        docs.add(notes);

        trip.add(img1);
        trip.add(img2);
        photos.add(trip);

        root.add(docs);
        root.add(photos);
        root.add(todo);

        root.showDetails("");

        System.out.println("Total root size: " + root.getSize() + "KB");
        System.out.println("Total docs size: " + docs.getSize() + "KB");
    }
}
