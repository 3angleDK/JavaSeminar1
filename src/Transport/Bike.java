package Transport;

public class Bike extends Vehicle {
    public Bike(String color, String model, double maxSpeed, double weight){
        super(color, model, maxSpeed, weight);
        wheelsAmount = 2;
    }
    @Override
    public void drive() {
        System.out.println("The bike is going!");
    }
}
