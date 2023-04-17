package HomeTask;

public class Eggs extends Food{
    protected int amountInPackage;
    public Eggs(String name, double price, int amount, Product.Unit unit, double expiration, int amountInPackage){
        super(name, price, amount, unit, expiration);
        this.amountInPackage = amountInPackage;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" %d number of pieces in a package.", amountInPackage);
    }
}
