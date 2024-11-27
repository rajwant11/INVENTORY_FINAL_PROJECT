
public class MilkProduct extends Product {
    public MilkProduct(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Milk Product - Name: " + name + ", Quantity: " + quantity + ", Price: $" + price);
    }
}
