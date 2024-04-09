package behavioral.command;

import behavioral.command.reciever.Device;

public class TurnOnCommand implements Command {

    private final Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
        device.setONFlag();
    }

}
