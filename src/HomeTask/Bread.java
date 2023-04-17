package HomeTask;

public class Bread extends Food{
    protected String flour;
    public Bread(String name, double price, int amount, Product.Unit unit, double expiration, String flour){
        super(name, price, amount, unit, expiration);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Type of flour: %s.", flour);
    }

}
