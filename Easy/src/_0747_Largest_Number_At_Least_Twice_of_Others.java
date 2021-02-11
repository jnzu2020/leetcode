public class _0747_Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int dominantIndex = 0;
        int maxNum = nums[0];
        for (int i = 0 ; i < nums.length ; i++) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
                dominantIndex = i;
            }
        }
        for (int i = 0 ; i < nums.length ; i++) {
            if ((dominantIndex != i) && (maxNum < nums[i] * 2)) {
                return -1;
            }
        }
        return dominantIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(dominantIndex(nums2));
    }
}
