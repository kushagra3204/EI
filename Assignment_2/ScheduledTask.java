
import java.time.LocalTime;

public class ScheduledTask {
    int deviceId;
    LocalTime time;
    String action;

    public ScheduledTask(int deviceId, LocalTime time, String action) {
        this.deviceId = deviceId;
        this.time = time;
        this.action = action;
    }
}