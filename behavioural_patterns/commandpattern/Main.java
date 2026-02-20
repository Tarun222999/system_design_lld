package commandpattern;

import commandpattern.ICommand.Command;
import commandpattern.Invoker.Button;
import commandpattern.Reciever.FileSystem;
import commandpattern.concrete.OpenFileCommand;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Command cmd = new OpenFileCommand(fs);

        Button btn = new Button(cmd);
        btn.press();
    }

}
