public class _0104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode1 = new TreeNode(3, new TreeNode(9), treeNode2);
        System.out.println(maxDepth(treeNode1));
    }
}
