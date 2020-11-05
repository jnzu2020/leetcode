public class _0235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int valueOfRoot = root.val;
        int valueOfP = p.val;
        int valueOfQ = q.val;
        if ((valueOfP > valueOfRoot) && (valueOfQ > valueOfRoot)) {
            return lowestCommonAncestor(root.right, p, q);
        } else if ((valueOfP < valueOfRoot) && (valueOfQ < valueOfRoot)) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode node2 = new TreeNode(2, new TreeNode(0), node4);
        TreeNode node8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode root = new TreeNode(6, node2, node8);
        System.out.println(lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));
        System.out.println(lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)));

        TreeNode root2 = new TreeNode(2, new TreeNode(1), null);
        System.out.println(lowestCommonAncestor(root2, new TreeNode(2), new TreeNode(1)));
    }
}
