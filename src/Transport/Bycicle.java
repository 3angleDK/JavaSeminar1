package Transport;

public class Bycicle extends Vehicle {
    public Bycicle(String color, String model, double maxSpeed, double weight){
        super(color, model, maxSpeed, weight);
        wheelsAmount = 2;
    }
    @Override
    public void drive() {
        System.out.println("The bycicle is going!");
    }
}
