import java.io.*;
import java.util.*;

public class InventoryManager implements InventoryDataLoader {
    private List<Product> products = new ArrayList<>();
    private Scanner input = new Scanner(System.in); // Always use Scanner as per your preference

    @Override
    public void loadData(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        reader.readLine(); // Skip header
        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");
            String name = details[0];
            int quantity = Integer.parseInt(details[1]);
            double price = Double.parseDouble(details[2]);

            if (name.equalsIgnoreCase("Fresh")) {
                products.add(new FreshProduct(name, quantity, price));
            } else if (name.equalsIgnoreCase("Milk")) {
                products.add(new MilkProduct(name, quantity, price));
            }
            // Additional categories can be added here
        }
        reader.close();
    }

    public void displayInventory() {
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    public void addProduct() {
        System.out.println("Enter product type (Fresh or Milk): ");
        String type = input.nextLine();
        System.out.println("Enter product name: ");
        String name = input.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        input.nextLine(); // Clear the newline

        Product product;
        if (type.equalsIgnoreCase("Fresh")) {
            product = new FreshProduct(name, quantity, price);
        } else if (type.equalsIgnoreCase("Milk")) {
            product = new MilkProduct(name, quantity, price);
        } else {
            System.out.println("Unknown product type.");
            return;
        }

        products.add(product);
        System.out.println("Product added successfully.");
    }
}
