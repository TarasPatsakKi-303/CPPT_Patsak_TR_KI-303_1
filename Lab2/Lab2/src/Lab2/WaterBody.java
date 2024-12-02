package Lab2;

public class WaterBody {
    private double temperature;
    private double pHLevel;

    public WaterBody(double temperature, double pHLevel) {
        this.temperature = temperature;
        this.pHLevel = pHLevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPhLevel() {
        return pHLevel;
    }
}

