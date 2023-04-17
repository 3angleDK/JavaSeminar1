package Transport;

public class Vehicle {
    protected String color;
    protected String model;
    protected int wheelsAmount;
    protected double maxSpeed;
    protected double weight;
    public Vehicle(String color, String model, double maxSpeed, double weight){
        this.color = color;
        this.model = model;
        this.wheelsAmount = 0;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }
    public void drive(){
        System.out.printf("The %s is going!\n", this.getClass().getName());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, color: %s, maximum speed: %1.1f km/s, weight: %1.1f kg.", model, color, maxSpeed, weight);
    }
}
