package Transport;

public class Track extends Vehicle{
    public Track(String color, String model, double maxSpeed, double weight){
        super(color, model, maxSpeed, weight);
        wheelsAmount = 6;
    }
    @Override
    public void drive() {
        System.out.println("The track is going!");
    }
}
