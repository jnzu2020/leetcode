import java.util.Arrays;

public class _0268_Missing_Number {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] == nums.length - 1) {
            return nums.length;
        }

        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i] - nums[i-1] != 1) {
                return nums[i] - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        System.out.println(missingNumber(nums1));

        int[] nums2 = {0,1};
        System.out.println(missingNumber(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3));

        int[] nums4 = {0};
        System.out.println(missingNumber(nums4));
    }
}
