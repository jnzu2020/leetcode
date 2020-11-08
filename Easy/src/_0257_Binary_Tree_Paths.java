import java.util.ArrayList;
import java.util.List;

public class _0257_Binary_Tree_Paths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        getBinaryTreePath(root, result, "");
        return result;
    }

    private static void getBinaryTreePath(TreeNode root, List<String> paths, String path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path += root.val;
            paths.add(path);
            return;
        }
        getBinaryTreePath(root.left, paths, path + root.val + "->");
        getBinaryTreePath(root.right, paths, path + root.val + "->");
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, null, new TreeNode(5));
        TreeNode root = new TreeNode(1, treeNode2, new TreeNode(3));
        System.out.println(binaryTreePaths(root));
    }
}
