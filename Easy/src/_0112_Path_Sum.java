public class _0112_Path_Sum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode treeNode4 = new TreeNode(4, null, new TreeNode(1));
        TreeNode treeNode3 = new TreeNode(4, treeNode5, null);
        TreeNode treeNode2 = new TreeNode(8, new TreeNode(13), treeNode4);
        TreeNode treeNode1 = new TreeNode(5, treeNode3, treeNode2);
        int sum = 22;
        System.out.println(hasPathSum(treeNode1, sum));
    }
}
