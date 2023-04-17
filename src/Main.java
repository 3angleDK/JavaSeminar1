import HomeTask.*;
import Transport.*;

public class Main {

    static void PrintPoduct(Product product){
        System.out.println(product);
    }
    public static void main(String[] args) {
//        Vehicle[] vehicles = {
//                new Bike("Red", "Suzuki", 320.0, 158.0),
//                new Bycicle("Blue", "Scott", 49.0, 21.0),
//                new Track("White", "Volvo", 140.0, 5250.0),
//                new Car("Black", "Porsche", 290.0, 850.0)
//        };
//        for (Vehicle item: vehicles) {
//            System.out.println(item);
//            System.out.println(item.getWheelsAmount());
//            item.drive();
//        }
        Product[] products = {
                new Food("Kvass", 2.20, 12, Product.Unit.LITRE, 5),
                new Drink("Bear", 6.10, 120, Product.Unit.PIECE, 3, 0.5),
                new Hygiene("Средство гигиены", 12.20, 6, Product.Unit.PIECE, 10),
                new BabyProduct("Toy", 9.99, 16, Product.Unit.PIECE, 3, true),
                new Milk("Milk", 3.60, 35, Product.Unit.PIECE, 3, 3.2),
                new Lemonade("Lemonade", 2.70, 44, Product.Unit.PIECE, 14, 0.5),
                new Bread("Bread", 1.20, 61, Product.Unit.PIECE, 3, "good flour"),
                new Eggs("Eggs", 4.20, 12, Product.Unit.PIECE, 90, 10),
                new ToiletPaper("Toilet paper", 6.80, 99, Product.Unit.PIECE, 6, 3),
                new Pacifier("Pacifier", 0.80, 19, Product.Unit.PIECE, 0, true),
                new Diaper("Diaper", 11.80, 16, Product.Unit.PIECE, 1, 3.0, 8.0, "baby")
        };
        for (Product item: products) {
            PrintPoduct(item);
            System.out.println("------------------------");
        }

    }
}