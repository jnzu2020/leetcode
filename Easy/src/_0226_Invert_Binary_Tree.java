public class _0226_Invert_Binary_Tree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode treeNode3 = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        TreeNode treeNode1 = new TreeNode(4, treeNode2, treeNode3);
        System.out.println(invertTree(treeNode1));
    }
}
