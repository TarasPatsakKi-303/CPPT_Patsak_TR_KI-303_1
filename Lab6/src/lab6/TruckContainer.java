package lab6;

import java.util.ArrayList;
import java.util.List;

public class TruckContainer<T extends CargoTruck> {
    private List<T> trucks;

    public TruckContainer() {
        trucks = new ArrayList<>();
    }

    public void addTruck(T truck) {
        trucks.add(truck);
    }

    public void removeTruck(T truck) {
        trucks.remove(truck);
    }

    public T findMinByCapacity() {
        if (trucks.isEmpty()) {
            return null;
        }
        T minTruck = trucks.get(0);
        for (T truck : trucks) {
            if (truck.getCapacity() < minTruck.getCapacity()) {
                minTruck = truck;
            }
        }
        return minTruck;
    }

    public void displayTrucks() {
        for (T truck : trucks) {
            System.out.println(truck);
        }
    }
}
