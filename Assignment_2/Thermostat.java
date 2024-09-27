public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "Thermostat");
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees.";
    }
}