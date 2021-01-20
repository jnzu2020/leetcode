public class _0669_Trim_a_Binary_Search_Tree {
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        System.out.println(trimBST(root1, 1, 2));

        TreeNode node2 = new TreeNode(2, new TreeNode(1), null);
        TreeNode node0 = new TreeNode(0, null, node2);
        TreeNode root2 = new TreeNode(3, node0, new TreeNode(4));
        System.out.println(trimBST(root2, 1, 3));
    }
}
