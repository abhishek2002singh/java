public class countofnode {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int lcount = countNode(root.left);
        int rcount = countNode(root.right);
        return lcount + rcount + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(countNode(root));
    }
}
