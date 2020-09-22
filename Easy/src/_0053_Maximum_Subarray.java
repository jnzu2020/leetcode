public class _0053_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2));

        int[] nums3 = {0};
        System.out.println(maxSubArray(nums3));

        int[] nums4 = {-1};
        System.out.println(maxSubArray(nums4));

        int[] nums5 = {-2147483647};
        System.out.println(maxSubArray(nums5));

        int[] nums6 = {-2, -1};
        System.out.println(maxSubArray(nums6));
    }
}
