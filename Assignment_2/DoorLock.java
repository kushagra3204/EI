
public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id, "Door Lock");
    }

    @Override
    public void turnOn() {
        isOn = true; // Unlock the door
    }

    @Override
    public void turnOff() {
        isOn = false; // Lock the door
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isOn ? "Unlocked" : "Locked");
    }
}