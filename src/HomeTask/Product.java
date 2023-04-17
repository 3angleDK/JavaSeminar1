package HomeTask;

public class Product {
    public enum Unit {
        PIECE,
        LITRE,
        KG
    }
    public String unitToString(Unit unit){
        return switch (unit){
            case KG -> "kg";
            case PIECE -> "pieces";
            case LITRE -> "litres";
        };
    }
    protected String name;
    protected double price;
    protected int amount;
    protected Unit unit;
    public Product(String name, double price, int amount, Unit unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, price: %1.2f, amount: %d %s.", name, price, amount, unitToString(unit));
    }
}
