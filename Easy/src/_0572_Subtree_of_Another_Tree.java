public class _0572_Subtree_of_Another_Tree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        return check(s, t);
    }

    private static boolean isEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isEqual(node1.left, node2.left) && isEqual(node1.right, node2.right);
    }

    private static boolean check(TreeNode node1, TreeNode node2) {
        return node1 != null && (isEqual(node1, node2) || check(node1.left, node2) || check(node1.right, node2));
    }

    public static void main(String[] args) {
        TreeNode s1_4 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode s1_root = new TreeNode(3, s1_4, new TreeNode(5));
        TreeNode t_root = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.println(isSubtree(s1_root, t_root));

        TreeNode s2_2 = new TreeNode(2, new TreeNode(0), null);
        TreeNode s2_4 = new TreeNode(4, new TreeNode(1), s2_2);
        TreeNode s2_root = new TreeNode(3, s2_4, new TreeNode(5));
        System.out.println(isSubtree(s2_root, t_root));
    }
}
