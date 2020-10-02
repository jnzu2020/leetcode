public class _0108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return addNode(0, nums.length - 1, nums);
    }

    private static TreeNode addNode(int startIndex, int endIndex, int[] nums) {
        if (startIndex > endIndex) {
            return null;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        TreeNode newNode = new TreeNode(nums[middleIndex]);
        newNode.left = addNode(startIndex, middleIndex - 1,  nums);
        newNode.right = addNode(middleIndex + 1, endIndex,  nums);
        return newNode;
    }

    public static void main(String[] args) {
        int[] nums1 = {-10,-3,0,5,9};
        System.out.println(_0107_Binary_Tree_Level_Order_Traversal_II.levelOrderBottom(sortedArrayToBST(nums1)));

        int[] nums2 = {0,1,2,3,4,5};
        System.out.println(_0107_Binary_Tree_Level_Order_Traversal_II.levelOrderBottom(sortedArrayToBST(nums2)));
    }
}
