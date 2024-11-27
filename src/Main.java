import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Inventory Management System");
        System.out.println("1. Load Inventory from CSV");
        System.out.println("2. Display Inventory");
        System.out.println("3. Add a Product");

        while (true) {
            System.out.println("\nChoose an option (or 0 to exit): ");
            int choice = input.nextInt();
            input.nextLine(); // Clear the newline

            switch (choice) {
                case 1:
                    try {
                        manager.loadData("Wholesale_customers_data.csv"); // Ensure this path matches your CSV file location
                        System.out.println("Inventory loaded successfully.");
                    } catch (IOException e) {
                        System.out.println("Error loading data: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Current Inventory:");
                    manager.displayInventory();
                    break;
                case 3:
                    manager.addProduct();
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
