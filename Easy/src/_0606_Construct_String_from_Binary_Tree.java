public class _0606_Construct_String_from_Binary_Tree {
    public static String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return t.val + "";
        }
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }

        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }

    public static void main(String[] args) {
        TreeNode node1_2 = new TreeNode(2, new TreeNode(4), null);
        TreeNode root1 = new TreeNode(1, node1_2, new TreeNode(3));
        System.out.println(tree2str(root1));

        TreeNode node2_2 = new TreeNode(2, null, new TreeNode(4) );
        TreeNode root2 = new TreeNode(1, node2_2, new TreeNode(3));
        System.out.println(tree2str(root2));
    }
}
