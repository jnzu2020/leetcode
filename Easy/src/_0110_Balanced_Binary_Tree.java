public class _0110_Balanced_Binary_Tree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHight(root) != -1;
    }

    public static int getHight(TreeNode node) {
        int hight = 0;
        if (node == null) {
            return hight;
        }
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = getHight(node.left);
        }
        if (node.right != null) {
            right = getHight(node.right);
        }

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode1_2 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode1_1 = new TreeNode(3, new TreeNode(9), treeNode1_2);
        System.out.println(isBalanced(treeNode1_1));

        TreeNode treeNode2_3 = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        TreeNode treeNode2_2 = new TreeNode(2, treeNode2_3, new TreeNode(3));
        TreeNode treeNode2_1 = new TreeNode(1, treeNode2_2, new TreeNode(2));
        System.out.println(isBalanced(treeNode2_1));

    }
}
