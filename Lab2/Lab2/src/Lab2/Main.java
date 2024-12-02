package Lab2;



public class Main {
    public static void main(String[] args) {
        River river = new River("Dniester", 1360);
        Lake lake = new Lake("Lake Svityaz", 27.3);
        WaterBody waterBody = new WaterBody(18.5, 7.2);
        WaterBodyArea waterBodyArea = new WaterBodyArea(river, lake, waterBody);
        waterBodyArea.displayDetails();
        waterBodyArea.updateTemperature(20.0);
        waterBodyArea.updatePHLevel(7.5);
        waterBodyArea.closeFile();
    }
}
