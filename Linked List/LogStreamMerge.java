public class LogStreamMerge {
    public static Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a; 
                a = a.next;
            } else {
                tail.next = b; 
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
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
        System.out.println("Scenario 6: Merge — Combining Two Sorted Log Streams");
        Node streamA = new Node(1);
        streamA.next = new Node(3);
        streamA.next.next = new Node(5);
        
        Node streamB = new Node(2);
        streamB.next = new Node(4);
        streamB.next.next = new Node(6);
        
        System.out.print("Log Stream A: ");
        printList(streamA);
        System.out.print("Log Stream B: ");
        printList(streamB);
        
        Node merged = mergeLogStreams(streamA, streamB);
        
        System.out.print("Merged Stream: ");
        printList(merged);
    }
}
