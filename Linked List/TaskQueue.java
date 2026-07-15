public class TaskQueue {
    public static Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        if (head.val == taskId) return head.next;
        Node prev = head, curr = head.next;
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
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
        System.out.println("Scenario 2: Deletion — Removing a Completed Task from a Task Queue");
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        System.out.print("Initial Queue: ");
        printList(head);
        
        System.out.println("Removing task 30...");
        head = removeTask(head, 30);
        
        System.out.print("Queue after removal: ");
        printList(head);
        
        System.out.println("Removing task 10 (head)...");
        head = removeTask(head, 10);
        
        System.out.print("Queue after head removal: ");
        printList(head);
    }
}
