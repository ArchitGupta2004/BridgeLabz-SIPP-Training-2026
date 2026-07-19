public class InsertEmployeeID {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public Node insert(Node node, int id) {
        if (node == null) {
            return new Node(id);
        }
        if (id < node.val) {
            node.left = insert(node.left, id);
        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }
        return node;
    }

    // Inorder traversal to verify
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        InsertEmployeeID inserter = new InsertEmployeeID();
        Node root = null;
        root = inserter.insert(root, 100);
        inserter.insert(root, 50);
        inserter.insert(root, 150);
        inserter.insert(root, 25);
        inserter.insert(root, 75);
        
        System.out.print("Inorder after insertion: ");
        inserter.inorder(root);
        System.out.println();
    }
}
