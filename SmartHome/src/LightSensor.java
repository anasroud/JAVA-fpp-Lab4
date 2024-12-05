import java.text.SimpleDateFormat;
import java.util.Date;

public class LightSensor implements Sensor {
    private String location;
    private String lastUpdated;
    private double lightLevel;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        updateLastUpdated();
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "an alert to turn on the light";
        } else {
            return "Light is sufficient";
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