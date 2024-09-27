
import java.time.LocalTime;
import java.util.*;

public class SmartHomeSystem implements DeviceSubject {
    private final Map<Integer, SmartDevice> devices = new HashMap<>();
    private final List<DeviceObserver> observers = new ArrayList<>();
    private final List<ScheduledTask> scheduledTasks = new ArrayList<>();
    private final List<AutomatedTrigger> automatedTriggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.put(device.id, device);
        notifyObservers(device.getStatus());
    }

    public void removeDevice(int id) {
        devices.remove(id);
        notifyObservers("Device " + id + " has been removed.");
    }

    public void turnOnDevice(int id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOn();
            notifyObservers(devices.get(id).getStatus());
        }
    }

    public void turnOffDevice(int id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOff();
            notifyObservers(devices.get(id).getStatus());
        }
    }

    public void setSchedule(int deviceId, LocalTime time, String action) {
        scheduledTasks.add(new ScheduledTask(deviceId, time, action));
    }

    public void addTrigger(String condition, int value, String action) {
        automatedTriggers.add(new AutomatedTrigger(condition, value, action));
    }

    public void checkScheduledTasks(LocalTime currentTime) {
        for (ScheduledTask task : scheduledTasks) {
            if (task.time.equals(currentTime)) {
                if (task.action.equalsIgnoreCase("Turn On")) {
                    turnOnDevice(task.deviceId);
                } else if (task.action.equalsIgnoreCase("Turn Off")) {
                    turnOffDevice(task.deviceId);
                }
            }
        }
    }

    public void checkAutomatedTriggers() {
        for (AutomatedTrigger trigger : automatedTriggers) {
            if (trigger.condition.equalsIgnoreCase("temperature") && trigger.value > 75) {
                turnOffDevice(1); // Example: turn off light 1 when temperature exceeds 75
            }
        }
    }

    @Override
    public void registerObserver(DeviceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DeviceObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (DeviceObserver observer : observers) {
            observer.update(message);
        }
    }
}
