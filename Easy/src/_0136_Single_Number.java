import java.util.Arrays;

public class _0136_Single_Number {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length - 1 ; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        if (nums[nums.length - 2] != nums[nums.length - 1]) {
            return nums[nums.length - 1];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        System.out.println(singleNumber(nums1));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3));

        int[] nums4 = {1,4,4,2,2,1,6,3,6};
        System.out.println(singleNumber(nums4));
    }
}
