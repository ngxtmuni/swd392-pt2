package factory;

// Main class để demo Factory Method Pattern
public class Main {

    public static void main(String[] args) {
        System.out.println("========== FACTORY METHOD PATTERN DEMO ==========\n");

        // Tạo các factory khác nhau
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        VehicleFactory bicycleFactory = new BicycleFactory();
        VehicleFactory truckFactory = new TruckFactory();

        // Sử dụng factory method thông qua các concrete factory
        System.out.println(">>> Using CarFactory:");
        carFactory.deliverVehicle();

        System.out.println("\n>>> Using MotorcycleFactory:");
        motorcycleFactory.deliverVehicle();

        System.out.println("\n>>> Using BicycleFactory:");
        bicycleFactory.deliverVehicle();

        System.out.println("\n>>> Using TruckFactory:");
        truckFactory.deliverVehicle();

        // Demo trực tiếp factory method
        System.out.println("\n>>> Direct Factory Method Call:");
        Vehicle myVehicle = carFactory.createVehicle();
        System.out.println("Created vehicle type: " + myVehicle.getType());
        myVehicle.drive();

        System.out.println("\n========== END OF DEMO ==========");
    }
}
