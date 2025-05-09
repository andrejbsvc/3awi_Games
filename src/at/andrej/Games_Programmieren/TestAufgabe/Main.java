package at.andrej.Games_Programmieren.TestAufgabe;

public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();

        Vehicle car = new Car("BMW", 101);
        Vehicle train = new Train("REX", 202);
        AeroCar aeroCar = new AeroCar("Deluxo", 303);

        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(aeroCar);

        dealer.printVehicles();
    }
}

