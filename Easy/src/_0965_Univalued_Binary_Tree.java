import java.util.ArrayList;
import java.util.List;

public class _0965_Univalued_Binary_Tree {
    private static final List<Integer> values = new ArrayList<>();
    public static boolean isUnivalTree(TreeNode root) {
        getValues(root);
        int firstValue = values.get(0);
        for (int value : values) {
            if (value != firstValue) {
                return false;
            }
        }
        return true;
    }

    private static void getValues(TreeNode root) {
        if (root != null) {
            values.add(root.val);
            getValues(root.left);
            getValues(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        TreeNode node2 = new TreeNode(1, null, new TreeNode(1));
        TreeNode root1 = new TreeNode(1, node1, node2);
        System.out.println(isUnivalTree(root1));

        TreeNode node3 = new TreeNode(2, new TreeNode(5), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, node3, new TreeNode(2));
        System.out.println(isUnivalTree(root2));
    }
}
