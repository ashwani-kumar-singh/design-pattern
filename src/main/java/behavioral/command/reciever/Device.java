package behavioral.command.reciever;

public interface Device {

    void turnOn();

    void turOff();

    boolean isDeviceOFF();

    void setONFlag();

    void setOFFFlag();
}
