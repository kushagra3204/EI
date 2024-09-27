
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem smartHome = new SmartHomeSystem();
        StatusObserver observer = new StatusObserver();
        smartHome.registerObserver(observer);
        InputHandler inputHandler = new InputHandler();

        // Main loop for user input
        while (true) {
            System.out.println("1. Add Device\n2. Remove Device\n3. Turn On Device\n4. Turn Off Device\n5. Schedule Task\n6. Add Trigger\n7. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (choice) {
                case 1:
                    int idToAdd = inputHandler.getDeviceId();
                    String typeToAdd = inputHandler.getDeviceType();
                    smartHome.addDevice(DeviceFactory.createDevice(idToAdd, typeToAdd));
                    break;
                case 2:
                    int idToRemove = inputHandler.getDeviceId();
                    smartHome.removeDevice(idToRemove);
                    break;
                case 3:
                    int idToTurnOn = inputHandler.getDeviceId();
                    smartHome.turnOnDevice(idToTurnOn);
                    break;
                case 4:
                    int idToTurnOff = inputHandler.getDeviceId();
                    smartHome.turnOffDevice(idToTurnOff);
                    break;
                case 5:
                    int idToSchedule = inputHandler.getDeviceId();
                    LocalTime scheduleTime = inputHandler.getScheduleTime();
                    String action = inputHandler.getAction();
                    smartHome.setSchedule(idToSchedule, scheduleTime, action);
                    break;
                case 6:
                    String condition = "temperature";
                    int value = 80; // Example temperature value
                    String actionTrigger = "turnOff(1)"; // Example action
                    smartHome.addTrigger(condition, value, actionTrigger);
                    break;
                case 7:
                    inputHandler.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

            // Simulate checking scheduled tasks and triggers (in a real scenario, this would be done periodically)
            LocalTime currentTime = LocalTime.now(); // Example current time for simulation
            smartHome.checkScheduledTasks(currentTime);
            smartHome.checkAutomatedTriggers();
        }
    }
}

