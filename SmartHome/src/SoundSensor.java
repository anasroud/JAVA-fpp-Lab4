import java.text.SimpleDateFormat;
import java.util.Date;

public class SoundSensor implements Sensor {
    private String location;
    private String lastUpdated;
    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        updateLastUpdated();
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70) {
            return "an alert to turn on noise cancellation";
        } else {
            return "Sound is within normal range";
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