package factory;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a truck...");
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
