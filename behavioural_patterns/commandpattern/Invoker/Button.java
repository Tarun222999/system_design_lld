package commandpattern.Invoker;

import commandpattern.ICommand.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.exectute();
    }

}
