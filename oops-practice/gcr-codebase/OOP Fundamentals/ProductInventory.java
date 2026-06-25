public class ProductInventory {
    static class Product {
        String productName;
        double price;
        static int totalProducts = 0;

        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        public void displayProductDetails() {
            System.out.println("Product: " + productName + ", Price: $" + price);
        }

        public static void displayTotalProducts() {
            System.out.println("Total Products Created: " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Smartphone", 800.0);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
