public class _0543_Diameter_of_Binary_Tree {
    private static int diameter;
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getDepth(root);
        return diameter;
    }

    private static int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        diameter = Math.max(diameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode root = new TreeNode(1, node, new TreeNode(3));
        System.out.println(diameterOfBinaryTree(root));
    }
}
