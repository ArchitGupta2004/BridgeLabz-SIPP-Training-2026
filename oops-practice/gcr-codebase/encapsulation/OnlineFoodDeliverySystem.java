abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String name) { this.itemName = name; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public int getQuantity() { return quantity; }
    public void setQuantity(int qty) { this.quantity = qty; }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item: " + itemName + " | Price: $" + price + " | Qty: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private double serviceCharge;

    public NonVegItem(String name, double price, int qty, double charge) {
        super(name, price, qty);
        this.serviceCharge = charge;
    }

    public double getServiceCharge() { return serviceCharge; }
    public void setServiceCharge(double charge) { this.serviceCharge = charge; }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Paneer Tikka", 12.0, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 15.0, 2, 5.0); // 5.0 extra charge

        veg.displayItemDetails();
        System.out.println("Total Price: $" + veg.calculateTotalPrice() + "\n");

        nonVeg.displayItemDetails();
        System.out.println("Total Price (with service charge): $" + nonVeg.calculateTotalPrice() + "\n");
    }
}
