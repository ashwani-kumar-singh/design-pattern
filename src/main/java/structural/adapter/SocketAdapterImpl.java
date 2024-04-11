package structural.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        volt.setVolt(12);
        return volt;
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        volt.setVolt(3);
        return volt;
    }
}
