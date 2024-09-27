public class StatusObserver implements DeviceObserver {
    @Override
    public void update(String message) {
        System.out.println("Status Update: " + message);
    }
}