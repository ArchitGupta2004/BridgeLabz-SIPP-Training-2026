class Subscription {
    String subscriberName;
    String subscriptionId;
    public Subscription(String name, String id) {
        this.subscriberName = name;
        this.subscriptionId = id;
    }
    public double calculateMonthlyCharge() { return 0.0; }
}

class BasicPlan extends Subscription {
    public BasicPlan(String name, String id) { super(name, id); }
    @Override
    public double calculateMonthlyCharge() { return 9.99; }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String name, String id) { super(name, id); }
    @Override
    public double calculateMonthlyCharge() { return 14.99; }
}

class FamilyPlan extends Subscription {
    public FamilyPlan(String name, String id) { super(name, id); }
    @Override
    public double calculateMonthlyCharge() { return 19.99; }
}

public class SubscriptionAnalyzer {
    public static void main(String[] args) {
        Subscription[] subs = {
            new BasicPlan("Alice", "SUB-101"),
            new PremiumPlan("Bob", "SUB-102"),
            new FamilyPlan("Charlie", "SUB-103"),
            new PremiumPlan("Adam", "SUB-104")
        };

        System.out.println("--- Search by ID: SUB-102 ---");
        for (Subscription s : subs) {
            if (s.subscriptionId.equals("SUB-102")) {
                System.out.println("Found: " + s.subscriberName);
            }
        }

        char prefix = 'A';
        System.out.println("\n--- Subscribers starting with '" + prefix + "' ---");
        for (Subscription s : subs) {
            if (s.subscriberName.startsWith(String.valueOf(prefix))) {
                System.out.println(s.subscriberName);
            }
        }

        double totalRevenue = 0;
        Subscription maxSub = subs[0];
        for (Subscription s : subs) {
            totalRevenue += s.calculateMonthlyCharge();
            if (s.calculateMonthlyCharge() > maxSub.calculateMonthlyCharge()) {
                maxSub = s;
            }
        }

        System.out.println("\nTotal Monthly Revenue: $" + totalRevenue);
        System.out.println("Most Expensive Subscription: " + maxSub.subscriberName + " ($" + maxSub.calculateMonthlyCharge() + ")");
    }
}
