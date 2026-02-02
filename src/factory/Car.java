package factory;

// Concrete Product 1 - triển khai cụ thể của Vehicle
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a car on the road...");
    }

    @Override
    public String getType() {
        return "Car";
    }
}
