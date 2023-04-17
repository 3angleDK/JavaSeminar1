package HomeTask;

public class Diaper extends Product{
    protected int size;
    protected double minWeight;
    protected double maxWeight;
    protected String type;

    public Diaper(String name, double price, int amount, Product.Unit unit, int size, double minWeight, double maxWeight, String type){
        super(name, price, amount, unit);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n\tSize: %d, Minimal weight: %1.1f, Maximal weight: %1.1f, type: %s.", size, minWeight, maxWeight, type);
    }

}
