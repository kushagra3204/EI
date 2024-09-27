
import java.time.LocalTime;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int getDeviceId() {
        System.out.print("Enter Device ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getDeviceType() {
        System.out.print("Enter Device Type (light/thermostat/door): ");
        return scanner.nextLine();
    }

    public String getAction() {
        System.out.print("Enter Action (Turn On/Turn Off): ");
        return scanner.nextLine();
    }

    public LocalTime getScheduleTime() {
        System.out.print("Enter Schedule Time (HH:mm): ");
        String[] timeParts = scanner.nextLine().split(":");
        return LocalTime.of(Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1]));
    }

    public void close() {
        scanner.close();
    }
}