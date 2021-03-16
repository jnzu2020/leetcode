import java.util.ArrayList;
import java.util.List;

public class _0897_Increasing_Order_Search_Tree {
    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        TreeNode result = new TreeNode();
        TreeNode current = result;
        for (int value : list) {
            current.right = new TreeNode(value);
            current = current.right;
        }
        return result.right;
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
        TreeNode node1_2 = new TreeNode(2, new TreeNode(1), null);
        TreeNode node1_3 = new TreeNode(3, node1_2, new TreeNode(4));
        TreeNode node1_8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode node1_6 = new TreeNode(6, null, node1_8);
        TreeNode root1 = new TreeNode(5, node1_3, node1_6);
        System.out.println(increasingBST(root1));

        TreeNode root2 = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        System.out.println(increasingBST(root2));
    }
}
