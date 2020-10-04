public class _0111_Minimum_Depth_of_Binary_Tree {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }
        if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode1 = new TreeNode(3, new TreeNode(9), treeNode2);
        System.out.println(minDepth(treeNode1));
    }
}
