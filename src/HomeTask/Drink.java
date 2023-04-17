package HomeTask;

public class Drink extends Food{
    protected double volume;
    public Drink(String name, double price, int amount, Product.Unit unit, double expiration, double volume){
        super(name, price, amount, unit, expiration);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\n\tVolume %1.1f litres.", volume);
    }

}
