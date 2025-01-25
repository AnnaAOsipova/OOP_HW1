import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine{

    private final List<Product> productList;
    private int money;

    public HotBeverageVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(HotBeverage product) {
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }

        }
        return null;
    }

    public HotBeverage getProduct(String name, int volume, int temperature){
        for (Product product: productList){
            if (product instanceof HotBeverage) {
                if (product.getName().equals(name) && ((HotBeverage) product).getVolume() == volume
                        && ((HotBeverage) product).getTemperature() == temperature) {
                    return (HotBeverage) product;
                }
            }
        }
        return null;
    }
}
