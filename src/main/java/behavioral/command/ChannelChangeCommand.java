package behavioral.command;

import behavioral.command.reciever.TV;

public class ChannelChangeCommand implements Command {
    private final TV tv;

    public ChannelChangeCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // tv must be on - series of command
        if(tv.isDeviceOFF()) {
            tv.turnOn();
        }
        tv.changeChannel();
    }
}
