public class RedirectLoop {
    public static boolean hasRedirectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Scenario 5: Cycle Detection — Catching an Infinite Redirect Loop");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        System.out.println("Checking chain without loop: " + hasRedirectLoop(head));
        
        // Creating a loop: 4 points back to 2
        head.next.next.next.next = head.next;
        System.out.println("Checking chain with loop: " + hasRedirectLoop(head));
    }
}
