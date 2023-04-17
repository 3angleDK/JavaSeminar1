package HomeTask;

public class BabyProduct extends Product{
    protected int minimumAge;
    protected boolean hypoallergenic;
    public BabyProduct(String name, double price, int amount, Product.Unit unit, int minimumAge, boolean hypoallergenic){
        super(name, price, amount, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }
    public String hypoallergenicToString(){
        return (hypoallergenic) ? "hypoallergenic" : "NO hypoallergenic";
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\n\tMinimum age: %d years, %s.", minimumAge, hypoallergenicToString());
    }


}
