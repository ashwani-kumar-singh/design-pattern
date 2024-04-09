package behavioral.command.reciever;

public class Stereo implements Device {

    private boolean isOn;
    @Override
    public void turnOn() {
        System.out.println("Stereo is now on!");
    }

    @Override
    public void turOff() {
        System.out.println("Stereo is now off!");
    }

    @Override
    public boolean isDeviceOFF() {
        return !isOn;
    }

    public void adjustFrequency() {
        System.out.println("Frequency adjusted");
    }

    @Override
    public void setONFlag() {
        this.isOn = true;
    }

    @Override
    public void setOFFFlag() {
        this.isOn = false;
    }
}
