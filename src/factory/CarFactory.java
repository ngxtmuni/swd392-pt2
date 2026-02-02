package factory;

// Concrete Creator 1 - tạo Car
public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        System.out.println("[CarFactory] Creating a new Car...");
        return new Car();
    }
}
