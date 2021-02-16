import java.util.ArrayList;
import java.util.List;

public class _0783_Minimum_Distance_Between_BST_Nodes {
    public static int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int diff = Integer.MAX_VALUE;
        for (int i = 1 ; i < list.size() ; i++) {
            diff = Math.min(diff, list.get(i) - list.get(i - 1));
        }
        return diff;
    }

    private static void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode node1_2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root1 = new TreeNode(4, node1_2, new TreeNode(6));
        System.out.println(minDiffInBST(root1));

        TreeNode node2_48 = new TreeNode(48, new TreeNode(12), new TreeNode(49));
        TreeNode root2 = new TreeNode(1, new TreeNode(0), node2_48);
        System.out.println(minDiffInBST(root2));
    }
}
