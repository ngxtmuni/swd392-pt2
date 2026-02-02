package factory;

// Concrete Creator 3 - tạo Bicycle
public class BicycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        System.out.println("[BicycleFactory] Creating a new Bicycle...");
        return new Bicycle();
    }
}
