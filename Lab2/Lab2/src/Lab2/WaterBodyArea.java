package Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WaterBodyArea {
    private River river;
    private Lake lake;
    private WaterBody waterBody;

    public WaterBodyArea(River river, Lake lake, WaterBody waterBody) {
        this.river = river;
        this.lake = lake;
        this.waterBody = waterBody;
    }

    public WaterBodyArea(River river, WaterBody waterBody) {
        this.river = river;
        this.waterBody = waterBody;
    }
    public void logAction(String action) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(action);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayDetails() {
        logAction("Displaying details of water body");
        System.out.println("River: " + river.getName() + ", Length: " + river.getLength() + " km");
        System.out.println("Lake: " + lake.getName() + ", Area: " + lake.getArea() + " km²");
        System.out.println("Water Temperature: " + waterBody.getTemperature() + " °C");
        System.out.println("Water pH: " + waterBody.getPhLevel());
    }

    public void updateTemperature(double newTemperature) {
        waterBody = new WaterBody(newTemperature, waterBody.getPhLevel());
        logAction("Updated temperature to: " + newTemperature);
    }

    public void updatePHLevel(double newPH) {
        waterBody = new WaterBody(waterBody.getTemperature(), newPH);
        logAction("Updated pH level to: " + newPH);
    }

    public void closeFile() {
        logAction("File closed.");
    }
}

