
public interface DeviceSubject {
    void registerObserver(DeviceObserver observer);
    void removeObserver(DeviceObserver observer);
    void notifyObservers(String message);
}