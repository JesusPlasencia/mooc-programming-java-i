
import java.util.Scanner;

public class Store {
    
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    
    public void shop (String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");
        
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }
        
        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // Add code here that adds the product to the cart,
            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
            if (this.warehouse.stock(product) > 0) {
                System.out.println("Stock: " + this.warehouse.stock(product));
                cart.add(product, this.warehouse.price(product));
                this.warehouse.take(product);
            }
        }
        
        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
