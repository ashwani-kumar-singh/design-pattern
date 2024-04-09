package behavioral.command.reciever;

public class TV implements Device {
    private boolean isOn;
    @Override
    public void turnOn() {
        System.out.println("TV is now on!");
    }

    @Override
    public void turOff() {
        System.out.println("TV is now off!");
    }

    @Override
    public boolean isDeviceOFF() {
        return !isOn;
    }

    public void changeChannel() {
        System.out.println("Channel is changed");
    }

    @Override
    public void setONFlag() {
        isOn = true;
    }

    @Override
    public void setOFFFlag() {
        this.isOn = false;
    }

}

