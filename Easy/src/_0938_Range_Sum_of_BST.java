import java.util.LinkedList;
import java.util.Queue;

public class _0938_Range_Sum_of_BST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode poll = queue.remove();
            if (poll.val >= low && poll.val <= high) {
                sum += poll.val;
            }
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode node1_5 = new TreeNode(5, new TreeNode(3), new TreeNode(7));
        TreeNode node1_15 = new TreeNode(15, null, new TreeNode(18));
        TreeNode root1 = new TreeNode(10, node1_5, node1_15);
        System.out.println(rangeSumBST(root1, 7, 15));

        TreeNode node2_3 = new TreeNode(3, new TreeNode(1), null);
        TreeNode node2_7 = new TreeNode(7, new TreeNode(6), null);
        TreeNode node2_5 = new TreeNode(5, node2_3, node2_7);
        TreeNode node2_15 = new TreeNode(15, new TreeNode(13), new TreeNode(18));
        TreeNode root2 = new TreeNode(10, node2_5, node2_15);
        System.out.println(rangeSumBST(root2, 6, 10));
    }
}
