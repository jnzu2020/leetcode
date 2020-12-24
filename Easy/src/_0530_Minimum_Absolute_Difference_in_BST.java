import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _0530_Minimum_Absolute_Difference_in_BST {
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                list.add(node.val);
                stack.add(node.left);
                stack.add(node.right);
            }
        }
        Collections.sort(list);
        int min = Math.abs(list.get(1) - list.get(0));
        for (int i = 1; i < list.size() - 1; i++) {
            int difference = Math.abs(list.get(i + 1) - list.get(i));
            min = Math.min(min, difference);
        }
        return min;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3, new TreeNode(2), null);
        TreeNode root = new TreeNode(1, null, node);
        System.out.println(getMinimumDifference(root));
    }
}
