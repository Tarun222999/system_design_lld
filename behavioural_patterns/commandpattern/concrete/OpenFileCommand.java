package commandpattern.concrete;

import commandpattern.ICommand.Command;
import commandpattern.Reciever.FileSystem;

public class OpenFileCommand implements Command {
    private FileSystem fs;

    public OpenFileCommand(FileSystem fs) {
        this.fs = fs;
    }

    public void exectute() {
        fs.openFile();
    }
}
