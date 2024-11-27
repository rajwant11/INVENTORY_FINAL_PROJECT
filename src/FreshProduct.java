
public class FreshProduct extends Product {
    public FreshProduct(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Fresh Product - Name: " + name + ", Quantity: " + quantity + ", Price: $" + price);
    }
}
