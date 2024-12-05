import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureSensor implements Sensor {
    private String location;
    private String lastUpdated;
    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        updateLastUpdated();
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        updateLastUpdated();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "an alert to turn on the AC";
        } else if (temperature < 18) {
            return "an alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }

    private void updateLastUpdated() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        lastUpdated = formatter.format(new Date());
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated() + "\n" +
                "Action: " + performAction();
    }
}