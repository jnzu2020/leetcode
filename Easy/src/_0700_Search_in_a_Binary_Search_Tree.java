public class _0700_Search_in_a_Binary_Search_Tree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root = new TreeNode(4, node2, new TreeNode(7));
        System.out.println(searchBST(root, 2));
        System.out.println(searchBST(root, 5));
    }
}
