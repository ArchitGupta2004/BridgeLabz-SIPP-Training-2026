class NotificationSystemNotif {
    String recipientName;
    String message;

    public NotificationSystemNotif(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending generic notification to " + recipientName);
    }
}

class EmailNotification extends NotificationSystemNotif {
    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }
    @Override
    public void sendNotification() {
        System.out.println("[EMAIL] To: " + recipientName + " | Msg: " + message);
    }
}

class SMSNotification extends NotificationSystemNotif {
    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }
    @Override
    public void sendNotification() {
        System.out.println("[SMS] To: " + recipientName + " | Msg: " + message);
    }
}

class PushNotification extends NotificationSystemNotif {
    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }
    @Override
    public void sendNotification() {
        System.out.println("[PUSH APP] To: " + recipientName + " | Msg: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationSystemNotif[] notifications = {
            new EmailNotification("Alice", "Your invoice is attached."),
            new SMSNotification("Bob", "Your OTP is 123456."),
            new PushNotification("Charlie", "New friend request!")
        };

        for (NotificationSystemNotif n : notifications) {
            n.sendNotification(); // Dynamic method dispatch
        }
    }
}
