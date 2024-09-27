
public class DeviceFactory {
    public static SmartDevice createDevice(int id, String type) {
        return switch (type.toLowerCase()) {
            case "light" -> new Light(id);
            case "thermostat" -> new Thermostat(id, 70);
            case "door" -> new DoorLock(id);
            default -> throw new IllegalArgumentException("Unknown device type: " + type);
        };
    }
}
