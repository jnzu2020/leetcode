public class _0101_Symmetric_Tree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetric(root.left, root.right);
        }
    }

    private static boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else if (node1.val == node2.val) {
            return (isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1_left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode treeNode1_right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        TreeNode treeNode1_top = new TreeNode(1, treeNode1_left, treeNode1_right);
        System.out.println(isSymmetric(treeNode1_top));

        TreeNode treeNode2_left = new TreeNode(2, null, new TreeNode(3));
        TreeNode treeNode2_right = new TreeNode(2, null, new TreeNode(3));
        TreeNode treeNode2_top = new TreeNode(1, treeNode2_left, treeNode2_right);
        System.out.println(isSymmetric(treeNode2_top));
    }

}
