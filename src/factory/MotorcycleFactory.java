package factory;

// Concrete Creator 2 - tạo Motorcycle
public class MotorcycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        System.out.println("[MotorcycleFactory] Creating a new Motorcycle...");
        return new Motorcycle();
    }
}
