package Lab3;


public class Sea extends WaterBody {
    private double salinity; 

    public Sea(double temperature, double pHLevel, double salinity) {
        super(temperature, pHLevel);
        this.salinity = salinity;
    }

    public double getSalinity() {
        return salinity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sea Information:");
        System.out.println("Temperature: " + getTemperature() + " °C");
        System.out.println("pH Level: " + getPhLevel());
        System.out.println("Salinity: " + salinity + " ppt");
    }
}

