public class _0617_Merge_Two_Binary_Trees {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode node1_3 = new TreeNode(3, new TreeNode(5), null);
        TreeNode root1 = new TreeNode(1, node1_3, new TreeNode(2));

        TreeNode node2_1 = new TreeNode(1, null, new TreeNode(4));
        TreeNode node2_3 = new TreeNode(3, null, new TreeNode(7));
        TreeNode root2 = new TreeNode(2, node2_1, node2_3);
        System.out.println(mergeTrees(root1, root2));
    }
}
