package factory;

// Concrete Product 2 - triển khai cụ thể của Vehicle
public class Motorcycle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Riding a motorcycle fast...");
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
