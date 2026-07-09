interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getName() { return name; }
    @Override public String toString() { return name + " ($" + price + ")"; }
}

public class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double currentPrice = product.getPrice();
        double discountedPrice = currentPrice - (currentPrice * (percentage / 100));
        product.setPrice(discountedPrice);
        System.out.println("Applied " + percentage + "% discount to " + product.getName() + ". New price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);

        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(shirt);
    }
}
