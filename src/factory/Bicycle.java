package factory;

// Concrete Product 3 - triển khai cụ thể của Vehicle
public class Bicycle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Pedaling a bicycle slowly...");
    }

    @Override
    public String getType() {
        return "Bicycle";
    }
}
