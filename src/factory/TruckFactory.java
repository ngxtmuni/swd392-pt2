package factory;

public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        System.out.println("[TruckFactory] Creating a new Truck...");
        return new Truck();
    }
}