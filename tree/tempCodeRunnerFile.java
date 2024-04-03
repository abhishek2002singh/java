   public static void preordertree(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preordertree(root.left);
            preordertree(root.right);
        }