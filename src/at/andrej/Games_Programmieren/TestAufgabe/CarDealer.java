package at.andrej.Games_Programmieren.TestAufgabe;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void printVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getName() + ", ID: " + v.getID());
            v.drive();

            // Falls AeroCar, dann auch fliegen
            if (v instanceof AeroCar) {
                ((AeroCar) v).fly();
            }
        }
    }
}