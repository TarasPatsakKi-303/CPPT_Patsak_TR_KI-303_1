package lab6;

public class Main {
    public static void main(String[] args) {
        TruckContainer<CargoTruck> container = new TruckContainer<>();

        CargoTruck truck1 = new CargoTruck("Volvo FH", 20.0, 3);
        CargoTruck truck2 = new CargoTruck("MAN TGX", 18.5, 2);
        CargoTruck truck3 = new CargoTruck("Scania R500", 22.0, 4);

        container.addTruck(truck1);
        container.addTruck(truck2);
        container.addTruck(truck3);

        System.out.println("Список вантажівок:");
        container.displayTrucks();

        System.out.println("\nВантажівка з мінімальною вантажопідйомністю:");
        CargoTruck minTruck = container.findMinByCapacity();
        System.out.println(minTruck);
    }
}