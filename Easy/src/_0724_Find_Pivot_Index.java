public class _0724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0 ; i < nums.length ; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums1));

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));

        int[] nums3 = {2, 1, -1};
        System.out.println(pivotIndex(nums3));
    }
}
