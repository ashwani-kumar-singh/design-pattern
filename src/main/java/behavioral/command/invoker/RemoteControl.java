package behavioral.command.invoker;

import behavioral.command.Command;

public class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
