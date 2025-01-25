import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine(productList);

        HotBeverage tea = new HotBeverage("Tea", 150, 90);
        HotBeverage coffee = new HotBeverage("Coffee", 100, 80);
        HotBeverage hotChocolate = new HotBeverage("Hot Chocolate", 200, 85);

        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);
        vendingMachine.addProduct(hotChocolate);


        HotBeverage requestedDrink = (HotBeverage) vendingMachine.getProduct("Coffee");
        if (requestedDrink != null) {
            System.out.println("Dispensed: " + requestedDrink);
        } else {
            System.out.println("Product not found.");
        }
    }
}

