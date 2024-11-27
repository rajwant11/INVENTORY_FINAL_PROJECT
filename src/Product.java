
public abstract class Product {
    protected String name;
    protected int quantity;
    protected double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract void displayProductInfo();
}
