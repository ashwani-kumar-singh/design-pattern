package behavioral.command;

import behavioral.command.reciever.Stereo;

public class AdjustFrequencyCommand implements Command {

    private final Stereo stereo;

    public AdjustFrequencyCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        // stereo must be on - series of command
        if(stereo.isDeviceOFF()) {
            stereo.turnOn();
        }
        stereo.adjustFrequency();
    }
}
