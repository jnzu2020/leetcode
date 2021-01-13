import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0637_Average_of_Levels_in_Binary_Tree {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode remove = queue.remove();
                sum += remove.val;
                count++;
                if (remove.left != null) {
                    temp.add(remove.left);
                }
                if (remove.right != null) {
                    temp.add(remove.right);
                }
            }
            result.add(sum / count);
            queue = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node20 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), node20);
        System.out.println(averageOfLevels(root));
    }
}
