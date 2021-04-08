import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class _0107_Binary_Tree_Level_Order_Traversal_II {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> listOfNode = new ArrayList<>();
            for (int i = 0 ; i < size ; i++) {
                TreeNode node = queue.poll();
                listOfNode.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(0, listOfNode);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode treeNode1 = new TreeNode(3, new TreeNode(9), treeNode2);
        System.out.println(levelOrderBottom(treeNode1));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
