package HomeTask;

public class Food extends Product{
    protected double expiration;
    public Food(String name, double price, int amount, Product.Unit unit, double expiration){
        super(name, price, amount, unit);
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n\tExpiration %1.1f days.", expiration);
    }
}
