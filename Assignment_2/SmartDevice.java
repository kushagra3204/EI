
public abstract class SmartDevice {
    protected int id;
    protected String type;
    protected boolean isOn;

    public SmartDevice(int id, String type) {
        this.id = id;
        this.type = type;
        this.isOn = false;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();
}