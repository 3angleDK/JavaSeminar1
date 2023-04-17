package Transport;

public class Car extends Vehicle {

    public Car(String color, String model, double maxSpeed, double weight){
        super(color, model, maxSpeed, weight);
        wheelsAmount = 4;
    }

    @Override
    public void drive() {
        System.out.println("The car is going!");
    }
}
