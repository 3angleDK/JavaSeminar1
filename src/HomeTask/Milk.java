package HomeTask;

public class Milk extends Food{
    protected double fat;
    public Milk(String name, double price, int amount, Product.Unit unit, double expiration, double fat){
        super(name, price, amount, unit, expiration);
        this.fat = fat;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" Fat: %1.1f percent.", fat);
    }


}
