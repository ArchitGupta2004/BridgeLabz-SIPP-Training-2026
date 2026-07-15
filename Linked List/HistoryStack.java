public class HistoryStack {
    public static Node reverseHistory(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Scenario 3: Reverse — Reversing a Browser Back-Button History Stack");
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        
        System.out.print("Original History (most-recent first): ");
        printList(head);
        
        head = reverseHistory(head);
        
        System.out.print("Reversed History (oldest first): ");
        printList(head);
    }
}
