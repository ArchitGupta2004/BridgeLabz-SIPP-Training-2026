class Order {
    String orderId;
    String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() {
        return "Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() {
        return "Delivered";
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("ORD001", "2023-10-01");
        ShippedOrder o2 = new ShippedOrder("ORD002", "2023-10-02", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("ORD003", "2023-10-03", "TRK98765", "2023-10-05");
        
        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}
