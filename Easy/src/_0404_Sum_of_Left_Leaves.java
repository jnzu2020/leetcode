public class _0404_Sum_of_Left_Leaves {
    private static int sum = 0;
    public static int sumOfLeftLeaves(TreeNode root) {
        findLeavesSum(root, false);
        return sum;
    }

    private static void findLeavesSum(TreeNode treeNode, boolean isLeft) {
        if (treeNode != null) {
            if (treeNode.left == null && treeNode.right == null) {
                if (isLeft) {
                    sum += treeNode.val;
                }
            } else {
                findLeavesSum(treeNode.left, true);
                findLeavesSum(treeNode.right, false);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), treeNode);
        System.out.println(sumOfLeftLeaves(root));
    }
}
