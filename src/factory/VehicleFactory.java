package factory;

// Creator (Abstract Factory) - định nghĩa factory method
public abstract class VehicleFactory {

    // Factory Method - để subclass quyết định tạo object nào
    public abstract Vehicle createVehicle();

    // Template method sử dụng factory method
    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        System.out.println("=================================");
        System.out.println("Delivering a new " + vehicle.getType());
        vehicle.drive();
        System.out.println("Delivery complete!");
        System.out.println("=================================");
    }
}
