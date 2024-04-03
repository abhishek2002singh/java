public class hightoftree {
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

    public static int hightofgiventree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = hightofgiventree(root.left);
        int rh = hightofgiventree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println(hightofgiventree(root));
    }
}
