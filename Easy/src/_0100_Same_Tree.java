public class _0100_Same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean left = isSameTree(p.left , q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }

    public static void main(String[] args) {
        TreeNode node1_1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode node1_2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(node1_1, node1_2));

        TreeNode node2_1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode node2_2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(isSameTree(node2_1, node2_2));

        TreeNode node3_1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode node3_2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(isSameTree(node3_1, node3_2));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


