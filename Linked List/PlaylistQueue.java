public class PlaylistQueue {
    public static void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
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
        System.out.println("Scenario 1: Insertion — Adding a Track to a Playlist Queue");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        
        System.out.print("Before insertion: ");
        printList(head);
        
        System.out.println("Inserting track 3 after track 2...");
        insertAfter(head.next, 3);
        
        System.out.print("After insertion: ");
        printList(head);
    }
}
