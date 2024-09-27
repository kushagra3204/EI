
public class Light extends SmartDevice {
    public Light(int id) {
        super(id, "Light");
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}