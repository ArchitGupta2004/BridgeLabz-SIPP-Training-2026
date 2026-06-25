import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }
        
        @Override
        public String toString() {
            return itemName + " (x" + quantity + ") - $" + price + " each";
        }
    }

    static class Cart {
        List<CartItem> items;

        public Cart() {
            items = new ArrayList<>();
        }

        public void addItem(String name, double price, int qty) {
            items.add(new CartItem(name, price, qty));
            System.out.println("Added: " + name + " to the cart.");
        }

        public void removeItem(String name) {
            boolean removed = items.removeIf(item -> item.itemName.equalsIgnoreCase(name));
            if (removed) {
                System.out.println("Removed: " + name + " from the cart.");
            } else {
                System.out.println("Item not found: " + name);
            }
        }

        public void displayTotalCost() {
            double total = 0;
            System.out.println("--- Cart Items ---");
            for (CartItem item : items) {
                System.out.println(item.toString());
                total += item.getTotalPrice();
            }
            System.out.println("Total Cost: $" + total);
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem("Laptop", 1200.00, 1);
        cart.addItem("Mouse", 25.50, 2);
        cart.displayTotalCost();
        
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
