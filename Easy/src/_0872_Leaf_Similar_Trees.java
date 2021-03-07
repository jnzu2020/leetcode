import java.util.ArrayList;
import java.util.List;

public class _0872_Leaf_Similar_Trees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = new ArrayList<>();
        List<Integer> root2List = new ArrayList<>();
        getLeaf(root1, root1List);
        getLeaf(root2, root2List);
        if (root1List.size() != root2List.size()) {
            return false;
        } else {
            for (int i = 0 ; i < root1List.size() ; i++) {
                if (!root1List.get(i).equals(root2List.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static void getLeaf(TreeNode node, List<Integer> list) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                list.add(node.val);
            }
            if (node.left != null) {
                getLeaf(node.left, list);
            }
            if (node.right != null) {
                getLeaf(node.right, list);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node1_2 = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        TreeNode node1_5 = new TreeNode(5, new TreeNode(6), node1_2);
        TreeNode node1_1 = new TreeNode(1, new TreeNode(9), new TreeNode(8));
        TreeNode node1_root1 = new TreeNode(3, node1_5, node1_1);

        TreeNode node2_5 = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        TreeNode node2_2 = new TreeNode(2, new TreeNode(9), new TreeNode(8));
        TreeNode node2_1 = new TreeNode(1, new TreeNode(4), node2_2);
        TreeNode node1_root2 = new TreeNode(3, node2_5, node2_1);
        System.out.println(leafSimilar(node1_root1, node1_root2));

        System.out.println(leafSimilar(new TreeNode(1), new TreeNode(1)));

        System.out.println(leafSimilar(new TreeNode(1), new TreeNode(2)));

        System.out.println(leafSimilar(new TreeNode(1, new TreeNode(2), null),
                new TreeNode(2, new TreeNode(2), null)));

        System.out.println(leafSimilar(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(3), new TreeNode(2))));
    }
}
