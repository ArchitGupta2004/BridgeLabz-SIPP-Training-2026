public class LongestCommunicationPath {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }

    int diameter = 0;

    public int longestCommunicationPath(Node root) {
        diameter = 0;
        heightAndUpdateDiameter(root);
        return diameter;
    }

    private int heightAndUpdateDiameter(Node node) {
        if (node == null) return -1;
        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.right.right = new Node(7);

        LongestCommunicationPath lcp = new LongestCommunicationPath();
        System.out.println("Longest Communication Path (Diameter): " + lcp.longestCommunicationPath(root));
    }
}
