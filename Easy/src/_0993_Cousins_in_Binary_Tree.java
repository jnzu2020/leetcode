public class _0993_Cousins_in_Binary_Tree {
    public static boolean isCousins(TreeNode root, int x, int y) {
        int[] getDepthAndParentOfX = getDepthAndParent(root, x, 0, root.val);
        int[] getDepthAndParentOfY = getDepthAndParent(root, y, 0, root.val);
        return (getDepthAndParentOfX[0] == getDepthAndParentOfY[0]) &&
                (getDepthAndParentOfX[1] != getDepthAndParentOfY[1]);
    }

    private static int[] getDepthAndParent(TreeNode root, int value, int depth, int parent) {
        if (root == null) {
            return new int[]{-1, -1};
        }
        if (root.val == value) {
            return new int[]{depth, parent};
        }
        int[] left = getDepthAndParent(root.left, value, depth + 1, root.val);
        int[] right = getDepthAndParent(root.right, value, depth + 1, root.val);
        return left[0] == -1 ? right : left;
    }

    public static void main(String[] args) {
        TreeNode node1_2 = new TreeNode(2, new TreeNode(4), null);
        TreeNode root1 = new TreeNode(1, node1_2, new TreeNode(3));
        System.out.println(isCousins(root1, 4, 3));

        TreeNode node2_2 = new TreeNode(2, null, new TreeNode(4));
        TreeNode node2_3 = new TreeNode(3, null, new TreeNode(5));
        TreeNode root2 = new TreeNode(1, node2_2, node2_3);
        System.out.println(isCousins(root2, 5, 4));

        TreeNode node3_2 = new TreeNode(2, null, new TreeNode(4));
        TreeNode root3 = new TreeNode(1, node3_2, new TreeNode(3));
        System.out.println(isCousins(root3, 2, 3));
    }
}
