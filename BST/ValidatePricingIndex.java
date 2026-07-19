public class ValidatePricingIndex {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(Node node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Node validRoot = new Node(10);
        validRoot.left = new Node(5);
        validRoot.right = new Node(15);
        
        Node invalidRoot = new Node(10);
        invalidRoot.left = new Node(5);
        invalidRoot.right = new Node(15);
        invalidRoot.left.right = new Node(12); // Invalid because 12 > 10, but it's in left subtree
        
        ValidatePricingIndex validator = new ValidatePricingIndex();
        System.out.println("Is validRoot valid? " + validator.isValidBST(validRoot)); // true
        System.out.println("Is invalidRoot valid? " + validator.isValidBST(invalidRoot)); // false
    }
}
