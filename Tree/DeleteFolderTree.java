public class DeleteFolderTree {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }

    public void deleteFolderTree(Node node) {
        if (node == null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node); 
    }

    private void deleteNode(Node node) {
        System.out.println("Deleted folder node with val: " + node.val);
    }

    public static void main(String[] args) {
        Node root = new Node(1); // Root folder
        root.left = new Node(2); // Subfolder 1
        root.right = new Node(3); // Subfolder 2
        root.left.left = new Node(4); // Subfolder 1.1

        DeleteFolderTree dft = new DeleteFolderTree();
        System.out.println("Starting folder deletion...");
        dft.deleteFolderTree(root);
    }
}
