public class FastUsernameLookup {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public boolean search(Node root, int target) {
        Node current = root;
        while (current != null) {
            if (target == current.val) return true;
            current = (target < current.val) ? current.left : current.right;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        
        FastUsernameLookup lookup = new FastUsernameLookup();
        System.out.println("Search 7: " + lookup.search(root, 7)); // true
        System.out.println("Search 12: " + lookup.search(root, 12)); // false
    }
}
