import java.util.*;

public class _0671_Second_Minimum_Node_In_a_Binary_Tree {
    public static int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> values = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode remove = queue.remove();
            if (!values.contains(remove.val)) {
                values.add(remove.val);
            }
            if (remove.left != null) {
                queue.add(remove.left);
            }
            if (remove.right != null) {
                queue.add(remove.right);
            }
        }
        Collections.sort(values);
        if (values.size() == 1) {
            return -1;
        } else {
            return values.get(1);
        }
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5, new TreeNode(5), new TreeNode(7));
        TreeNode root1 = new TreeNode(2, new TreeNode(2), node5);
        System.out.println(findSecondMinimumValue(root1));

        TreeNode root2 = new TreeNode(2, new TreeNode(2), new TreeNode(2));
        System.out.println(findSecondMinimumValue(root2));
    }
}
