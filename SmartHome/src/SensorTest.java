public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new LightSensor("Garden", 80.0);
        sensors[1] = new SoundSensor("Bedroom", 65.0);
        sensors[2] = new TemperatureSensor("Living Room", 23.5);
        sensors[3] = new LightSensor("Kitchen", 120.0);
        sensors[4] = new SoundSensor("Office", 75.0);

        for (Sensor sensor : sensors) {
            System.out.println(sensor);
            System.out.println();
        }
    }
}