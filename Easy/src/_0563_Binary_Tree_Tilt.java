public class _0563_Binary_Tree_Tilt {
    private static int sum = 0;
    public static int findTilt(TreeNode root) {
        sum = 0;
        getSumOfNode(root);
        return sum;
    }

    private static int getSumOfNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getSumOfNode(node.left);
        int right = getSumOfNode(node.right);
        sum += Math.abs(left - right);
        return node.val + left + right;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(findTilt(root1));

        TreeNode treeNode2_2 = new TreeNode(2, new TreeNode(3), new TreeNode(5));
        TreeNode treeNode2_9 = new TreeNode(9, null, new TreeNode(7));
        TreeNode root2 = new TreeNode(4, treeNode2_2, treeNode2_9);
        System.out.println(findTilt(root2));

        TreeNode treeNode3_1 = new TreeNode(1, new TreeNode(3), new TreeNode(3));
        TreeNode treeNode3_7 = new TreeNode(7, treeNode3_1, new TreeNode(1));
        TreeNode treeNode3_14 = new TreeNode(14, new TreeNode(2), new TreeNode(2));
        TreeNode root3 = new TreeNode(21, treeNode3_7, treeNode3_14);
        System.out.println(findTilt(root3));
    }
}
