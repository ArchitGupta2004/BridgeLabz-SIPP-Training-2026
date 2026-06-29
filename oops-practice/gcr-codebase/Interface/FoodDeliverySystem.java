interface FoodDelivery {
    void deliverFood();
    default void trackOrder() {
        System.out.println("Tracking: Food order is on the way.");
    }
}

interface GroceryDelivery {
    void deliverGroceries();
    default void trackOrder() {
        System.out.println("Tracking: Grocery order is out for delivery.");
    }
    static String generateDeliveryCode() {
        return "DEL-" + (int)(Math.random() * 10000);
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    @Override
    public void deliverFood() {
        System.out.println("Delivering hot food to customer.");
    }

    @Override
    public void deliverGroceries() {
        System.out.println("Delivering fresh groceries to customer.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking Partner Delivery...");
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        DeliveryExecutive exec = new DeliveryExecutive();
        String[] customers = {"John", "Emma"};
        
        for (String customer : customers) {
            System.out.println("Processing order for " + customer);
            String code = GroceryDelivery.generateDeliveryCode();
            System.out.println("Delivery Code: " + code);
            exec.deliverFood();
            exec.deliverGroceries();
            exec.trackOrder();
            System.out.println("--- Order Complete ---");
        }
    }
}
