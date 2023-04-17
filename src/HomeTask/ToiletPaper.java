package HomeTask;

public class ToiletPaper extends Hygiene{
    protected int layersNumber;
    public ToiletPaper(String name, double price, int amount, Product.Unit unit, int amountInPackage, int layersNumber){
        super(name, price, amount, unit, amountInPackage);
        this.layersNumber = layersNumber;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n\tNumber of layers: %d.", layersNumber);
    }
}
