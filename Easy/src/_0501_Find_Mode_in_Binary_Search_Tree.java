import java.util.*;

public class _0501_Find_Mode_in_Binary_Search_Tree {
    public static int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        count(root, map);
        int max = 0;
        for (int count : map.values()) {
            max = Math.max(max, count);
        }
        List<Integer> list = new ArrayList<>();
        for (int val : map.keySet()) {
            if (map.get(val) == max) {
                list.add(val);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (int element : list) {
            result[index++] = element;
        }
        return result;
    }

    private static void count(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        if (map.containsKey(node.val)) {
            map.put(node.val, (map.get(node.val) + 1));
        } else {
            map.put(node.val, 1);
        }
        if (node.left != null) {
            count(node.left, map);
        }
        if (node.right != null) {
            count(node.right, map);
        }
    }

    public static void main(String[] args) {
        TreeNode node1_1 = new TreeNode(2, new TreeNode(2), null);
        TreeNode root1 = new TreeNode(1, null, node1_1);
        System.out.println(Arrays.toString(findMode(root1)));

        TreeNode node2_1 = new TreeNode(3, new TreeNode(1), new TreeNode(3));
        TreeNode node2_2 = new TreeNode(3, new TreeNode(1), node2_1);
        TreeNode root2 = new TreeNode(1, null, node2_2);
        System.out.println(Arrays.toString(findMode(root2)));
    }
}
