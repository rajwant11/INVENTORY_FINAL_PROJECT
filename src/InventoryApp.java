import java.util.Scanner;

import java.io.IOException;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        try {
            manager.loadData("Wholesale_customers_data.csv"); // Ensure this path matches your CSV file location
            manager.displayInventory();
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
