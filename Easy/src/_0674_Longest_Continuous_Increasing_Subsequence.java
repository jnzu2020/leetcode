public class _0674_Longest_Continuous_Increasing_Subsequence {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        int length = 1;
        for (int i = 0 ; i < nums.length - 1 ; i++) {
            if (nums[i + 1] > nums[i]) {
                length++;
            } else {
                result = Math.max(result, length);
                length = 1;
            }
        }
        return Math.max(result, length);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums1));

        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println(findLengthOfLCIS(nums2));

        int[] nums3 = {1, 3, 5, 4, 2, 3, 4, 5};
        System.out.println(findLengthOfLCIS(nums3));
    }
}
