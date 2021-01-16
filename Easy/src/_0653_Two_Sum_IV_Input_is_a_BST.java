import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0653_Two_Sum_IV_Input_is_a_BST {
    public static boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> values = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode remove = queue.remove();
            values.add(remove.val);
            if (remove.left != null) {
                queue.add(remove.left);
            }
            if (remove.right != null) {
                queue.add(remove.right);
            }
        }
        for (int i = 0 ; i < values.size() ; i++) {
            int diff = k - values.get(i);
            if (values.contains(diff) && (values.indexOf(diff) != i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode node6 = new TreeNode(6, null, new TreeNode(7));
        TreeNode root1 = new TreeNode(5, node3, node6);
        System.out.println(findTarget(root1, 9));
        System.out.println(findTarget(root1, 28));

        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(findTarget(root2, 4));
        System.out.println(findTarget(root2, 1));
        System.out.println(findTarget(root2, 3));

        TreeNode root3 = new TreeNode(1);
        System.out.println(findTarget(root3, 2));
    }
}
