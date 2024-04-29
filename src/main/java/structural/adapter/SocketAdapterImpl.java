package structural.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        volt.setVolt(volt.getVolt()/10);
        return volt;
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        volt.setVolt(volt.getVolt()/40);
        return volt;
    }
}
