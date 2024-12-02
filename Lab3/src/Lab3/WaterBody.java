package Lab3;


public abstract class WaterBody {
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

    /**
     * Abstract method to display information about the water body.
     * Subclasses must provide an implementation for this method.
     */
    public abstract void displayInfo();
}
