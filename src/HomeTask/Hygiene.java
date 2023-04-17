package HomeTask;

public class Hygiene extends Product {
    protected int amountInPackage;
    public Hygiene(String name, double price, int amount, Product.Unit unit, int amountInPackage){
        super(name, price, amount, unit);
        this.amountInPackage = amountInPackage;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\n\t%d number of pieces in a package.", amountInPackage);
    }

}
