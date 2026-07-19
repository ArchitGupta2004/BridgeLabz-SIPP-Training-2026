public class DeepCategoryTree {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }

    int height(Node node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);

        DeepCategoryTree dct = new DeepCategoryTree();
        System.out.println("Tree height: " + dct.height(root));
        System.out.println("Is too deep (threshold 2)? " + dct.isTooDeep(root, 2));
        System.out.println("Is too deep (threshold 3)? " + dct.isTooDeep(root, 3));
    }
}
