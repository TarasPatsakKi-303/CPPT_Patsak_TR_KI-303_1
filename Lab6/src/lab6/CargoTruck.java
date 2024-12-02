package lab6;

public class CargoTruck {
    private String model;
    private double capacity; 
    private int axles;

    public CargoTruck(String model, double capacity, int axles) {
        this.model = model;
        this.capacity = capacity;
        this.axles = axles;
    }

    public String getModel() {
        return model;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getAxles() {
        return axles;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s, Вантажопідйомність: %.2f т, Осі: %d", model, capacity, axles);
    }
}